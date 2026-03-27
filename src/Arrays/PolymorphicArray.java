package Arrays;

class Animal {

}
class Dog extends Animal { }
class Puppy extends Dog { }

public class PolymorphicArray {
    public static void main(String[] args) {

        Animal[] a = new Animal[3];
        a[0] = new Animal();
        a[1] = new Dog();
        a[2] = new Puppy();

        for (Animal x : a) {
            System.out.println(x);
        }
    }
}

