import java.util.ArrayList;
import java.util.Scanner;

public class KhaiBaoSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input .nextInt();
        input.nextLine();
        ArrayList<Student> arr = new ArrayList<>();
        while(t-->0){
            String id, name, className, email;
            id = input.nextLine();
            name = input.nextLine();
            className = input.nextLine();
            email = input.nextLine();
            arr.add(new Student(id, name, className, email));
        }

        int q = Integer.parseInt(input.nextLine());
        while (q-->0 ){
            String lop = input.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
            for(Student i: arr){
                if(i.className.equals(lop)){
                    System.out.println(i);
                }
            }
        }
    }
}

class Student{
    String id,name,className,email;

    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }
    public String toString() {
        return id + " " + name + " " + className + " " + email + " ";
    }
}
