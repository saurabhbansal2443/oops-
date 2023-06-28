public class privateAcessModifier {
    public static void main(String[] args) {
     Employee e1=new Employee();

     e1.setName("saurabh");
     e1.setage(20);

       System.out.println(e1.getage());
    }
}

class Employee {
    private String name;
    private int age;

    public void setName(String name) {  // setter functions 
        this.name = name;

    }

    public void setage(int age) {     // setter functions 
        this.age = age;
    }

    public String getName() {     // getter functions 
        return this.name;

    }

    public int getage() {       // getter functions 
        return this.age;
    }
}
