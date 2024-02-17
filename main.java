
class Person {
    int id ;        // here id and name are not variables they are attribute 
    String name;    //in class they are called as attribute.
}
public class main{
    public static void main(String[] args){
System.out.println("This is our custom class: ");
Person husain  = new Person(); //Instanciating a new employee object.

//Setting properties 
husain.id = 20;
husain.name = "CHAI";
System.out.println(husain.id);
System.out.println(husain.name);

}
}



---------------------- Access Methods With an Object --------------------- */

public class main{

    //fullThrotle() name se maethod bnaya .
    public void fullThrottle(){
        System.out.println("The car is moving with its full speed");
    }

    //speed() name se ek aur method bnaya aur parameter ek diya h .
    public void speed (int maxSpeed){
        System.out.println("The max speed is : " +maxSpeed );
    }

    //Inside main, call the methods on the myCar object
    public static void main(String[] args){
        main myCar =  new main();       //object create kiye hai myCar ke name se.
        // By using the new keyword we created an object with the name myCar.


        myCar.fullThrottle();           // Call the fullThrottle() method
        myCar.speed(300);      // Call the speed() method
        

    }
}  

/* ----------------------------------- == ----------------------------------- */

public class main {
    public void fullThrottle() {
      System.out.println("The car is going as fast as it can!");
    }
  
    public void speed(int maxSpeed) {
      System.out.println("Max speed is: " + maxSpeed);
    }
  }
  
  class Second {
    public static void main(String[] args) {
      main myCar = new main();     // Create a myCar object
      myCar.fullThrottle();      // Call the fullThrottle() method
      myCar.speed(200);          // Call the speed() method
    }
  }
