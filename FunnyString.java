import java.util.Scanner;

public class FunnyString {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        String color, food, animal, name;

        System.out.print("Enter color: ");
        color = input.nextLine();

        System.out.print("Enter food: ");
        food = input.nextLine();

        System.out.print("Enter animal: ");
        animal = input.nextLine();

        System.out.print("Enter a name: ");
        name = input.nextLine();

        System.out.println("I had a dream that " + name + " ate a " + color + " " + animal + " and said it tasted like " +food +"!");

    }
}
