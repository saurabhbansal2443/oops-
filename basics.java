public class basics {
    public static void main(String[] args) {

        Student s1 = new Student(); // object of class student

        s1.age = 20;
        s1.name = "sohan";
        s1.course = "B-tech";
        s1.number = "8737";

        s1.details();

        s1.details("MITS");

        // Student s2 = new Student();

        // s2.name="palak";
        // s2.age=20;
        // s2.course="btech";


        //System.out.println(s1.age + " " + s1.name);

    }

}

class Student { // custom student class
    String name; // attributes
    int age;
    String number;
    String course;

    void details(){  //method 
        System.out.println("Student name is " + name + " age " + age);
    }

    void details(String collegeName){
         System.out.println("Student name is " + name + " age " + age + "  college name " + collegeName);
    }

     void details(String collegeName , int year ){
         System.out.println("Student name is " + name + " age " + age + "  college name " + collegeName);
    }


   
}