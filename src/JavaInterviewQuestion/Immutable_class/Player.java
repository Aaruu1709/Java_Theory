package JavaInterviewQuestion.Immutable_class;

//player.java
public class Player{
   private   String name;
     private int age;
//    public void setName(String name){
//        this.name=name;
//    }
//
//    public void setAge(int age){
//        this.age=age;
//    }

    //constructor
    Player(String name,int age){
        this.name=name;
        this.age=age;
    }


    public void print(){
        System.out.println("name: "+ this.name+ " and "+ "age:"+ this.age);
    }
}
