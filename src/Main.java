public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 98;
        double height = 1.71;
        int index = (int) service.calculate(height, mass);
        System.out.println(index);
    }
}