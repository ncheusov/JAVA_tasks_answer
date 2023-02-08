public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger("Bracer Pheonix", "Mark-3", "USA", 79.25f, 1.980f, 7, 8, 6);

        jaegerOne.setModelName("Crimson Typhoon");
        System.out.println("Имя: " + jaegerOne.getModelName());
        jaegerOne.setMark("Mark-4");
        System.out.println("Модель: " + jaegerOne.getMark());
        jaegerOne.setOrigin("China");
        System.out.println("Страна: " + jaegerOne.getOrigin());
        jaegerOne.setHeight(76.2f);
        System.out.println("Высота: " + jaegerOne.getHeight() + " метров");
        jaegerOne.setWeight(1.722f);
        System.out.println("Вес: " + jaegerOne.getWeight() + " тонн");
        jaegerOne.setSpeed(9);
        System.out.println("Скорость: " + jaegerOne.getSpeed());
        jaegerOne.setStrength(8);
        System.out.println("Сила: " + jaegerOne.getStrength());
        jaegerOne.setArmor(6);
        System.out.println("Броня: " + jaegerOne.getArmor());
        jaegerOne.drift();
        jaegerOne.move("Crimson Typhoon");
        jaegerOne.scanKaiju();
        jaegerOne.useWeapon("Plasmacaster");

        System.out.println("\nБыл: " + jaegerTwo.getModelName());
        jaegerTwo.setModelName("Gipsy Danger");
        System.out.println("Стал: " + jaegerTwo.getModelName());
        System.out.println("Модель: " + jaegerTwo.getMark());
        System.out.println("Страна: " + jaegerTwo.getOrigin());
        System.out.println("Высота: " + jaegerTwo.getHeight() + " метров");
        System.out.println("Вес: " + jaegerTwo.getWeight() + " тонн");
        jaegerTwo.setSpeed(8);
        System.out.println("Скорость: " + jaegerTwo.getSpeed());
        jaegerTwo.setStrength(9);
        System.out.println("Сила: " + jaegerTwo.getStrength());
        jaegerTwo.setArmor(4);
        System.out.println("Броня: " + jaegerTwo.getArmor());
        jaegerTwo.drift();
        jaegerTwo.move("Gipsy Danger");
        jaegerTwo.scanKaiju();
        jaegerTwo.useWeapon("Chain Sword");
    }
}