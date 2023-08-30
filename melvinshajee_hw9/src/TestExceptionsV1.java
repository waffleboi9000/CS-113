import java.util.Scanner;
public class TestExceptionsV1 {
    // Using the Hourly class from Chapter 10, create a main
    // program, TestExceptionsV1, that creates and populates an Hourly array with information
    // entered by the user (array size as well). If the number of hours value is entered that is too high,
    // i.e. more than 40 throw the exception. Allow the thrown exception to terminate the program.
    public static void main(String[] args) throws NoOvertimeException {
        System.out.println("Enter the number of hourly workers:");
        Scanner scan = new Scanner(System.in);
        int numHourlies = scan.nextInt();
        Hourly[] testHours = new Hourly[numHourlies];
        for(int r = 0; r < numHourlies;r++) {
            System.out.println("Enter the name of worker number " + (r + 1));
            String nameOfWorker = scan.next();
            System.out.println();
            System.out.println("Enter the address of " + nameOfWorker);
            String addressOfWorker = scan.next();
            System.out.println();
            System.out.println("Enter the phone number of " + nameOfWorker);
            String phoneOfWorker = scan.next();
            System.out.println();
            System.out.println("Enter the social security number of " + nameOfWorker);
            String socOfWorker = scan.next();
            System.out.println("Enter the rate of " + nameOfWorker);
            double rate = scan.nextDouble();
            System.out.println("Enter the number of hours for worker number " + (r + 1));
            int hoursWorked = scan.nextInt();
            if (hoursWorked > 40) {
                NoOvertimeException overtime = new NoOvertimeException();
                throw overtime;
            } else {
                testHours[r] = new Hourly(nameOfWorker, addressOfWorker, phoneOfWorker, socOfWorker, rate);
            }
        }
    }
}
