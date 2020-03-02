public class FourNumber {

    public static void main(String[] args){

        String strA;  // first object
        String strB;  // second object


        strA   = new String( "The Dog" );
        strB   = new String( "The Dog" );

        if ( strA.equals( strB ) )
            System.out.println( "This WILL print.");


        /*String stringNumber = "2020";
        int sumNum = 0;
        String stringNum;

        for (int i = 0; i < stringNumber.length(); i++)
        {
            System.out.println(stringNumber.charAt(i));
            stringNum = String.valueOf(stringNumber.charAt(i));
            sumNum = sumNum + Integer.parseInt(stringNum);
        }

        System.out.println("the sum of digit is: " +sumNum);*/

    }
}
