public class BmiService {
    public int calculate(int weight, int height) {
        int bmi = (weight * 10000/ (height * height));
    return  bmi;
    }
}
