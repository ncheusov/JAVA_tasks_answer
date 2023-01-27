public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.sex = "мужской";
        wolfOne.name = "Дьюк";
        wolfOne.weight = 10;
        wolfOne.age = 5;
        wolfOne.color = "черный";
        System.out.println("Пол: " + wolfOne.sex);
        System.out.println("Имя: " + wolfOne.name);
        System.out.println("Вес: " + wolfOne.weight);
        System.out.println("Возраст: " + wolfOne.age);
        System.out.println("Окрас: " + wolfOne.color);
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}