

public class Q3 {
    public static void main(String[] args) {
        

        System.out.println("Enter first number: ");
        double num1 = Methods.getDouble();

        System.out.println("Enter second number: ");
        double num2 = Methods.getDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double remainder = num1 % num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);


    }
}
