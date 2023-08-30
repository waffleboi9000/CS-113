import java.util.Scanner;
public class TestNames {

    public static void  main(String [] args){
        Scanner scan = new Scanner(System.in);
        Name name1 = new Name();
        System.out.println("Enter a first name: ");
        name1.first = scan.nextLine();
        System.out.println("Enter a middle name: ");
        name1.middle = scan.nextLine();
        System.out.println("Enter a last name: ");
        name1.last = scan.nextLine();
        Name name2 = new Name();
        System.out.println("Enter a first name: ");
        name2.first = scan.nextLine();
        System.out.println("Enter a middle name: ");
        name2.middle = scan.nextLine();
        System.out.println("Enter a last name: ");
        name2.last = scan.nextLine();
        System.out.println(name1.firstmiddlelast());
        System.out.println(name2.firstmiddlelast());
        System.out.println(name1.equals(name1, name2));
    }
}
