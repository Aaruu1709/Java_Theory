package JavaInterviewQuestion.FinalFinallyFinalizePractical.FinalDemo;

public class Employee {
    String name;
    int empid;
//     String final company="google";//unexpected
    final String  company="google";
    //fianl fileld we must to initialize ..do not leave blank just like instance filed.
    //so we need to final String company="google";
    void PrintEmployeeDetails(){
        System.out.println("Emp Name : "+ name );
        System.out.println("Emp id : "+ empid);
        System.out.println("Employee Company name : "+ company);
    }
}
//*************************** 2nd way to initilizing value to final *********************************
//there is another way to initializing the the filed ..we can give the value direclty or
//we can use constructor
//by usng constructor we can set comapnay value
//so code becomes

//class Employee{
//    private String name;
//    private int empid;
//    private String companyName;

    //create constructor for give company name
//    Employee(){
//        companyName="google";
//    }
//}
//main method is just same no changes

//*************************** 3rd our requirement is to set more than empl have different comapany name then we should use dyanamic constructor *********************************
//two diffeent emp and they might be work in two different company so
//insteed of initializing this as a constructor , i need some kind of dynamic initialization
//so that i can have different valu for different object,so for that we do constuctor
//like that ,,insteed of harcoding value we just put this

//Employee(String companyName){
//    this.companyName=companyName;
//}

//so whenever we create object of employee ,we pass a company in this argument
//and whatever pass here just set in instance filed


//so our final code becoame:
//class Employee{
//    private String name;
//    private int empid;
//    private String companyname;
//
//    Employee(String companyname){
//        this.companyname=companyname;
//    }
//
//    void printEmployeeDetails(){
//        System.out.println("emp name:"+ name);
//        System.out.println("emp empid "+empid);
//        System.out.println("emp company name:"+companyname);
//    }
//}
//
//class EmployeeMain{
//    public static void main(String[] args) {
//        Employee e1=new Employee("Amazon");
//        e1.name="kavita";
//        e1.empid=123;
//
//        e1.printEmployeeDetails();
//
//        Employee e2=new Employee("Tatiana P");
//        e1.name="Surbhi";
//        e1.empid=456;
//        e2.printEmployeeDetails();
//
//    }
//}
//this is all we see how final work with variable,,,now next we see how final work with method
//we add one method name greet:
//public void greet(){
//    System.out.println("geet from employee");
//}
//also
//create one more class named intern this extend from employee
//so

//public class Intern extends Employee{
//    public void greet(){
//        System.out.println("greet from intern");//override method from employee
//    }
//}

//we need one simple constructor
//another one with no filed
//also another class we create named manager..they aslo have different implementation
//we create object of all 3..employee, intern and manager

//Employee e=new Employee();
//e.greet();
//
//Intern intern=new Intern();
//intern.greet();
//
//Manager manager=new Manager();
//manager.greet();

//all three greet stmt printed...but when we do great method in Employee class final then we got error
//we write final method like
//add final before return type
//public final void greet(){
//    System.out.println("hello from employee");
//}
//then we we try to override it then greet can not overrite ..bcoz overriden method is final

//we can overide other method easiliy

//when we do class as fianl then we can not make child class
//so this final work at method level, fileld level and class leve;

//if filed is final=>cant change value of it
//if method is final => can not override it
//if class is fianl => we can not inherit / make child class of it