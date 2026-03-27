package Aggregation;


//Assignment 1:

class Parent {
    String fname, lname;

    Parent(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
}
    class Marks {
        int m1, m2, m3;

        Marks(int m1, int m2, int m3) {
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        }
    }

        class Address2 {
            int dno;
            String street;
            int pincode;
            String country;

            Address2(int dno, String street, int pincode, String country) {
                this.dno = dno;
                this.street = street;
                this.pincode = pincode;
                this.country = country;
            }
        }
            class Student {
                int sid;
                String sname;
                String schoolName;
                Parent p;
                Marks m;
                Address2 addr;

                Student(int sid, String sname, String schoolName, Parent p, Marks m, Address2 addr) {
                    this.sid = sid;
                    this.sname = sname;
                    this.schoolName = schoolName;
                    this.p = p;
                    this.m = m;
                    this.addr = addr;
                }

                void status() {
                    int total = m.m1 + m.m2 + m.m3;
                    if (total >= 150) {
                        System.out.println("You are pass");
                        System.out.println(sname + " DATA");
                        System.out.println("name:" + sname);
                        System.out.println("School:" + schoolName);
                        System.out.println("parent Data: " + p.fname + " " + p.lname);
                        System.out.println("Marks: " + m.m1 + " " + m.m2 + " " + m.m3);
                        System.out.println("Address: " + addr.dno + " " + addr.street + " " + addr.pincode + " " + addr.country);
                    } else {
                        System.out.println("You are fail");
                        System.out.println(sname + " DATA");
                        System.out.println("name:" + sname);
                        System.out.println("School:" + schoolName);
                        System.out.println("parent Data: " + p.fname + " " + p.lname);
                        System.out.println("Marks: " + m.m1 + " " + m.m2 + " " +m.m3);
                        System.out.println("Address: " + addr.dno + " " + addr.street + " " + addr.pincode + " " + addr.country);

                    }
                }

                public static void main(String[] args) {
//using named object
                    Parent obj = new Parent("kalpana", "shinde");
                    Marks obj2 = new Marks(50, 80, 90);
                    Address2 obj3 = new Address2(200,"Malthan",12345,"INDIA");
                    Student s = new Student(1, "aaruu", "SPIT Poly KURUND", obj, obj2, obj3);
                    s.status();

                    System.out.println("____________________________");

                    //using nameless object:
                    Student s2 = new Student(1, "sauruu", "Asha marine International school", new Parent("rohini","sankapal"), new Marks(50,70,80), new Address2(300,"narhe",412219,"india"));
                    s2.status();


                }
            }