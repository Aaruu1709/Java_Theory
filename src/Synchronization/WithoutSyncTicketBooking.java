package Synchronization;
//synch and withoiut sync method we used here.....
class TicketBooking{
    int tickets=1;
   synchronized void bookTicket(String name){
        if(tickets>0){
            System.out.println(name+"is booking ticket...");
            tickets--;
            System.out.println(name+"booked tickets");
        }
        else {
            System.out.println("no tickets are available for"+ name);
        }

    }
}

class MyThread extends Thread{
    TicketBooking t;
    String name;
    MyThread(TicketBooking t,String name){
        this.t=t;
        this.name=name;
    }

    public void run(){
        t.bookTicket(name);
    }
}
public class WithoutSyncTicketBooking {
    public static void main(String[] args) {
        TicketBooking t=new TicketBooking();
        MyThread t1=new MyThread(t,"user1");
        MyThread t2=new MyThread(t,"use2");

        t1.start();
        t2.start();
    }
}



//----------------------------------------------------
//synchronized ensures that:only one thread enters method at a time