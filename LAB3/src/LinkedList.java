import java.util.Iterator;
import java.util.Stack;

//Programa que vai iterando por uma lista e adiciona um elemento qualquer na ultima posicao da lista
public class LinkedList<T> implements Iterable <T> {
	
	private class Node{
		private T item;
		private Node next;
		
	}
	
	private Node first;
	private int size;
	
	public LinkedList() {
		this.first = null;
		this.size = 0;
	}
	
	public void addrigth(T item) {
		Node currentnode = this.first;
		
		while(currentnode.next != null) {
			currentnode = currentnode.next;//esta variavel aponta para o ultimo elemento da lista
		}
		
		this.first = new Node(); //crio um novo no no heap (por causa do new ...)
		item = this.first.item;
		currentnode = this.first.next;//agr o currentnode ja vai representar o proximo elemento da lista
		this.size++;//aumento o tamanho pq foi criado um novo no
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}
	
	public class Node{
		private INTEGER item;
		private Node next;
		private Node next;
	}
	

	//PERGUNTA 3.1.1
	
	
	public void linkedListDestrutiva() {
		Node current;
		Node next;
		Node previous;
		
		if(this.size <= 1) {
			return;
		}
		
		current = this.first.next; //vai comecar no segundo elemento
		previous = this.first;
		current = null; //este vai ser o ultimo elemento quando retornar atras logo nao vai apontar para nenhum lado
		
		while(current.next != null) {
			next = current.next;
			previous = current;
			current = next;
		}
		
		current.next = previous;
		current = this.first;
	}
	
	
	//PERGUNTA 3.2.4
	
	
	Stack<String> stack = new Stack<String>();	
    
	public boolean parenteses(String texto) {
		
		Stack<Character> pilha = new Stack<Character>();
		
		for(char c: texto.toCharArray()) {
			if(c == '(' || c == '[' || c == '{') {
				pilha.push(c);
			}
			else if (c == ')') {
				if(pilha.isEmpty() || pilha.pop() != '(') return false;
			}
			else if (c == ']') {
				if(pilha.isEmpty() || pilha.pop() != '[') return false;
			}
			else if (c == '}') {
				if(pilha.isEmpty() || pilha.pop() != '}') return false;
			}
		}
		return pilha.isEmpty();
		
	}
	

	public static void main(String[] args) {
		String teste = {"()[{)[]()]]([{}"};
		System.out.println(parenteses(teste));
	}

}
