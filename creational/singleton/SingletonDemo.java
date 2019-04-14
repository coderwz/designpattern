class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance != null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println("==========Singleton==========");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
		System.out.println("are instance1 and instance2 equal: " + (instance1 == instance2));
    }
}