import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.printf("\nTask1\n\n");
    
        //first set of complex number user input
        Scanner input = new Scanner(System.in);
        System.out.printf(" Enter the first complex number: ");
        System.out.printf("\n            Enter a real number: ");
        double A = input.nextDouble();
        System.out.printf("      Enter an imaginary number: ");
        double B = input.nextDouble();
        //second set of complex number user input
        System.out.printf("\nEnter the second complex number: ");
        System.out.printf("\n            Enter a real number: ");
        double C = input.nextDouble();
        System.out.printf("      Enter an imaginary number: ");
        double D = input.nextDouble();
        System.out.printf("\n");
        
        input.close();
       // } catch(IllegalArgumentException e){}
        Complex x = new Complex(A, B);
        
        System.out.print(x.add(C, D));
        System.out.print(x.subtract(C, D));
        System.out.print(x.multiply(C, D));
        System.out.print(x.divide(C, D));
        System.out.print(x.abs(A, B));
    }
}