package PolyMorphism;

public class Child extends Parent {

    void LikeToEat(){
        System.out.println("i like to order pizza");
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.LikeToEat();
    }
}
