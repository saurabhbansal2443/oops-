public class inheritance {
   public static void main(String[] args) {
       Person p1=new Person();

       p1.name="xyz";
       p1.age=20;

       Employe e1=new Employe();

       //System.out.println(e1.age);

       e1.name="Harish";
       e1.age=20;
       e1.companyName="Coding thinker";
       e1.id="5456";
       e1.salary=14;

       //e1.timing();

       e1.walk(20);
   } 
}


class Employe extends Person{
    String companyName;
    String id;
    int salary;

    void timing(){
      System.out.println(name+" " + age + companyName + " office timing is 9Am" );
    }

    void walk(){
        System.out.println(name +" is walking in " + companyName);
    }

    
}

class Person{
    String name;
    int age ;

    void walk(){
        System.out.println(name + " is walking ");
    }

    void walk(int steps){
        System.out.println(name + " is walking " +steps );
    }

    void eat(){
        System.out.println(name + " is eating food");
    }
}
