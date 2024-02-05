
/* 
class Myemployee{
    private int id;
    private String name;

    public String getName(){
        return name ;
    }
    public void setName(String n){
        this.name = n ;
    }
    public void setId(int i){
        this.id = i ;
    }
    public int getId(){
        return id ;
    }
   
}
public class constructor {
    public static void main(String[] args) {
        Myemployee husain = new Myemployee();
        husain.setName("Code with husain");
        husain.getName();
    }
}  */
/* ------------------------------------ - ----------------------------------- */



/* -----------------------------------------------CONSTRUCTOR ------------------------------ ---------------------*|

** CONSTRUCTOR -->> A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created.


** Constructor ->> a member function used to initialize an object while creating it.   

-->>In order to write our own constructor we define a method with name same as the class name...

-->>construtor ->  sare methods ko bar bar run naa krne ke liye constructor ka use hota hai constructor se hm sb kuch ek hi jgh ek line me likh denge .... (na ki upr wale code ke trh jo bar bar method ko run krna pd rha )
*/
// class Myemployee{
//     private int id;
//     private String name ; 
//     public Myemployee(){ // constructor name is same as class name 
//         id = 45;
//         name = "Husain Ahmad Ansari " ;
//     }
// }
/* 
// Create a class
public class constructor {
    int x;  // Create a class attribute
  
    // Create a class constructor for the constructor class
    public constructor() {
      x = 5;  // Set the initial value for the class attribute x
    }
  
    public static void main(String[] args) {
      constructor myObj = new constructor(); // Create an object of class constructor (This will call the constructor)
      System.out.println(myObj.x); // Print the value of x
    }
  }
  
  // Outputs 5   */
    
/* ------------------------------------ - ----------------------------------- */
/* Constructor Parameters :>
Constructors can also take parameters, which is used to initialize attributes.

The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y). When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:

Example ---    */ 
public class Constructor {
  int x;

  public Constructor(int y) { // constructor bna h yha 
    x = y;
  }

  public static void main(String[] args) {
    Constructor myObj = new Constructor(5);
    System.out.println(myObj.x);
  }
}


// Outputs 5
 




























