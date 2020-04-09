public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 98;
        double height = 1.71;
        long index = service.calculate(height, mass);
        System.out.println(index);
    }
}