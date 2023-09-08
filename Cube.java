import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        int num, cube;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        num = sc.nextInt();

        cube = num*num*num;
        System.out.println("Cube of "+num+" is "+cube);
    }
}
