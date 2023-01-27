public class Wolf {

    String sex;
    String name;
    int weight;
    int age;
    String color;

    boolean walk() {
        System.out.println("Идет");
        return true;
    }

    boolean sit() {
        System.out.println("Сидит");
        return false;
    }

    void run() {
        System.out.println("Бежит");
    }

    String howl() {
        System.out.println("Воет");
        return "Ааууу!";
    }

    String hunt() {
        System.out.println("Охотится");
        return "Ищу вкусного заяца :)";
    }
}