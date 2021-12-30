import java.util.Random;

public class lab2 {

	 public static int threeSum(int[] a)   //SOMA DE 3 NUMEROS SEGUIDOS DE UM ARRAY PARA VER SE A SOMA ENTRE ELES DÁ 0
	    {
	        int N = a.length;
	        int count = 0;
	        for(int i = 0; i < N; i++)
	        {
	            for(int j = i+1; j < N; j++)
	            {
	                for(int k = j+1; k < N; k++)
	                {
	                    if(a[i]+a[j]+a[k] == 0)
	                        count++;
	                }
	            } 
	        }
	        return count;
	    }

	    public static int oneSum(int[] a) //APENAS CONTA O NUMERO DE VEZES QUE O 0 APARECE NO ARRAY
	    {
	        int N = a.length;

	        int count = 0;
	        for(int i = 0; i < N; i++)
	        {
	            if(a[i] == 0)
	                count++;
	        }

	        return count;
	    }

	    public static int twoSum(int[] a) //SOMA DE 2 NUMEROS SEGUIDOS DE UM ARRAY PARA VER SE A SOMA ENTRE ELES DÁ 0
	    {
	        int N = a.length;

	        int count = 0;
	        for(int i = 0; i < N; i++)
	        {
	            for(int j = i; j < N; j++)
	            {
	                if(a[i] + a[j] == 0)
	                    count++;
	            }
	        }

	        return count;
	    }

	    public static int[] generateExample(int n) // VAI ME RETORNAR UM ARRAY COM TODOS OS NUMEROS QUE O USER INSERIR
	                                               //DEPENDENDO DO ARGUMENTO int n QUE IRÁ REPRESENTAR O NUMERO TOTAL
	                                               // DE NUMEROS QUE O USER TEM DE INSERIR
	    {
	        Random r = new Random();
	        int [] examples = new int[n];

	        for(int i = 0;  i < n; i++)
	        {
	            examples[i] = r.nextInt();
	        }

	        return examples;
	    }

	    public static double calculateAverageExecutionTime(int n)
	    {
	        int trials = 30;
	        double totalTime = 0;
	        
	        return 0;  
	    }


}
