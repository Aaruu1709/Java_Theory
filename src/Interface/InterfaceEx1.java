package Interface;

  interface InterfaceEx1 {   //abstract
    void m1();   //public and abstract
    void m2();

}
class InterDemo implements InterfaceEx1{

    public  void m1(){
          System.out.println("interface m1 method");
      }
     public void m2(){
          System.out.println("interface m2 method");
      }

    public static void main(String[] args) {
        InterDemo i=new InterDemo();
        i.m1();
        i.m2();
        System.out.println("another way to print: which is interface also hold the reference of child object");

        InterfaceEx1 i2=new InterDemo();
        i2.m1();
        i2.m2();

    }
}

