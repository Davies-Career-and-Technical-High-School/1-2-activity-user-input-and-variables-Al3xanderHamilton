/* Activity 1.2 - Question 2 */
import java.util.Scanner;


class Question2 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        String name1, name2, name3;

        System.out.println("Type 3 names for me pls?");
        name1 = scan.nextLine();
        name2 = scan.nextLine();
        name3 = scan.nextLine();
        System.out.println("Hello " + name3 + name2 + name1 + ", Thanks m8");
    }
}