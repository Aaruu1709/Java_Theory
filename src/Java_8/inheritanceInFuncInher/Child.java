package Java_8.inheritanceInFuncInher;

@FunctionalInterface
public interface Child extends Parent{
    //if we do not give any mehtod here still child is functional interface bcoz it inherit parent abstract method
//public void sayhello();
//public void sayBye();//error..only one abstract method is allowed here
    public static void hii(){

    }
    public default void say(){

    }//any no of static and default method does not matter

}
