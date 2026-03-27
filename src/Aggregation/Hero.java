package Aggregation;

//Address.java
class Address{
    int roomno;
    String street;
    String city;
    String state;
    Address(int roomno,String street,String city,String state){
        this.roomno=roomno;
        this.street=street;
        this.city=city;
        this.state=state;
    }
}


//Movies.java
class Movie{
    String hollywood;
    String bollywood;
Movie(String hollywood,String bollywood){
    this.hollywood=hollywood;
    this.bollywood=bollywood;
}
}

//Hero.java
class Hero{
    //instance variable
    String name;
    int age;
    int height;
    Address addr;
    Movie mov;

    Hero(String name,int age, int height,Address addr,Movie mov){
        this.name=name;
        this.age=age;
        this.height=height;
        this.addr=addr;
        this.mov=mov;
    }

    void display() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("height: " + height);
        System.out.println("address: " + addr.roomno + " " + addr.street + " " + addr.city + " " + addr.state);
        System.out.println("movies: " + mov.hollywood + " " + mov.bollywood);
    }
        public static void main(String[] args){
            Address a=new Address(205,"narhe","pune","maharashtra");
            Movie m=new Movie("shadii mein jarur aana","96");
            Hero h=new Hero("aaruu",26,5,a,m);
               h.display();
            System.out.println("_____________________________________");

            Address a2=new Address(200,"malthan","pune","maharashtra");
            Movie m2=new Movie("Chale Aana","Photo");
            Hero h2=new Hero("sauruu",26,168,a,m);
            h2.display();

            System.out.println("____________nameless object-better way___________");

            Hero h3=new Hero("sauruu",26,168,new Address(200,"Maltahn","Pune","Maharashtra"),new Movie("Saiyara","Marjava"));
              h3.display();
        }
    }

