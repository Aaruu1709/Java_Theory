package Constructor;

public class Example3_2 {
    int n1;
    int n2;
    Example3_2(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
    }
    void add(){
        System.out.println("addition is:"+ (n1+n2));
    }

    void mul(){
        System.out.println("multplication is:"+(n1*n2));
    }

    void div(){
        System.out.println("division is:"+(n1/n2));
    }
    public static void main(String[] args) {
        Example3_2 obj1=new Example3_2(10,20);
        obj1.add();
        obj1.mul();
        obj1.div();

    }
}
