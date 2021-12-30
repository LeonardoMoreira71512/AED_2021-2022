public class Test {
	
	/*public static int soma(int a, int b) {
		return a + b;
	}

	public static float soma(float a, float b) {
		return a + b;
	}

	public static String soma(String a, String b) {
		return a.concat(b);
	}
	
	public static void main(String[] args)
	{
		int result = soma(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println(result);

	}
	
	public static int euclides(int x, int y) {
		while (x != y) {
			if (x < y)
				y -= x;
			else
				x -= y;
		}
		return x;
	}

	public static void main(String[] args) {
		int mdc;
		mdc = euclides(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println(mdc);
	}*/

	public static void main(String[] args) {
		
		String s1 = new String("ola");
		String s2 = new String("ola");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}

