package intefaceProblem;

interface itr1 {
	default void m1() {
		System.out.println("void m1() from Itr1");
	}
}

interface itr2 {
	default void m1() {
		System.out.println("void m1() from Itr2");
	}
}

class DefaultMethod implements itr1, itr2 {
	public static void main(String[] args) {
		itr1 i = new DefaultMethod();
		i.m1();
	}

	@Override
	public void m1() {
		itr1.super.m1();
	}
}
