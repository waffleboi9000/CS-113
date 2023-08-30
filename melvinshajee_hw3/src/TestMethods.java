import java.util.Scanner;
public class TestMethods {
    public static void main(String [] args){
        // instantiation
        Scanner Scan = new Scanner(System.in);
        MyMethods method = new MyMethods();
        // prompt for dimensions
        System.out.println("Enter width.");
        int w = Scan.nextInt();
        System.out.println("Enter length.");
        int l = Scan.nextInt();
        System.out.println("Enter height.");
        int h = Scan.nextInt();
        // return volume
        System.out.println("Volume: " + method.volume(w,l,h));
        Die d1 = new Die();
        Die d2 = new Die();
        d1.roll();
        System.out.println("Dice 1 value: " + d1.getFaceValue());
        d2.roll();
        System.out.println("Dice 2 value: " + d2.getFaceValue());
        System.out.println("Average value of dice that were rolled: " + method.avgFaceValues(d1,d2));
    }
}
