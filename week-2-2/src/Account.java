public class Account {
   private String id;
     private String name;
   private int balance;
   public Account (String id, String name ){
       this.name=name ;
       this.id=id;
   }
   public Account(String id, String name, int balance){

       this.name=name;
       this.id =id;
       this.balance =balance;
   }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public Account() {

    }
    public int credit(int amount){
        return balance+= amount;

    }
    public int debit(int amount){

       if(balance>=amount){
           balance-= amount;
       }else{
           System.out.println("error");
       }
       return balance;
    }

 public int transfer(int another_Account,int amount){
      if( balance>=amount  ){
          System.out.println(" transfer done");
     }else {
          System.out.println(" transfer error");
      }
       return 0;
 }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
