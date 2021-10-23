import java.util.Scanner;

public class SoNguyenTo {
    static boolean isPrime(int n){
        if (n == 0 || n == 1) {
            return false;
        }
        else {
            for (int i = 2; i <= n / 2; ++i) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t>0){
            int num = sc.nextInt();
            if(isPrime(num)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
        t--;
    }
}
