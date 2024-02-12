class Student{
    int id;
    String name;
    String emailId;
    String phoneNo;

    public Student(int id, String name, String emailId, String phoneNo){
        this.id = id;
        this.phoneNo = phoneNo;
        this.name = name;
        this.emailId = emailId;
    }

    public Student(){
        this.id = 1;
        this.phoneNo = "1234567890";
        this.name = "Rushda Mansuri";
        this.emailId = "mansurirushda7@gmail.com";
    }

    public int getId() {
        return id;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Constructors.");

        Student s1 = new Student();
        System.out.println("Id: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("EmailId: " + s1.emailId);
        System.out.println("PhoneNo: " + s1.phoneNo);

        System.out.println();
        
        Student s2 = new Student(2,"Amir Vahora","amir.vahora@test.com", "1234567890");
        System.out.println("Id: " + s2.id);
        System.out.println("Name: " + s2.name);
        System.out.println("EmailId: " + s2.emailId);
        System.out.println("PhoneNo: " + s2.phoneNo);
    }
}
