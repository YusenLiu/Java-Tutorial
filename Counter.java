public class Counter {
    protected int count;

    Counter(){
        count = 0;
    }

    public int getCounter() {
        return count;
    }

    public void setCounter(int i){
        this.count = i;
    }

    public void incrementCounter(){
        this.count++;
    }

    public void decrementCounter(){
        this.count--;
    }

    public static void main(String[] args){
        Counter c;
        c = new Counter();
        Counter d = new Counter();
        d = c;
        System.out.println(d);
        System.out.println(c);
        d.setCounter(2);
        System.out.println(d.count);
        System.out.println(c.count);
        c.setCounter(4);
        System.out.println(d.count);
        System.out.println(c.count);
    }

}


The output is as follows: (the first two lines are the address of both d and c, the rest are d's and c's "count")

com.Yusen.Counter@4554617c
com.Yusen.Counter@4554617c
2
2
4
4
