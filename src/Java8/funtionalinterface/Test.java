package Java8.funtionalinterface;

@FunctionalInterface
interface Itr{
	
	int add(int a, int b);
}

public class Test implements Itr {

	public static void main(String[] args) {
		Itr it = (a, b)-> a + b;
		int ans = it.add(10, 20);
		System.out.println(ans);
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
