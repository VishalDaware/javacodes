class Student {
    String name;
    int age;

    // methods
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }
}

public class Constructor2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sarita";
        s1.age = 20;

        Student s2 = new Student(s1);// copy constructor

        s2.printInfo();

    }
}