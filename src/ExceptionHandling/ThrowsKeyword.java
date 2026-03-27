package ExceptionHandling;

public class ThrowsKeyword {


    void student() throws InterruptedException {
        System.out.println("aanuu is slepping");
        Thread.sleep(5000);
        System.out.println("still anu is sleeping");
    }
    void hod() throws InterruptedException{
        student();
    }
    void principal(){
        try{
            hod();
        }
        catch (InterruptedException e){
            System.out.println("Exception is comming");
        }

    }
    void officeBoy(){
        principal();
    }
    public static void main(String[] args) {
        ThrowsKeyword tk=new ThrowsKeyword();
        tk.officeBoy();

    }
}
//if eceryone is trowing exception main method also..so jvm is responsible for throw exception
