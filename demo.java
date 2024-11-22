public class demo {
    public static void main(String[] args) {
        // Define two numbers to add
        int num1 = 5;
        int num2 = 7;

        // Call the add method to compute the sum
        int sum = add(num1, num2);

        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }
}
