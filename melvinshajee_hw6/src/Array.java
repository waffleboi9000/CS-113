import java.util.Random;
public class Array {
    // generates random integers from 0 to 10, counts how many of each, and stores it in an array.
    public Array() {}
        public int[] numberFreq() {
            Random gen = new Random();
            int[] freqValues = new int[1000];
            for (int i = 0; i < 1000; i++) {
                freqValues[i] = gen.nextInt(0, 11);
            }
            return freqValues;
        }
        // takes an integer parameter, total. The method will create, populate and return an array of the first total
        // Fibonacci numbers in the sequence. This sequence starts with 1 and 2 as the first 2 elements and each element
        // thereafter is the sum of the previous two elements. (1, 2, 3, 5, 8, 13…)
        public int[] fibo ( int total){
            int[] fibonacciArray = new int[total];
            if (total == 0) {
                System.out.println("There is nothing to return.");
            } else if (total == 1) {
                fibonacciArray[0] = 1;
            } else if (total == 2) {
                fibonacciArray[0] = 1;
                fibonacciArray[1] = 2;
            } else {
                fibonacciArray[0] = 1;
                fibonacciArray[1] = 2;
                for (int i = 2; i < total; i++) {
                    fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
                }
            }
            return fibonacciArray;
        }
        public int oddDice (Die[]dicearray){
            int oddCount = 0;
            for (int i = 0; i < dicearray.length; i++) {
                dicearray[i].roll();
                if (dicearray[i].getFaceValue() % 2 != 0) {
                    oddCount++;
                }
            }
            return oddCount;
        }
}
