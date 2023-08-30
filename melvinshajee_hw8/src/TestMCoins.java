public class TestMCoins {
    public static void main(String[] args){
        // initializes coins array
        MonetaryCoin[][] coins = new MonetaryCoin[3][10];
        // instantiates coin objects and assigns values at random between 1-100
        for(int r = 0; r < 3; r++) {
            for(int c = 0; c < 10; c++){
                int value = (int) (Math.random()*100) + 1;
                coins[r][c] = new MonetaryCoin(1,value);
            }
        }
        // flip all the coins
        for(int r = 0; r < 3; r++) {
            // headCount stores the number of coins that land on heads.
            int headCount = 0;
            // bounty stores the total value of the coins that landed on heads.
            int bounty = 0;
            for(int c = 0; c < 10; c++){
                coins[r][c].flip();
                // counts all the heads in the row
                if(coins[r][c].isHeads()) {
                    headCount++;
                    bounty = bounty + coins[r][c].getValue();
                }
            }
            // print the total number of heads coins in each row
            System.out.println("Number of heads in row " + (r + 1) +": " + headCount);
            // prints the total value of the heads coins in each row
            System.out.println("Total value of coins that landed on heads in row " + (r+1) + ": " + bounty);
        }
    }
}
