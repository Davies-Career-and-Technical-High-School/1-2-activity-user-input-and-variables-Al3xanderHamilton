/* Activity 1.2 - Question 1 */
import java.util.Scanner;


class Question1 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        String name;

        System.out.println("What is your name?");
        name = scan.nextLine();
        System.out.println("Hello " + name + ". Nice to meet you");
    }
}