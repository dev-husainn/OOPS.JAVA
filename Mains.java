/* --------------------- constructor me ka hai ye v file -------------------- */


//You can have as many parameters as you want:

public class Mains {
    int modelYear;
    String modelName;
  
    public Mains(int year, String name) { //constructor me parameters liye gye h 
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
      Mains myCar = new Mains(1969, "Mustang"); // object bnaya gya h yha pe ... 
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }
  
  // Outputs 1969 Mustang