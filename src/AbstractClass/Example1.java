package AbstractClass;


abstract  class Message{
    abstract  void wish();
}

class Aaruu extends Message{
    void  wish(){
        System.out.println("Good morning");
    }

}
class Anu extends Message{
    void wish(){
        System.out.println("good evening");
    }
}
public class Example1 {
    public static void main(String[] args) {
//        Message m=new Message();//error:message is abstract , can not be instatiated(cant create object)
        Aaruu r= new Aaruu();
        r.wish();
        Anu a=new Anu();
        a.wish();
        System.out.println ("_____________");

        Message m1=new Aaruu();
        m1.wish();
        Message m2=new Anu();
        m2.wish();
    }
}

//Good morning
//good evening
