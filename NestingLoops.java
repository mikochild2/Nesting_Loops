public class NestingLoops {
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        //for ( char c='A'; c <= 'E'; c++ )
        //{
            //for ( int n=1; n <= 3; n++ )
            //{
                //System.out.println( c + " " + n );
            //}
        //}
        //Which Variable changes faster?
        //Inner loop (n).

        for (int n=1; n <= 3; n++) {
            for (char c='A'; c <= 'E'; c++){
                System.out.println(c + " " + n);
            }
        }

        System.out.println("\n");
        //Reverse the order or inner and outer. How does it change?
        //The alphabet now runs through 5 letters before repeating and the numbers repeat the same number 5 times before continuing. The letters are now changing faster than the numbers.

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                //System.out.print( a + "-" + b + " " );
                System.out.println( a + "-" + b + " " );
            }
            // * You will add a line of code here.
            System.out.println();
        }
        //Add the ln to print and remove it. How does it change?
        //Adding the ln makes the output print in a vertical column rather than horizontal.
        //Adding System.out.print after the b while still inside a adds a line break between iterations.

        System.out.println("\n");

    }
}