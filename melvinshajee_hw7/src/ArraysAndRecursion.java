public class ArraysAndRecursion {
    public int salesRange(int[][] sales){
        int lowestsale = 999999999;
        int greatestsale = 0;
        for (int r = 0; r < sales.length; r++){
            for(int c = 0; c < sales[r].length; c++){
                if (sales[r][c] < lowestsale){
                    lowestsale = sales[r][c];
                }
                if (sales[r][c] > greatestsale){
                    greatestsale = sales[r][c];
                }
            }
        }
        int salesRange = greatestsale - lowestsale;
        return salesRange;
    }
    public int[] dieStats(Die[][] dice){
        int[] oddDice = new int[dice.length];
        int[][] faceValues = new int[dice.length][];
        for(int r = 0; r < dice.length; r++){
            int oddCount = 0;
            faceValues[r] = new int[dice[r].length];
            for(int c = 0; c < dice[r].length; c++){
                dice[r][c].roll();
                faceValues[r][c] = dice[r][c].getFaceValue();
                if (dice[r][c].getFaceValue() %2 != 0){
                    oddCount++;
                }
            }
            oddDice[r] = oddCount;
        }
        return oddDice;
    }
    public void printDigits(int number){
        if (number < 10){
            System.out.println(number);
        }
        else{
            printDigits(number/10);
            System.out.println(number%10);
        }
    }
    public int product = 1;
    public int prodArray(int[] numArray, int count){
        if (count == 1) {
            return numArray[0];
        }
        else{
            product = numArray[count-1]*prodArray(numArray, count-1);
            return product;
        }
    }
}
