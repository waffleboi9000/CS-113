// Time.java
// converts seconds to hours, minutes, seconds.
import java.util.Scanner;
public class Time {
    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the total number of seconds: ");

        double inputseconds = scan.nextDouble();
        int hours = (int) inputseconds/3600;
        int minutes = (int) (inputseconds - 3600*hours)/60;
        int seconds = (int) (inputseconds - 60*minutes - 3600*hours);
        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
    }
}
