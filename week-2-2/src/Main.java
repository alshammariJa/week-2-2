public class Main {
    public static void main(String[] args) {
  ///////////////Account///////
        Account account_1= new Account("2","sara");
        Account account_2= new Account("2","sara" ,5);
        Account x =new Account();

        account_1.setId("5");
        account_1.setName("jamelah");
        System.out.println(account_1.getName());
        System.out.println(account_1.getId());

        account_2.setName("suad") ;
        account_2.setId("12");
        account_2.setBalance(33);
        System.out.println(account_2.getId() );
        System.out.println(account_2.getName());
        System.out.println(account_2.getBalance() );

        System.out.println(account_2.getBalance());
        System.out.println(account_2.credit(100));


        System.out.println(account_2.getBalance());
        System.out.println(account_2.debit(222));
        System.out.println(account_2.transfer(22,133));


        System.out.println( account_2.toString() );


/////////////////////////////class Employee/////////////

        Employee employee =new Employee("15","reem" ,15000);
        employee.setId("29");
        employee.setName("fitemah");
        employee.setSalary(12000);
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.annualSalary());
        System.out.println(employee.raise(1500));
        System.out.println(employee.toString());













    }

}