package designpattern.singleton;

class Singleton {

	private static Singleton single_instance;

	public String s;

	private Singleton() {
		s = "Hello I am a string part of Singleton class";
	}

	public static synchronized Singleton getInstance() {
		if (single_instance == null)
			single_instance = new Singleton();

		return single_instance;
	}
}

