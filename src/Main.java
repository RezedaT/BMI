
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 58;
        double heightM = 1.75;
        int bmi = service.calculate(weightKg, heightM);
        System.out.println(bmi + " Индекс массы вашего тела");
    }
}