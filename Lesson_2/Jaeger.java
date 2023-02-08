public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {

    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
        if (modelName == "") {
            System.out.println("Пустая строка");
        } else {
            this.modelName = modelName;
        }
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (modelName == "") {
            System.out.println("Пустая строка");
        } else {
            this.modelName = modelName;
        }
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        if (mark == "") {
            System.out.println("Пустая строка");
        } else {
            this.mark = mark;
        }
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height <= 0) {
            System.out.println("Высота робота не может быть ниже или равна нулю!");
        } else {
            this.height = height;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight <= 0) {
            System.out.println("Вес робота не может быть ниже или равен нулю!");
        } else {
            this.weight = weight;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0) {
            System.out.println("Скорость не может быть меньше или равна нулю!");
        } else {
            this.speed = speed;
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength <= 0) {
            System.out.println("Сила не может быть меньше или равна нуля!");
        } else if (strength > 10) {
            System.out.println("Некоректное значение для силы");
        } else {
            this.strength = strength;
        }
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        if (armor <= 0) {
            System.out.println("Броня не может быть меньше нуля!");
        } else {
            this.armor = armor;
        }
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move(String modelName) {
        this.modelName = modelName;
        System.out.println(modelName + " moving");
    }

    public String scanKaiju() {
        return "scanning";
    }

    public void useWeapon(String weapon) {
        System.out.println(weapon + " activated");
    }
}