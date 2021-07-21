public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        double index = service.calculate(51, 1.68);
        System.out.println(index);
    }
}
