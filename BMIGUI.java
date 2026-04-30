import javax.swing.*;
import java.awt.*;

public class BMIGUI extends JFrame {

    private JTextField weightField;
    private JTextField heightField;
    private JComboBox<String> unitBox;
    private JLabel resultLabel;
    private JLabel categoryLabel;

    public BMIGUI() {
        setTitle("BMI Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBackground(new Color(240, 248, 255));

        JLabel unitLabel = new JLabel("Unit:");
        unitBox = new JComboBox<>(new String[]{"Metric (kg, m)", "Imperial (lbs, in)"});

        JLabel weightLabel = new JLabel("Weight:");
        weightField = new JTextField();

        JLabel heightLabel = new JLabel("Height:");
        heightField = new JTextField();

        JButton calculateBtn = new JButton("Calculate");
        JButton clearBtn = new JButton("Clear");

        resultLabel = new JLabel("BMI: ");
        categoryLabel = new JLabel("Category: ");

        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        categoryLabel.setFont(new Font("Arial", Font.BOLD, 16));

        resultLabel.setHorizontalAlignment(JLabel.CENTER);
        categoryLabel.setHorizontalAlignment(JLabel.CENTER);

        panel.add(unitLabel);
        panel.add(unitBox);
        panel.add(weightLabel);
        panel.add(weightField);
        panel.add(heightLabel);
        panel.add(heightField);
        panel.add(calculateBtn);
        panel.add(clearBtn);
        panel.add(resultLabel);
        panel.add(categoryLabel);

        add(panel);

        calculateBtn.addActionListener(e -> calculateBMI());
        clearBtn.addActionListener(e -> clearFields());
    }

    private void calculateBMI() {
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());

            if (weight <= 0 || height <= 0) {
                throw new NumberFormatException();
            }

            int unitChoice = unitBox.getSelectedIndex();

            double bmi = BMICalculator.calculateBMI(unitChoice, weight, height);
            String category = BMICalculator.getBMICategory(bmi);

            resultLabel.setText(String.format("BMI: %.2f", bmi));
            categoryLabel.setText("Category: " + category);
         
            // Color coding
            if (bmi < 18.5) {
                categoryLabel.setForeground(Color.BLUE);
            } else if (bmi < 25) {
                categoryLabel.setForeground(Color.GREEN);
            } else if (bmi < 30) {
                categoryLabel.setForeground(Color.ORANGE);
            } else {
                categoryLabel.setForeground(Color.RED);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter valid positive numbers!");
        }
    }

    private void clearFields() {
        weightField.setText("");
        heightField.setText("");
        resultLabel.setText("BMI: ");
        categoryLabel.setText("Category: ");
        categoryLabel.setForeground(Color.BLACK);
    }

    public static void main(String[] args) {
        new BMIGUI().setVisible(true);
    }
}

// Helper class
class BMICalculator {

    public static double calculateBMI(int unitChoice, double weight, double height) {
        if (unitChoice == 0) {
            // Metric: kg, meters
            return weight / (height * height);
        } else {
            // Imperial: lbs, inches
            return (703 * weight) / (height * height);
        }
		
    }
	

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
			
        }
	
		
    }
	
	}