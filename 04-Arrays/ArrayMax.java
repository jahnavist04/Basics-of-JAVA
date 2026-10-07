public class ArrayMax {
    public static void main(String[] args) {

        int[] numbers = {10, 50, 30, 80, 20};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum = " + max);
    }
}
