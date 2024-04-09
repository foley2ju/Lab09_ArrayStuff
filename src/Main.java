import java.util.Scanner;
import java.util.Random;

public class Main {
    public static double main(String[] args) {

        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        System.out.print("Datapoints: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);

            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // --------------------------------------------------------------------------------

        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }

        double avg = (double) sum / dataPoints.length;
        System.out.println("Array average: " + avg);
        System.out.println("Array sum: " + sum);

        int userVal = SafeInput.getRangedInt(in,"Enter an integer [1-100]: ", 1, 100);
        int count = 0;

        for (int value : dataPoints) {
            if (value == userVal) {
                count ++;
            }
        }

        System.out.println("User value was found " + count + " times in the array.");

        int userVal2 = SafeInput.getRangedInt(in,"Enter an integer [1-100]: ", 1, 100);
        int position = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userVal2) {
                position = 1;
                break;
            }
        }

        if (position != -1) {
            System.out.println("The value " + userVal2 + " is located at index " + position);
        } else {
            System.out.println("The value " + userVal2 + " was not found.");
        }

        //----------------------------------------------------------------------------------

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int value : dataPoints) {
            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }

            System.out.println("Minimum value: " + min);
            System.out.println("Maximum value: " + max);


            public static double getAverage(int _values[]) {
                int _sum = 0;
                for (int _value : _values) {
                    _sum += value;
                }

                return (double) sum / _values.length;
            }

            System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

        }
    }
}