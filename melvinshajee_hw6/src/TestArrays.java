import java.util.Arrays;
public class TestArrays {
    public static void main(String[] args){
        Array arr1 = new Array();
        System.out.println("This is the array from numberFreq: " + Arrays.toString(arr1.numberFreq()));
        Array arr2 = new Array();
        System.out.println("This is the fibonacci sequence for 30: " + Arrays.toString(arr2.fibo(30)));
        System.out.println("This is the fibonacci sequence for 0: " + Arrays.toString(arr2.fibo(0)));
        System.out.println("This is the fibonacci sequence for 1: " + Arrays.toString(arr2.fibo(1)));
        System.out.println("This is the fibonacci sequence for 2: " + Arrays.toString(arr2.fibo(2)));
        Die[] dice = {new Die(), new Die(), new Die()};
        System.out.println("This is the number of dice with odd rolls: " + arr2.oddDice(dice));
    }
}
