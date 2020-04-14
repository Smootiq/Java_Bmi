public class BmiService {
    public long calculate(double height, int mass) {
        int index1 = (int) (height * height);
        int index = mass / index1;
        return index;
    }
}
