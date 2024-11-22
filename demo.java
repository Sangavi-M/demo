public class demo {

    public static void main(String[] args) {
        // Check if we have the right number of arguments
        if (args.length < 3) {
            System.out.println("Usage: java Calculator <operation> <num1> <num2>");
            System.out.println("Operations: 1. Addition, 2. Subtraction, 3. Multiplication, 4. Division");
            return;
        }

        // Parse the inputs
        int choice = Integer.parseInt(args[0]);
        double num1 = Double.parseDouble(args[1]);
        double num2 = Double.parseDouble(args[2]);

        // Perform the operation based on the user's choice
        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                // Check for division by zero
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid input! Please select a valid operation (1-4).");
        }
    }
}

       
