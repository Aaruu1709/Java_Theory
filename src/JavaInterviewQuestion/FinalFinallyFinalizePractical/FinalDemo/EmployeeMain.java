package JavaInterviewQuestion.FinalFinallyFinalizePractical.FinalDemo;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.name="aaruu";
        e.empid=123;
//        e.company="delloite";
        //Cannot assign a value to final variable 'company'...we got error bcoaz we already have to set it as google.
        // so we remove it and call the method to print
        e.PrintEmployeeDetails();//so here we can see that name id and company name google is printed
    }
}
