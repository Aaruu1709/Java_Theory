package JavaBasicIntro;

class Demo{
    int n1=10;
    int n2=20;
}
class Test{
    Demo d1;
    Test(Demo d1){
        this.d1=d1;
    }

    void addition(){
        System.out.println("addition is:"+(d1.n1+ d1.n2));
    }
    void multi(){
        System.out.println("multiplication is:"+(d1.n1* d1.n2));
    }

}
public class Assignment2 {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Test t=new Test(d1);
        t.addition();
        t.multi();
    }
}
