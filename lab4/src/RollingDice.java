import java.util.Random;
public class RollingDice {
    public static void main(String[] args){
        Random generator = new Random();
        int dice1val = generator.nextInt(1,7);
        int dice2val = generator.nextInt(1,7);
        int sum = dice1val + dice2val;
        System.out.println("dice value 1: " + dice1val);
        System.out.println("dice value 2: " + dice2val);
        System.out.println("sum: " + (dice1val+dice2val));
        double hypoteneuse = (Math.sqrt(Math.pow(dice1val,2)+Math.pow(dice2val,2)));
        System.out.println(hypoteneuse);
    }
}
