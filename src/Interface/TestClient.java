//package Interface;
//
//interface Bank           //abstract
//{
//    int limit=40000;          //public static final
//    void rateOfInterest();    //public+abstract
//   default void display(){
//
//   }
//}
//
//class AxisBank implements Bank{
//    public void rateOfInterest(){
//        System.out.println("SBI bank ROI 11.99...withdraw limit is:"+ Bank.limit);
//    }
//    public void display(){
//        System.out.println("all ifo regarding bank");
//    }
//}
//class SbiBank implements Bank{
//    public void rateOfInterest(){
//        System.out.println("SBI bank of interest 10.00...withdraw limit is:"+ Bank.limit);
//    }
//
////    @Override
////    public void display() {
////        System.out.println("all ifo regarding SBI bank");
////    }
////}
//class TestClient
//{
//    void info(Bank b){
//        b.rateOfInterest();
//        b.display();
//    }
//    public static void main(String[] args) {
//
//
//        AxisBank ax=new AxisBank();
//        ax.rateOfInterest();
//
//        SbiBank sb=new SbiBank();
//        sb.rateOfInterest();
//
//        System.out.println("________________________");
//TestClient t=new TestClient();
//t.info(new AxisBank());
//t.info(new SbiBank());
//
//    }
//}