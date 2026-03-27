package Inheritance;

public class SuperError {
    SuperError(int a){
        System.out.println("parent 1-args cons");
    }
}
class Child6 extends SuperError{
    Child6(){
        super(10);
        System.out.println("child 0-args const");
    }
    Child6 (int a){
        super(10);//if not not give super here then compiler give error
        //super();
        System.out.println("child-1 -args const"+ a);
    }

    public static void main(String[] args) {
        new Child6();
    }

}
//❌ Why super() alone is NOT allowed here
//
//Because:
//
//super() means → call parent 0-arg constructor
//
//Parent has NO 0-arg constructor
//
//So compiler error occurs

//What compiler tries internally:
//Child() {
//    super();   // 👈 compiler inserts this
//    System.out.println("child");
//}
//
//
//❌ ERROR:
//
//constructor Parent() is undefined
//
//
//Because Parent() does not exist.
//
//✅ Case 2: NO error (you explicitly call parent constructor)
//class Child extends Parent {
//    Child() {
//        super(10);   // 👈 explicitly calling existing constructor
//        System.out.println("child");
//    }
//}
//
//
//✔ Compiles fine.



//.
//
//🔑 Golden rule (MEMORIZE THIS)
//
//In a child class, if the parent has no 0-arg constructor, then EVERY child constructor must explicitly call super(arguments) as its first statement.
//
//One-line exam answer 🎯
//
//Compilation fails because the compiler implicitly inserts super() in child constructors, and if the parent has no no-argument constructor, this implicit call becomes invalid.