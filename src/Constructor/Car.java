package Constructor;

public class Car {
    private Engine engine;

    Car(Engine engine){
       this.engine=engine;
    }

    void Carstart(){
        engine.EngineStart();
        System.out.println("car started");
    }
    public static void main(String[] args) {

        Engine engine=new Engine();
        Car car=new Car(engine);
        car.Carstart();

    }
}
