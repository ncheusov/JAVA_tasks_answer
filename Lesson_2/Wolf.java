public class Wolf {

    private String sex;
    private String name;
    private int weight;
    private int age;
    private String color;

    public String getSex() {
        return sex;
    }

    void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean walk() {
        System.out.println("Идет");
        return true;
    }

    public boolean sit() {
        System.out.println("Сидит");
        return false;
    }

    public void run() {
        System.out.println("Бежит");
    }

    public String howl() {
        System.out.println("Воет");
        return "Ааууу!";
    }

    public String hunt() {
        System.out.println("Охотится");
        return "Ищу вкусного заяца :)";
    }
}