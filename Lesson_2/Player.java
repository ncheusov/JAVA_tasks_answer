public class Player {

    String sex = "male";
    String name = "John";
    float height = 1.80f;
    int weight = 60;
    int age = 26;

    String walk() {
        return "walking";
    }

    boolean sit() {
        return false;
    }

    void run() {
        System.out.println("running");
    }

    boolean talk() {
        return true;
    }

    void learn() {
        System.out.println("learning");
    }
}