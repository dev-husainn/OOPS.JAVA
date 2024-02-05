/* ----------------------- practice set on constructor ---------------------- */
/*NOTES : 
-->>  private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.


 -->> Provide public get and set methods to access   and update the value of a private variable

 -->> The get method returns the variable value, and the set method sets the value.
*/



/* -------------------------------- problem-1 ------------------------------- */
/*create a class cylinder and use getter and setter to set its radius and height also calculate surfacearea of cylinder and its volume*/

/*class Cylinder {
    private int radius;
    private int height;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius ;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height ;
    }
    public double surfaceArea(){
            // surface area of cylinder= 2πr^2 + 2πrh
            return 2 * 3.14 * radius * radius + 2 * 3.14 * radius * height;
    }
    public double volume(){
        //volume of cylinder = π r² h
        return 3.14 * radius * radius * height;
    }
     //pi ki value ke jgh hm Math.PI likh skte h Pi ki absolute value k liye..
}
public class PracticeConstructor{
    public static void main(String [] args){
        Cylinder myCylinder = new Cylinder(); //Object bna h
        myCylinder.setHeight(12);
        myCylinder.getHeight();
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
    }

} */











/* -------------------------------- problem-2 ------------------------------- */
//overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle (){
            this.length = 4;
            this.breadth = 5;
    }
    public Rectangle (int length, int breadth){  //with parameters
        this.length = length;
        this.breadth = breadth;
}
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth ;
    }
}

public class PracticeConstructor{
    public static void main(String[] args){
        Rectangle rect = new Rectangle(12,55);
        System.out.println(rect.getLength());
        System.out.println(rect.getBreadth());
            //ye dono parameters wale k liye output 12,55 denge

         /*  Rectangle rect = new Rectangle();
            System.out.println(rect.getLength()); 
            System.out.println(rect.getBreadth()); 
        
           ye dono to without parameters ke liye output 4 , 5 denge  */


        


    }
}


