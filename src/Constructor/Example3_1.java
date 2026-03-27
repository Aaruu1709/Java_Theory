package Constructor;

public class Example3_1 {
    void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    void mul(int num1,int num2){
        System.out.println(num1*num2);
    }
    void div(int num1,int num2){
        System.out.println(num1/num2);
    }
    public static void main(String[] args) {
        Example3_1 obj=new Example3_1();
        obj.add(10,20);
        obj.mul(10,20);
        obj.div(10,20);
        //suppose i want to give same value so is this aproach is good
        //no..foe every time we pass value
    }
}
