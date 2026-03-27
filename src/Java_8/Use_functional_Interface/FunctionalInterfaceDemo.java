package Java_8.Use_functional_Interface;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    public void sayHello();
//    public void sayBye();
    public static void sayOk(){

    }
    public static void sayYes(){

    }
}
//empty interfce is also not Functional interface
//single abstract method...no boundatiion on static and default mehtod
//what advantages of this annotation:
//- it restrict interface to functional interface
//-so if people have already used some lambdaa expression and some new team member addd another method in the interface
//all lambda expression will have errors