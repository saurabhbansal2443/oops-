public class MultiLevelInheritance {
    public static void main(String[] args) {
        child c1=new child(2000,2,50);
        
    }
}

// this is the multilevel inheritance 

class grandParent{
    int money ;

    public grandParent(int money){
        this.money=money;
    }
} 

class Parents extends grandParent{
    int knowledge;

    public Parents(int money,int knowledge){
        super(money);
        this.knowledge=knowledge;
    }
     
    
}

class child extends Parents{
    int energy;

    public child(int money , int knowledge , int energy){
        super(money,knowledge);
        this.energy=energy;
    }

}
