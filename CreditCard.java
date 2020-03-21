public class CreditCard {
    //instance variables:
    private String number;
    private String name;
    private String bank;
    private double balance;
    private int limit;

    //constructor:
    CreditCard(String number, String name, String bank, double balance, int limit){
        this.number = number;
        this.name = name;
        this.bank = bank;
        this.balance = balance;//money that already needs to pay
        this.limit = limit;
    }

    //accessor methods:
    public String getNumber(){return number;}
    public String getName(){return name;}
    public String getBank(){return bank;}
    public double getBalance(){return balance;}
    public int getLimit(){return limit;}

    //action methods:
    public boolean chargeIt(double price){
        if (price + balance > (double)limit){
            return false; //there's not enough money left to charge it.
        }
        balance += price;
        return true;
    }

    public void makePayment(double payment){
        balance -= payment;
    }

    public static void printCard(CreditCard c){
        System.out.println("Number = " + c.getNumber());
        System.out.println("Name = " + c.getName());
        System.out.println("Bank = " + c.getBank());
        System.out.println("Balance = " + c.getBalance());
        System.out.println("Limit = " + c.getLimit());
    }
}

//Here comes the test class
public class Test {
    public static void main(String[] args){
        CreditCard wallet[] = new CreditCard[10];//initialize an array of type CreditCard, named wallet
        wallet[0] = new CreditCard("0","Name0","Bank0", 0, 2500);
        wallet[1] = new CreditCard("1","Name1","Bank1", 0, 3500);
        wallet[2] = new CreditCard("2","Name2","Bank2", 0, 5000);

        for (int i = 1; i <= 16; i++){
            wallet[0].chargeIt((double)i);
            wallet[1].chargeIt(2*i);
            wallet[2].chargeIt((double)3*i);
        }

        for (int i = 0; i < 3; i++){
            CreditCard.printCard(wallet[i]);
            while (wallet[i].getBalance() > 100){
                wallet[i].makePayment(100);
                System.out.println("New balance of wallet " + i + " is " + wallet[i].getBalance());
                System.out.println();
            }
        }
    }
}


The output is as follows:

Number = 0
Name = Name0
Bank = Bank0
Balance = 136.0
Limit = 2500
New balance of wallet 0 is 36.0

Number = 1
Name = Name1
Bank = Bank1
Balance = 272.0
Limit = 3500
New balance of wallet 1 is 172.0

New balance of wallet 1 is 72.0

Number = 2
Name = Name2
Bank = Bank2
Balance = 408.0
Limit = 5000
New balance of wallet 2 is 308.0

New balance of wallet 2 is 208.0

New balance of wallet 2 is 108.0

New balance of wallet 2 is 8.0
