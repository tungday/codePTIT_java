import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChuanHoaXauHoTen2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-->0){
            String s = input.nextLine();
            StringTokenizer token = new StringTokenizer(s,"\s");
            ArrayList<String> arr = new ArrayList<>();
            while (token.hasMoreTokens()){
                String s1 = token.nextToken().toLowerCase();
                String upper = s1.substring(0,1).toUpperCase() + s1.substring(1);
                arr.add(upper);
            }
            for (int i=1; i<arr.size(); i++){
                System.out.print(arr.get(i) + " ");
            }
            System.out.print(", " + arr.get(0).toUpperCase());
            System.out.println();
        }
    }
}
