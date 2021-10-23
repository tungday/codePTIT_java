import java.text.DecimalFormat;
import java.util.Scanner;

public class KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String date = input.nextLine();
        float p1 = input.nextFloat();
        float p2 = input.nextFloat();
        float p3 = input.nextFloat();
        DecimalFormat sum =  new DecimalFormat("#.#");
        System.out.println(name + " " + date + " " + sum.format(p1+p2+p3));
    }
}
