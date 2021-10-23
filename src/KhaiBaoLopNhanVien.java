import java.util.Scanner;

public class KhaiBaoLopNhanVien{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String name,gender,dob,address,taxID,contractSign;

        name = sc.nextLine();
        gender = sc.nextLine();
        dob = sc.nextLine();
        address = sc.nextLine();
        taxID = sc.nextLine();
        contractSign = sc.nextLine();

        NV nv = new NV(
                name,
                gender,
                dob,
                address,
                taxID,
                contractSign
        );
        System.out.println(nv);
    }
}
class NV{
    String name;
    String gender;
    String dob;
    String address;
    String taxID;
    String contractSign;
    public NV(String name, String gender, String dob, String address, String taxID, String contractSign) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.taxID = taxID;
        this.contractSign = contractSign;
    }
    public String toString() {
        return "00001" + " " + name + " " + gender + " "+ dob + " " + address + " " + taxID + " "+contractSign;
    }
}