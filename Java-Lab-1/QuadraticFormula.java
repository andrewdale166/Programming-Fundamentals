
import java.util.Scanner;
public class QuadraticFormula
{
 public static void main(String args[])
    {
        Scanner scanner = new Scanner( System.in );
       
        System.out.println( "ax^2 + bx + c" );
        double a, b, c;
        System.out.print( "Enter a: " );
        a = scanner.nextDouble();
        System.out.print( "Enter b: " );
        b = scanner.nextDouble();
        System.out.print( "Enter c: " );
        c = scanner.nextDouble();
        double x1, x2;
        
        x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println( "x1: \t\t " + x1 );
        System.out.println( "x2: \t\t " + x2 );

        scanner.close();
    }  
}
