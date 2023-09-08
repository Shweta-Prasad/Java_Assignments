import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args){

        double num1,num2;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number:");
        num1=sc.nextDouble();

        System.out.print("Enter second number:");
        num2=sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /) :");
        char operator=sc.next().charAt(0);

        double output;

        switch(operator) 
        {
            case '+':
               output=num1+num2;
               break;

            case '-':
               output=num1-num2;
               break;

            case '*':
               output=num1*num2;
               break;

            case '/':
               output=num1/num2;
               break;

            default:
               System.out.println("Invalid operator");
               return;
        }
        System.out.println(num1+" "+operator+" "+num2+" : "+output);
        }
    }

