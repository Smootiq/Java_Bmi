public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 98;
        double height = 1.71;
        double index = service.calculate(height, mass);
        System.out.println(index);
    }
}