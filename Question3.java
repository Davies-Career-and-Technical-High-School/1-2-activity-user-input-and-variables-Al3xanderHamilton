/* Activity 1.2 - Question 3 */
import java.util.Scanner;


class Question3 {
    public static void main(String[] args) {
        /* Write your code here */
         Scanner scan = new Scanner(System.in);
        String name, adjective;
        System.out.println("What is your name(french accent)?");
        name = scan.nextLine();
        System.out.println("What adjective describes yuuu??(french accent)");
        adjective = scan.nextLine();
        System.out.println("My name is (in Southern American accent) " + name + ". " + "I'm " + adjective + ".");
         
    }
}