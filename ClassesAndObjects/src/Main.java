
class Student{
    int studentId;
    String name;
    String emailId;
    String phoneNo;
    long salary;
    public void getInfo(int studentId, String name, String emailId, String phoneNo){
        System.out.println("StudentId: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email Id: " + emailId);
        System.out.println("Contact No: " + phoneNo);
    }

    public int getSalary(int salary){
        return salary;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Class and Objects.");

        Student rushda = new Student();
        rushda.getInfo(1, "Rushda Mansuri", "rushda.z.mansuri@pace.edu", "1234567890");
        System.out.println("Salary: " + rushda.getSalary(10000));
    }
}
