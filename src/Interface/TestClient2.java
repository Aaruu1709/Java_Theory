package Interface;

interface Party{
    void eat();
    default void common_eat()
    {
        System.out.println("Ice-cream, fruits salad...");
    }
}
class Veg implements Party{
    public void eat()
    {
        System.out.println("paneer dal sambar");
    }
}
class NonVeg implements Party
{
    public void eat(){
        System.out.println("chicken mutton fish...");
    }
}
class TestClient2{
    public static void main(String[] args) {


        Veg v=new Veg();
        v.eat();
        v.common_eat();

        NonVeg nv=new NonVeg();
        nv.eat();
        nv.common_eat();
    }
}