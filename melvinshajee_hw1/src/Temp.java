// Temp.java
// Converts temperature values between Fahrenheit and Celsius
public class Temp {
    public static void main(String[] args) {
        //useful method stuff goes here
        double tempinfahrenheit = 36.5;
        double tempincelsius = ((tempinfahrenheit - 32)/1.8);
        System.out.print("Temp in Fahrenheit: " + tempinfahrenheit);
        System.out.print(", Temp in Celsius: " + tempincelsius);
    }
}
