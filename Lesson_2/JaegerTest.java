public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        System.out.println("moderName = " + jaegerOne.modelName);
        System.out.println("mark = " + jaegerOne.mark);
        System.out.println("strength = " + jaegerOne.strength);
        System.out.println(jaegerOne.drift());
    }
}