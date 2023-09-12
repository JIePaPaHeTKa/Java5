public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 187;
        int weight = 98;
        int bmi = service.calculate(weight, height);
        System.out.println("Расчитанный индекс массы тела составил: " + bmi);
    }
}