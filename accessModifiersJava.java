public class accessModifiersJava {
    public static void main(String[] args) {
       employee4 e1=new employee4();
       e1.name = "yashraj";
       e1.number=876;

       e1.setSalary("200000000");

       System.out.println(e1.getSalary());


       software s1=new software();


       
    }
}


class employee4{
   private String salary;
   public String name ;
   protected int number ;

   public String  getSalary(){
       // getter function 
    return salary;
   }

   public void setSalary(String s){   // setter function 
    salary=s; 
   }

}

class software extends employee4{

    public String department;
}
