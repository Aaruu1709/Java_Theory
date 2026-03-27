package JavaInterviewQuestion.Immutable_class;


//Main.java
public class Main{
    public static void main(String[] args)
        {
        Player p1=new Player("aarohi",23);
        p1.print();
        //rule one:1 using setter we can change the value so we remove setters
//        p1.setName("Rohit sharma");
//        p1.setAge(38);


            //rule 2:without using private variable we can access everywhere so we make it private
            //so we cant access outside class and chage it so it become immutable
//            p1.name="aaruu";
//            p1.age=40;


        p1.print();
            System.out.println("_____________");

//        p1.setName("aaruu");
//        p1.setAge(26);


//            p1.name="saruu";
//            p1.age=25;

        p1.print();
    }
}
