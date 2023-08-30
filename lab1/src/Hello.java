// // Print a Hello, World message.
// ********************************************
import java.util.Random;
public class Hello {
// -----------------------------------
// main method -- prints the greeting
// -----------------------------------
public static void main (String[] args) {
Random gen = new Random();
    System.out.println ("Hello, World!" + gen.nextInt(25));
}
}
//2. Error when doing step 2: java: class Helo is public, should be declared in a file named Helo.java
//3. In this case, there was no error because the misspelling was inside the string.
//4. In this case, the error was "java: unclosed string literal"
//5. In this case, the error was "java: ')' or ',' expected"
//6. In this case, the error was "java: ';' expected"