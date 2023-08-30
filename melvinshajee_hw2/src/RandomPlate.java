// RandomPlate.Java
// Generates a license plate number with 3 letters followed by 4 numbers
import java.util.Random;
public class RandomPlate {
    public static void main(String[] args){
        //initialization of variables
        Random generator = new Random();
        String lnum = "";
        char testChar;
        for(int i=0; i<7; i++){
            // Generates letters for the first three elements
            if(i<3){
                testChar = (char) (generator.nextInt(0,26) + 65);
            // Generates numbers for the remaining 4 elements
            }else{
                testChar = (char) (generator.nextInt(0,10) + 48);
            }
            lnum += testChar;
            //System.out.println(testChar);
        }
        // Prints the resulting license number
        System.out.println(lnum);
    }
}
