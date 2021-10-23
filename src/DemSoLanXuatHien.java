import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int TestNum = 1;
        while (t>0){
            int n = input.nextInt();
            int[] a = new int[n+5];
            for (int i=0; i<n; i++){
                a[i] = input.nextInt();
            }
            System.out.println("Test" + TestNum + " :");
            for (int i=0; i<n; i++){
                int count = 1;
                for(int j=i+1; j<n; j++){
                    if (a[i] == a[j]){
                        count++;
                    }
                }
                System.out.println(a[i] + " xuat hien " + count + " lan");
            }
            t--;
            TestNum++;
        }
    }
}
