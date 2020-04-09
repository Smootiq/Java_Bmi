public class BmiService {
    public long calculate(double height, double mass) {
        long index = (long) (height * height / height);
        return index;
}
}
