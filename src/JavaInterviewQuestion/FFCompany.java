package JavaInterviewQuestion;

public  class FFCompany {
    int id;
    String name;
     String company;
    FFCompany(){

    }
    FFCompany(int id,String name,String company){
        this.id=id;
        this.name=name;
        this.company=company;
    }

    public void PrintEmployee(){
        System.out.println("id : "+ id);
        System.out.println("name:  "+ name);
        System.out.println("comapny: "+company);
    }
    public  void greet(){
        System.out.println("hello, from comapny");
    }

}
