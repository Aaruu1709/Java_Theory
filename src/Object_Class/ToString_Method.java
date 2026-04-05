package Object_Class;
//Method of Object class
//Used to convert object into readable String format
//Automatically called when you print object

public class ToString_Method {
    String name = "Vishnu";
    int age = 21;

    @Override
    public String toString(){

        return "Student{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        ToString_Method s = new ToString_Method();

        // Calls overridden toString()
        System.out.println(s.toString());
    }
}
//1. toString() Method
//toString() provides a String representation of
// an object and is used to convert an object to a String.

//👉 Before toString():
//Printing object gives:
//Student@1a2b3c
//❌ Not understandable
//
//👉 Problem:
//
//Debugging becomes difficult
//No meaningful output
//Developers cannot understand object data
//
//👉 Solution:
//✔ toString() introduced to give human-readable output

//if we dont override it give its default implementation like
// ClassName@hashCode
//Student@1234576
//comes from object class implementation