import java.util.Scanner;

public class BMICalculator {

    public static final int METRIC = 0;
    public static final int IMPERIAL = 1;

    public static double calculateBMI(int unitChoice, double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight and height must be positive values.");
        }

        if (unitChoice == METRIC) {
            // Metric (kg, meters)
            return weight / (height * height);
        } else if (unitChoice == IMPERIAL) {
            // Imperial (lbs, inches)
            return (703 * weight) / (height * height);
        } else {
            throw new IllegalArgumentException("Invalid unit choice.");
        }
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else if (bmi < 35) return "Obese";
        else return "Severely obese";
    }
	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("=== BMI Calculator ===");
            System.out.println("Choose unit system:");
            System.out.println("0 - Metric (kg, meters)");
            System.out.println("1 - Imperial (lbs, inches)");
            System.out.print("Enter choice: ");
            int unitChoice = scanner.nextInt();

            System.out.print("Enter weight: ");
            double weight = scanner.nextDouble();

            System.out.print("Enter height: ");
            double height = scanner.nextDouble();

            double bmi = calculateBMI(unitChoice, weight, height);
            String category = getBMICategory(bmi);

            System.out.printf("Your BMI is: %.2f%n", bmi);
            System.out.println("Category: " + category);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
		
    }
}