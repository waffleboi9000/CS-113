// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println(" ------------------ ");

        System.out.println("Enter a value: ");
        int threshold = scan.nextInt();
        int count = 0;

        sum = 0;
        int maxID = 0;
        int maxSale = 0;

        for (int i=0; i < sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
            if (sales[i]> maxSale){
                maxSale = sales[i];
                maxID = i;
            }

            if(sales[i] > threshold){
                count ++;
                System.out.println("Salesperson " + i + ": " + sales[i]);
            }

        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sales: "+ sum/SALESPEOPLE);
        System.out.println("Salesperson "+ maxID + " had the highest slaes with $ " + maxSale);


    }
}