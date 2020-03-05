public class FourNumber {

    public static void main(String[] args){

        String stringNumber = "2020";
        int sumNum = 0;
        String stringNum;

        for (int i = 0; i < stringNumber.length(); i++)
        {
            System.out.println(stringNumber.charAt(i));
            stringNum = String.valueOf(stringNumber.charAt(i));
            sumNum = sumNum + Integer.parseInt(stringNum);
        }

        System.out.println("the sum of digit is: " +sumNum);

    }
}
