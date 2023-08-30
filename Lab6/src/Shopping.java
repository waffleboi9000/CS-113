import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Shopping {
    public static void main(String [] args){
        ShoppingCart shop = new ShoppingCart();
        Scanner scan = new Scanner(System.in);
        System.out.println("More items to shop? (Enter y or n.)");
        while(scan.next().equals("y")){
            System.out.println("enter name, price and quantity of item:");
            shop.addToCart(scan.next(),scan.nextDouble(), scan.nextInt());
            System.out.println(shop);
            System.out.println("More items to shop? (Enter y or n.)");
        }
        System.out.println("Please pay: " + shop.totalPrice);
    }
}
