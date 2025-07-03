import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("BMI Calculator");

        // initialize the scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("insert heigh in cm:");
        int heightCm = scanner.nextInt();
        System.out.println("insert weight in kg:");
        int weightKg = scanner.nextInt();

        // closes the scanner to release resources
        scanner.close();

        // convert the height from cm to meters
        double heightMeters = heightCm / 100.0;

        // BMI calculation
        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("Height in cm: " + heightCm);
        System.out.println("Height in meters: " + heightMeters);
        System.out.println("Weight in kg: " + weightKg);
        System.out.println("BMI is " + bmi);

        System.out.println("Rounded BMI is " + (int) bmi);

        System.out.println("Done!");
    }
}