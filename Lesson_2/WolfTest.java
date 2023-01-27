public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex("Мужской");
        wolfOne.setName("Дьюк");
        wolfOne.setWeight(10);
        wolfOne.setAge(9);
        wolfOne.setColor("Красный");
        System.out.println("Пол: " + wolfOne.getSex());
        System.out.println("Имя: " + wolfOne.getName());
        System.out.println("Вес: " + wolfOne.getWeight());
        System.out.println("Возраст: " + wolfOne.getAge());
        System.out.println("Окрас: " + wolfOne.getColor());
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}