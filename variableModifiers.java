The scope (or visibility) of instance variables can be controlled through the use of the following variable modifiers:
  • public: Anyone can access public instance variables.
  • protected: Only methods of the same package or of its subclasses can access protected instance variables.
  • private: Only methods of the same class (not methods of a subclass) can access private instance variables.
  
  • If none of the above modifiers are used, the instance variable is considered friendly. Friendly instance variables can be accessed 
    by any class in the same package. 
  
In addition to scope variable modifiers, there are also the following usage modifiers:
  • static: The static keyword is used to declare a variable that is associated with the class, not with individual instances of that 
    class. Static variables are used to store "global" information about a class (for example, a static variable could be used to maintain 
    the total number of Gnome objects created). Static variables exist even if no instance of their class is created.
  • final: A final instance variable is one that must be assigned an initial value, and then can never be assigned a new value after that. 
    If it is a base type, then it is a constant (like the MAX_HEIGHT constant in the Gnome class). If an object variable is final, then it 
    will always refer to the same object (even if that object changes its internal state). 


public class Gnome {
    //instance variables:
    public String name;
    public int age;
    public Gnome gnomeBuddy;
    private boolean magical = false;
    protected double height = 2.6;
    public static final int MAX_HEIGHT = 3;

    //constructors:
    Gnome(String nm, int ag, Gnome bud, double hgt){ // fully parameterized
        name = nm;
        age = ag;
        this.gnomeBuddy = bud;//not necessarily to use "this" in this case
        this.height = hgt;//but it would be good if using "this"
    }
    Gnome(){ //default constructor
        name = "Rumple";
        age = 204;
        gnomeBuddy = null;
        height = 2.1;
    }

    //methods:
    public static void makeKing(Gnome h){
        h.name = "King " + h.getRealName();
        h.magical = true;
    }

    public boolean isMagical(){
        return magical;
    }
    public void setHeight(int newHeight){
        this.height = newHeight;
    }
    public String getName(){
        return "I won't tell!";
    }
    public String getRealName(){
        return this.name;
    }
    public void renameGnome(String s){
        this.name = s;
    }

    public static void main(String[] args){
        Gnome gn = new Gnome();
        System.out.println("Is gn magical? " + gn.isMagical());
        System.out.println("getName of gn: " + gn.getName());;
        System.out.println("getRealName of gn: " + gn.getRealName());
        gn.renameGnome("Tom");
        System.out.println("Rename gn and now his name is: " + gn.getRealName());
        makeKing(gn);
        System.out.println("Make king of gn, and his name is: " + gn.getName());
        System.out.println("gn's real name is now: " + gn.getRealName());
        System.out.println("Is gn magical now? "+ gn.isMagical());
    }
}

The output is as follows:

Is gn magical? false
getName of gn: I won't tell!
getRealName of gn: Rumple
Rename gn and now his name is: Tom
Make king of gn, and his name is: I won't tell!
gn's real name is now: King Tom
Is gn magical now? true


Remark: I made a mistake at first. In the method makeKing(Gnome h), I wrote 'magical = true' instead of 'h.magical = true'.
        Then it came to an error, since 'magical' is a private boolean. However, the method makeKing(Gnome h) is static. 
        Non-static field 'magical' cannot be referenced from a static context. So one way to fix this is declaring "magical" to be static.



  

