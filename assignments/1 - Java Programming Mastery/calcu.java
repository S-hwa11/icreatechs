import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        int num1, num2;
        String operation;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input first number: ");
        num1 = sc.nextInt();
        
        System.out.print("Input second number: ");
        num2 = sc.nextInt();
        
        sc.nextLine();
        
        System.out.print("Operation (add, subtract, multiply, divide): ");
        operation = sc.nextLine();
        
        if (operation.equalsIgnoreCase("add")) {
            System.out.println(num1 + num2);
        } else if (operation.equalsIgnoreCase("subtract")) {
            System.out.println(num1 - num2);
        } else if (operation.equalsIgnoreCase("multiply")) {
            System.out.println(num1 * num2);
        } else if (operation.equalsIgnoreCase("divide")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid operation!");
        }
    }
}
