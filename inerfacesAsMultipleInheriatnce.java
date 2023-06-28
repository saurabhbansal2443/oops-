public class inerfacesAsMultipleInheriatnce {
    public static void main(String[] args) {
        SmartPhone2 s2=new SmartPhone2();

        s2.call();
        s2.dial();
        s2.message();
    }
}

 
interface keyPad{
    void call();
    void dial();
    void message();
    
}

interface telephone{
     void call();
    void dial();
}

class SmartPhone2 implements keyPad,telephone{

        public void call(){
          System.out.println("Calling");
        }

        public void dial(){
         System.out.println("dialing");
        }

        public void message(){
       System.out.println("doing ");
        }

        public void music(){
            System.out.println("music  ");
        }
}
