import java.util.Scanner;
public class TestExceptionsV2 {
    public static void main(String[] args) throws NoOvertimeException {
        System.out.println("Enter the number of hourly workers:");
        Scanner scan = new Scanner(System.in);
        int numHourlies = scan.nextInt();
        Hourly[] testHours = new Hourly[numHourlies];
        int overtimeWorkerCount = 0;
        try {
            for (int r = 0; r < numHourlies; r++) {

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
                    overtimeWorkerCount += 1;
                    NoOvertimeException overtime = new NoOvertimeException();
                    throw overtime;
                } else {
                    testHours[r] = new Hourly(nameOfWorker, addressOfWorker, phoneOfWorker, socOfWorker, rate);
                }
            }
        }
        catch (NoOvertimeException exception){
            System.out.println("Overtime is not allowed.");
            System.out.println("Number of overtime workers: " + overtimeWorkerCount);
            System.out.println("Number of valid time workers: " + (numHourlies-overtimeWorkerCount));
        }
    }
}