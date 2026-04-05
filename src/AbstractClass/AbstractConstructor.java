package AbstractClass;

abstract class AbstractConstructor {
    AbstractConstructor(){
        System.out.println("Abstract class parent constructor");
    }

}
class Random extends AbstractConstructor{
    Random(){
        super();
        System.out.println("here i created random class normal condtructor");
    }

    public static void main(String[] args) {
        //call method random
        new Random();
    }
}
