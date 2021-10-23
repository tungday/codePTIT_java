import java.util.Scanner;

public class Fibonacci {
    static long Fibo(long n){
        long a1 = 1, a2 = 1;
        if (n == 1 || n == 2)
            return 1;
        long i = 3, a = 0;
        while (i <= n)
        {
            a = a1 + a2;
            a1 = a2;
            a2 = a;
            i++;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t>0){
            int n = input.nextInt();;
            System.out.println(Fibo(n));
            t--;
        }
    }
}
