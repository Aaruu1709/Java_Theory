package Enumeration;

enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNSDAY,THURSDAY,FRIDAY,SATURDAY
}
public class EnumMain {
    public static void main(String[] args) {
        Day d=Day.FRIDAY;
        switch (d){
            case SUNDAY -> System.out.println("Today is sunday");
            case MONDAY -> System.out.println("today is monday");
            case TUESDAY -> System.out.println("today is tuesday");
            case WEDNSDAY -> System.out.println("today is wednsday");
            case FRIDAY -> System.out.println("today is friday");

            default -> System.out.println("inavalid case");
        }
    }
}
