package Constructor;

public class Example2 {
    int id;
    String ename;
    int esal;
    static String company;
   static String addr;

    Example2(int id,String ename,int esal){
        this.id=id;
        this.ename=ename;
        this.esal=esal;
        this.company="Infosys";
        this.addr="Pune";
    }

    void display(){
        //logic
        if(esal>2000){
            System.out.println(ename+" you are very good employee");
            System.out.println(id+" "+ename+" "+esal+" "+Example2.company+" "+Example2.addr);
        }
        else {
            System.out.println(ename+" you too,,but average emplyee");
            System.out.println(id+" "+ename+" "+esal+" "+Example2.company+" "+Example2.addr);

        }
    }
    public static void main(String[] args) {
Example2 obj1=new Example2(1,"aaruu",300000);
obj1.display();

        Example2 obj2=new Example2(1,"meerab",300);
        obj2.display();
    }
}
