import java.awt.*;

public class TestArraysAndRecursion {
    public static void main(String[] args){
        ArraysAndRecursion array = new ArraysAndRecursion();
        int[][] sales = {{5, 10, 15},{2,4,6},{1,2,3}};
        System.out.println("Sales range result: " + array.salesRange(sales));

        Die[][] testdice = {{new Die(),new Die()},{new Die(), new Die()}};
        int[] diceStats = array.dieStats(testdice);
        System.out.println("The dieStats output is:");
        for (int i = 0; i < diceStats.length; i++) {
            System.out.println(diceStats[i]);
        }

        System.out.println("The result of array.printDigits(1492); is: ");
        array.printDigits(1492);

        int[] testProdArray = {5, 10, 15, 20};
        System.out.println("The results of prodArray with the input {5, 10, 15, 20} and count = 2 is: " + array.prodArray(testProdArray, 2));
        int count=1;
    }
}
