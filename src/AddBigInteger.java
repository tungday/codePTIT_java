import java.math.BigInteger;
import java.util.Scanner;

public class AddBigInteger {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            BigInteger a = input.nextBigInteger();
            BigInteger b = input.nextBigInteger();
            System.out.println(a.add(b));
        }
    }
}
