import java.util.Scanner;

import static java.lang.Math.sqrt;

public class UocSNTmax {
    static boolean snt(long n){
        if(n < 2) return false;
        for (int i = 2; i <=sqrt(n); i++){
            if (n % 2 == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            long n = sc.nextLong();
            int temp = 0;
            for(int i = 2; i <= sqrt(n); i++){
                    while (n % i == 0){
                        n/=i;
                    }
                    temp = i;
            }
            if (snt(n)) System.out.println(n);
            else System.out.println(temp);
        }
    }
}
// dm git
