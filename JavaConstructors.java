public class JavaConstructors {
    public static void main(String[] args) {
      Employee2 e1=new Employee2(30, "Nikhil" , 67);

      e1.printDetails();

    }
}

class Person1 {
    int age;
    String name;

    public Person1() {
        System.out.println("Constructor Called ");
    }

    public Person1(int age, String name) { // this is called constructor overloading
        this.age = age;
        this.name = name;
    }

    public void printDetails() {
        System.err.println(age + "  " + name);
    }
}

class Employee2 extends Person1 { // this is how to call constructor function of parent class
    int id;

    public Employee2() {
        System.out.println("Employee class constructor called ");
    }

    public Employee2(int age, String name, int id) {
        super(age, name);
        this.id = id;
    }

    public void printDetails(){
         System.out.println(this.age + "    " + this.id + "  " + this.name);
    }
}
