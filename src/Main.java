public class Main {
    public static void main(String[] args) {
        double[] numbers = {5, 2, 6, 4, 5, 15, 25};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1/numbers[i];
            System.out.println(sum);
        }

        System.out.println(sum);
    }
}