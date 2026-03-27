package Interface;

 interface InterfaceEx2 {

    void greetMsg();

}
class greet1 implements InterfaceEx2{
     public void greetMsg(){
         System.out.println("hey ...welcome to our new Home");
     }
}

class greet2 implements InterfaceEx2{
     public void greetMsg(){
         System.out.println("hey .....please seat!!");
     }
}
class AllGathered {
    public static void main(String[] args) {
        greet1 g=new greet1();
        g.greetMsg();

        greet2 g2=new greet2();
        g2.greetMsg();

        System.out.println("another way two print :we can print using interface also");

        InterfaceEx2 i=new greet1();
        i.greetMsg();
        InterfaceEx2 i2=new greet2();
        i2.greetMsg();
    }
}