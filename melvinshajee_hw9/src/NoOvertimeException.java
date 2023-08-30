import java.util.Scanner;
public class NoOvertimeException extends Exception{
    public NoOvertimeException(){
        super("No overtime allowed.");
    }
}
