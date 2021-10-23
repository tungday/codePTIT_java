import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class KhaiBaoLopSinhVien {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        String name, lop, birthday, gpa;
        name = sc.nextLine();
        lop = sc.nextLine();
        birthday = sc.nextLine();
        gpa = sc.nextLine();
        students.add(new Student(name, lop, birthday, Double.parseDouble(gpa)));
        for(int i=0; i<students.size(); i++){
            System.out.println(students.get(i).toString());
        }
    }
}

class Student{
    String name;
    String lop;
    String birthday;
    double gpa;
    SimpleDateFormat ddmmyyyy = new SimpleDateFormat("dd/MM/yyyy");
    public Student(String name, String className, String birthday, double gpa) throws ParseException {
        this.name = name;
        this.lop = className;
        this.birthday = ddmmyyyy.format(new SimpleDateFormat("dd/MM/yyyy").parse(birthday));
        this.gpa = gpa;
    }
    public String toString() {
        return "B20DCCN001" + " " + name + " " + lop + " " + birthday + " " + String.format("%.2f", gpa);
    }
}
