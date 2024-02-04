/* ------------------------------- -problem 1 ------------------------------- */
 /* create a class employee with following properties : 
 salary(propery)(int)
 getSalary(method returning int)
 name (property )(string)
 getaName(method returning string)
 setName(method changing name)



/* 
class Employee {
    int salary ;
    String name;
    public int getSalary(){
        return salary;

    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class practice {
    public static void main(String[] args) {
        //problem 1
        Employee husain = new Employee();
        husain.setName("Code with husain");
        husain.salary = 50000;
        System.out.println(husain.getSalary());
       System.out.println(husain.getName());
       
    }

} */















/* -------------------------------- problem-2 ------------------------------- */

/*
 create a class cellphone with methods to print "ringing, vibrating, ...etc"
*/
/* 
   class cellphone {
    public void ringing(){
        System.out.println("RINGING.......");
    }
    public void vibrating(){
        System.out.println("VIBRATING.....");
    }
    public void callFriend(){
        System.out.println("CALLING ....");
    }

}
public class practice{
    public static void main(String[] args){
        cellphone asus =  new cellphone(); //yha class ka object bnaya gya hai ... cellphone apna class hai aur usi ka objet bnega
        asus.callFriend();
        asus.vibrating();
        asus.ringing();

    }
} */










/* ------------------------------- problem - 3 ------------------------------ */
/*Create a class Square with a method to initialize its side, calculating area, perimeter, etc.....*/

/*
class Square{
    int side;
    public int area(){
        return side * side ;
    }
    public int perimeter(){
        return 4 * side ;

    }
}
public class practice{
    public static void main(String[] args){

        Square sq = new Square();
        sq.side = 3;
        System.out.println("Area is : " + sq.area());
        System.out.println("Perimeter is: " +sq.perimeter());
    }
}  */












/* -------------------------------- pronlem-4 ------------------------------- */

/*
 create a rectangle and repeat 3
*/

/* 
class rectangle{
    int length;
    int breadth;
    public int area (){
        return length * breadth;
    }
}
    public class practice{
        public static void main(String[] args){
            rectangle side = new rectangle();
            side.length = 4;
            side.breadth = 5;
            
            System.out.println("The area of rectangle is : " + side.length * side.breadth );
        }
    }
    /* ------------------------------------ - ----------------------------------- */














/* -------------------------------- problem-5 ------------------------------- */
/*
  create a class TommyVecetti for Rockstar Games capable of hitting (print hitting), running , firing, etc...
*/

/* 
class TommyVecetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Runing from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class practice{
    public static void main(String [] args){
        TommyVecetti playerOfGta = new TommyVecetti();
        playerOfGta.hit();
        playerOfGta.run();
        playerOfGta.fire();
    }
} */
















/* -------------------------------- problem-5 ------------------------------- */

// repeat 4 for a circle

class circle{
    int pi;
    int rad1;

    public int problem(){
        return pi * rad1 * rad1;
    }
}
    public class practice{
        public static void main(String[] args){
            circle player = new circle();
            player.pi = (int)3.14;
            player.rad1 = 4;
            System.out.println("The area of circle is : " + player.pi * player.rad1 * player.rad1);
        }
    }

    /* ------------------------------------ - ----------------------------------- */






