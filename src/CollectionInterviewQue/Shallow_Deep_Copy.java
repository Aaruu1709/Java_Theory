package CollectionInterviewQue;


class Address{
    String city;
    Address(String city){
        this.city=city;
    }
}

class Studentt{
    int id;
    Address address;

    Studentt(int id,Address address){
        this.id=id;
        this.address=address;

    }
}

//
//
////🔥 1. Shallow Copy Example
//public class Shallow_Deep_Copy {
//    public static void main(String[] args) {
//        Address addr=new Address("Pune");
//        Studentt s1=new Studentt(1,addr);
//
//
//        //shallow copy
//        Studentt s2=s1;
//
//        //change in s2
//        s2.address.city="Belgium";
//
//        System.out.println(s1.address.city);//Belgium
//        System.out.println(s2.address.city);//Belgium
//    }
//}


//🔥 2. Deep Copy Example

public class Shallow_Deep_Copy {
  public static void main(String[] args) {
  Address addr1=new Address("pune");
  Studentt s1=new Studentt(1,addr1);

  //Deep copy (manually)
      Address addr2 =new Address(s1.address.city);
      Studentt s2=new Studentt(s1.id,addr2);

      //change in s2
      s2.address.city="Panama";

      System.out.println(s1.address.city); // Pune ✅
      System.out.println(s2.address.city); // Mumbai

  }
  }