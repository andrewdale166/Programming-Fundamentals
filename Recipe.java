import java.util.Scanner;
public class Recipe
{
    public static void main(String[] args)
    {
        double batches, teaspoonsOfBakingSoda, teaspoonsOfBakingPowder, cupsOfButter, cupsOfWhiteSugar, amountOfEggs;
        Scanner scanner = new Scanner( System.in );
         System.out.print( "How many batches do you want to make? " );
        batches = scanner.nextDouble();
        teaspoonsOfBakingSoda = 1 * batches;
        teaspoonsOfBakingPowder = .5 * batches;
        cupsOfButter = 1 * batches;
        cupsOfWhiteSugar = 1.5 * batches;
        amountOfEggs = 1 * batches;
        System.out.println( "COOKIE RECIPE " );
        System.out.println( "tsp baking soda " + teaspoonsOfBakingSoda );
        System.out.println( "tsp baking powder " + teaspoonsOfBakingPowder );
        System.out.println( "c butter " + cupsOfButter );
        System.out.println( "c white sugar " + cupsOfWhiteSugar );
        System.out.println( "egg " + amountOfEggs );
        System.out.print( "How many batches do you want to make? " );
        batches = scanner.nextDouble();
        
        
        
        
        

    }

}
