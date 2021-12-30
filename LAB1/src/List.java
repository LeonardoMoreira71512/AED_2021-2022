import java.util.ArrayList;
import java.util.function.Predicate;

public class List {

	public static List<T> filtraLista(List<T> lista){
		
		List<T> resultado;
		resultado = new ArrayList<T>();
		
		for(int i = 0; i<lista.size();i++) {
			if(lista.get(i) < 10) {
				resultado.add(lista.get(i));
			}
		}
		return resultado;
		System.out.println(resultado);
	}
}
	/*public static<T> List filtraLista(List lista, Predicate<T> p){
		List result = new ArrayList<>();
		for(T t : lista) {
			if(p.test(t)) {
				result.add(t);
			}
		}
		return result;
	}
	
}
*/
