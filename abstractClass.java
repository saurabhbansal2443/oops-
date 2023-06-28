public class abstractClass {
    public static void main(String[] args) {
        SmartPhone s1=new SmartPhone();

        s1.music();
    }
}

 abstract class Phone{
    abstract void call();
    abstract void dial();

    void music (){
        System.out.println(" Playing Music ");
    }
}

class SmartPhone extends Phone{
    public void call(){
       System.out.println("Calling");
    }
    public void dial(){
        System.out.println("dialing ");
    }
}


