import java.util.Scanner;
import java.util.StringTokenizer;

public class ChuanHoaXauHoTen1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-->0){
            String s = input.nextLine();
            StringTokenizer token = new StringTokenizer(s,"\s");
            while (token.hasMoreTokens()){
                String s1 = token.nextToken().toLowerCase();
                String upper = s1.substring(0,1).toUpperCase() + s1.substring(1);
                System.out.print(upper + " ");
            }
            System.out.println();
        }
    }
}
