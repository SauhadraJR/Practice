public class InheritanceWork{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shyam";
        s1.age = 21;
        s1.address = "Kirtipur";
        s1.rollNo = 43;
        s1.StudentDetail();
    }
}
 class Person{
    String name;
    int age;
    String address;

    void Persondetail(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Address: "+this.address);
    }
}

class Student extends Person{
    int rollNo;
    void StudentDetail(){
        Persondetail();
        System.out.println("Roll no: "+ this.rollNo);
    }
}