package Constructor;

public class Example1 {
    //instance variable
    int eid;
    String ename;
    double esal;
    String company;
    String addr;
    Example1(int eid,String ename,double esal,String company,String addr)//local variable
    {
        //assign local data to instance data
        this.eid=eid;
        this.ename=ename;
        this.esal=esal;
        this.company=company;
        this.addr=addr;
    }
    void status(){
        if(esal>15000){
            System.out.println("very good employee");
        }
        else{
            System.out.println("good Employee");
        }
    }
    public static void main(String[] args) {
        Example1 obj=new Example1(1,"aaruu",30000000,"microsoft","pune");
        obj.status();
        Example1 obj2=new Example1(1,"saruu",300,"Tatiana","Vietanam");
        obj2.status();

    }
}
