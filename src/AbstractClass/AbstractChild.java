package AbstractClass;

public class AbstractChild extends AbstractParent{
    void m1(){
        System.out.println("m1 abstact method");
    }
    void m2(){
        System.out.println("m2 abstract method");
    }
    void m3(){
        System.out.println("m3 abstact method");
    }
    public static void main(String[] args) {
        //we cant create object of abstract class ,so here we create child class object
        AbstractChild ab=new AbstractChild();

        System.out.println("___________we can not creat object of abstact classes __________");

        ab.m1();
        ab.m2();
        ab.m3();
        ab.m4();
        System.out.println("___________another way to access __________");

        System.out.println("we can create reference of parent and object of child chld and access it");

        AbstractParent ab2=new AbstractChild();
        ab2.m1();
        ab2.m2();
        ab2.m3();
        ab2.m4();

    }


}
