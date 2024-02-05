/*Acccess specifier -> specifies where a property /method isaccesible .There are four types of access specifier .
 1 -> Public  :- 
 1 -> Private :-
 1 -> Protected :- 
 1 -> Default :-  
*/

class MyEmployee{
    private int id; // id ko private rkha gya hai
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}
public class GetersAndSetters{
    public static void main(String[] args){
        MyEmployee husain = new MyEmployee();
        husain.setName("Code with husain");
        System.out.println(husain.getName());
        husain.setId(1000);
        System.out.println(husain.getId());

    }
} 















