import java.util.ArrayList;
import java.util.Scanner;

public class MangDoiXung {
    static Boolean solve(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0; i<n; i++){
            int add = input.nextInt();
            array.add(add);
        }
        for (int i=0; i<array.size()/2; i++){
            if(array.get(i).equals(array.get(n-i-1))) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-->0){
            if(solve() == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
