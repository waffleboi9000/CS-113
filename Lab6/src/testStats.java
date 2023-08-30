public class testStats {
    public static void main(String[] args){
        Die[] diceArray = new Die[10];
        for(int i=0; i<diceArray.length;i++) {
            diceArray[i] = new Die();
        }
        int[] freqArray = dieStats(diceArray);
        for(int i=0; i<freqArray.length;i++){
            System.out.println(freqArray[i]);
        }
    }

    // write a method dieStats
    public static int[] dieStats(Die[] diceArray){
        // fill in the program
        int[] freqArray = new int [diceArray.length];
        for (int i=0; i < diceArray.length;  i++){
            freqArray[i] = diceArray[i].getFaceValue();
        }
        return freqArray;
    }
}
