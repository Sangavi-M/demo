public class demo {
    public static void main(String[] args) {
        // Assuming two numbers
        double num1 = 10;
        double num2 = 20;

        // Perform the calculations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = 0;
        if (num2 != 0) {
            quotient = num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // Display the results
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        if (num2 != 0) {
            System.out.println("Division: " + quotient);
        }
    }
}


       
