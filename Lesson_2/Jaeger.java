public class Jaeger {

    private String modelName = "Bracer Phoenix";
    private String mark = "Mark-5";
    private String origin = "USA";
    private float height = 70.7f;
    private float weight = 2.1f;
    private int strength = 8;
    private int armor = 9;

    // get - аксессор
    public String getModelName() {
        return modelName;
    }

    // set - мутатор
    void setModelName(String modelName) {
        if (modelName == "") {
            System.out.println("Пустая строка");
        } else {
            this.modelName = modelName;
        }
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("moving");
    }

    public String scanKaiju() {
        return "scanning";
    }

    public void useVortexCannon() {
        System.out.println("activated");
    }
}