import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int num=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=input.nextInt();
        long fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}