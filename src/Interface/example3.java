package Interface;

 interface Example3 {
     String m1(int a, int b);//public and private
     int m2(char ch, String str);
     void m3(int a);
}
abstract  class Ex3Demo implements Example3
{
  public   String m1(int a,int b){
        System.out.println("m1 mehotd");
        return "";
    }
}
class Ex3Demo2 extends Ex3Demo {
    public int m2(char ch, String str) {
        System.out.println(" m2extended ch str method");
        return 0;
    }

  public    void m3(int a){
         System.out.println("m3 method");
     }
}


class MainClass{
    public static void main(String[] args) {
Ex3Demo2 e3=new Ex3Demo2();
e3.m1(10,20);
e3.m2('a',"aaruu");
e3.m3(200);
    }
}