/*
    enumerated types
    modifier enum name { value_name0, value_name1, …, value_namen−1 };
    Note that the Java convention is that these should usually be capitalized words
 */

public class DayTripper {
    public enum Day {MON, TUE, WED, THU, FRI, SAT, SUN};
    public static void main(String[] args){
        Day d = Day.MON;
        System.out.println("Initially d is: " + d);
        d = Day.WED;
        System.out.println("Now, d is: " + d);
        Day t = Day.valueOf("WED");
        System.out.println("Are d and t are the same? " + (d == t));
    }

}

The output is as follows:

Initially d is: MON
Now, d is: WED
Are d and t are the same? true

Remark: Enum types also have a few built-in methods, including a method valueOf, which 
        returns the enum value that is the same as a given string. 
