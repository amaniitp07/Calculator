import operations.Add;
import operations.Divide;
import operations.Multiply;
import operations.Subtract;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double num1,num2;
        System.out.println("Enter First number : ");
        num1=sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.println(" Enter seconf number : ");
        num2=sc.nextDouble();

        try {
            switch (op) {
                case '+':
                    System.out.println("Result: " + Add.add(num1, num2));
                    break;
                case '-':
                    System.out.println("Result: " + Subtract.subtract(num1, num2));
                    break;
                case '*':
                    System.out.println("Result: " + Multiply.multiply(num1, num2));
                    break;
                case '/':
                    System.out.println("Result: " + Divide.divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operator!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }


    }
