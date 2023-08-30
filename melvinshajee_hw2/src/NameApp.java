// NameApp.java
// Prompts for the user's first and last names, prints the initials, and averages the first and last name's lengths.
import java.util.Scanner;
public class NameApp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = scan.nextLine();
        String firstInitial = firstName.substring(0,1);
        System.out.println("What is your last name?");
        String lastName = scan.nextLine();
        String lastInitial = lastName.substring(0,1);
        System.out.println("initials: " + firstInitial + lastInitial);
        double avgLength = (firstName.length() + lastName.length())/2.0;
        System.out.println("average length: " + avgLength);
    }
}
