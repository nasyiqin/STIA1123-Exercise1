public class StringExercise {

//StringExercise.java
// **************************************************

    public static void main (String[] args){

        String town = ("UUM Sintok");

            String college = new String ("College of Arts and Sciences");

            int stringLength;
            String change1, change2, change3;

            stringLength = college.length();

            System.out.println (college + " contains " + stringLength + "characters.");

            change1 = college.toUpperCase();
            System.out.println ("The string is all in upper case: " + change1);

            change2 = change1.replace("O","*");
            System.out.println ("All capital O's are replaced with the asterisk character: " + change2);

            change3 = college.concat(town);
            System.out.println ("The final string is " + change3);
    }
}
