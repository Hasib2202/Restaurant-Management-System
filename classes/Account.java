package classes;
//package classes;
import java.lang.*;
import interfaces.*;

public /*abstract*/  class Account extends Restaurant /*implements IAccountOperation*/  {
    public double revenue;

    public void giveSalary(){
        int i=0;
        while(i<employees.length){
            if(employees[i]!=null){
                //System.out.println(i);
                
                employees[i].balance=employees[i].balance+employees[i].salary;
                //System.out.println(employees[i].balance);
                this.revenue=this.revenue-employees[i].salary;
                //System.out.println(this.revenue);
            }
            i++;
        }
    }

    public double goBalance(String ID){
        int i=0;
        while(i<employees.length){
            if(employees[i]!=null){
                if(employees[i].employeeId.equals(ID)){
                    return employees[i].balance;
                }
            }
            
            i++;
        }
        return 0;
    }

    public void addMoney(double amount){
        this.revenue=this.revenue+amount;
    }

    public void releaseMoney(double amount){
        this.revenue=this.revenue-amount;
    }

    public Account(){
        this.revenue=1000000;
    }

    public void withdraw(String ID, double amount){
        int i=0;
        while(i<employees.length){
            if(employees[i]!=null){
                if(employees[i].employeeId.equals(ID)){
                    employees[i].balance=employees[i].balance-amount;
                    break;
                }
            }
            i++;
        }
    }
}
