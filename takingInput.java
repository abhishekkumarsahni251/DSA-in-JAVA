import java.math.BigInteger;
import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value for firstnum");
    int firstnum = sc.nextInt();
    System.out.println("enter the value for secondnum");
    int secondnum = sc.nextInt();
    int answer = firstnum + secondnum;
    System.out.println( "answer is :" + answer);

 BigInteger bg = sc.nextBigInteger();
 System.out.println("BigInteger :" + bg);

 System.out.println("enter the valur of sonu");
  boolean sonu  =sc.nextBoolean();

  System.out.println("enter the short value");
  short chota = sc.nextShort(); 

 System.out.println("enter the float value");
  float floatvalue = sc.nextFloat();

  System.out.println("sonu is:"+ sonu);
  System.out.println("chotais:" + chota);
  System.out.println("floatvalue:"+ floatvalue);
  
    }
    
}
