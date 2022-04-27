public class Main {
    public static void main(String[] args) {

        int height = 172;
        int weight = 70;

        BmiService bmiService = new BmiService();

        int bmi = (int) bmiService.calculate(height, weight);

        System.out.println("Индекс массы тела: " +  bmi);
    }
}
