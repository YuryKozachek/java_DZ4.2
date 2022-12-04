public class Main {
    public static void main(String[] args) {
        BmiService index = new BmiService();
        double indexBody = index.calculate(70, 1.70);
        System.out.println(indexBody);
    }
}
