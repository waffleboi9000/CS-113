import java.util.Scanner;
public class Kennel {
    public static void main(String[] args){
        // instantiation
        Dog d1 = new Dog();
        // prompt for properties of dog 1
        System.out.println("Dog 1's name?");
        Scanner Scan = new java.util.Scanner(System.in);
        // using Scan.next() instead of Scan.newLine() because of https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        String name1 = Scan.next();
        System.out.println("Dog 1's weight?");
        Double weight1 = Scan.nextDouble();
        d1.setWeight(weight1);
        d1.setName(name1);
        // instantiation of dog 2
        Dog d2 = new Dog();
        // prompt for properties of dog 2
        System.out.println("Dog 2's name?");
        String name2 = Scan.next();
        System.out.println("Dog 2's weight?");
        Double weight2 = Scan.nextDouble();
        d2.setWeight(weight2);
        d2.setName(name2);
        // returns properties of dogs 1 and 2
        System.out.println(d1 +"\n" + d2);
        // returns the average weight of dogs 1 and 2 in kilograms.
        System.out.println("Average of weights: " + (d1.toKgs()+ d2.toKgs())/2 + " kilograms");
    }
}
