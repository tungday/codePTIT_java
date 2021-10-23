import java.math.BigInteger;
import java.util.Scanner;

public class SubtractBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            BigInteger num1 = sc.nextBigInteger();
            BigInteger num2 = sc.nextBigInteger();
            num1 = (num1.subtract(num2)).abs();
            System.out.println(num1);
        }
    }
}