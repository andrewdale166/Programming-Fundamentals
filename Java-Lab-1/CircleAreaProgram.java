import java.util.Scanner;
public class CircleAreaProgram
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner( System.in );
        
        System.out.println( "Area of a Circle Calculator" );

        double pi, r, area;
        pi = 3.14;
        System.out.print( "Enter the radius: " );
        r = scanner.nextDouble();
        
        area = pi * Math.pow( r, 2 );
        System.out.println( "Area: \t\t " + area );


        scanner.close();
    }
}
