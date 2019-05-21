package refactoring_guru.singleton;

class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // Этот код эмулирует медленную инициализацию.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }

        return instance;
    }
}

public class Demo {
    public static void main(String[] args) {
        System.out.println("If you see the sam value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (boooo!)" + "\n\n" +
                "RESULT:" + "\n");

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
