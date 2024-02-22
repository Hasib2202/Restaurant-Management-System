package classes;
//package classes;
import java.lang.*;
import interfaces.*;

//import interfaces.IEmployeeOperation;

public class  Employee 
{
    public String employeeName;
    public Double salary;
    public String employeeId;
    public String phoneNumber;
    public String designation;
    public double balance;
    public String unit;

    void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }

    void setSalary(double salary){
        this.salary=salary;
    }

    void setEmployeeId(String employeeId){
        this.employeeId=employeeId;
    }

    void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    void setDesignation(String designation){
        this.designation=designation;
    }

    public Employee(){};
    public Employee(String employeeName, double salary, String employeeId, String phoneNumber, String designation, String unit){
        this.employeeName=employeeName;
        this.employeeId=employeeId;
        this.salary=salary;
        this.phoneNumber=phoneNumber;
        this.designation=designation;
        this.unit=unit;
        this.balance=0;
    }

    void getEmployeeDetails()
    {
        System.out.println("-----------------------------------------");
        System.out.println("Employee Name    : "+employeeName);
        System.out.println("Employee ID      : "+employeeId);
        System.out.println("Unit             : "+unit);
        System.out.println("Designation      : "+designation);
        System.out.println("Salary           : "+salary);
        System.out.println("Contact          : "+phoneNumber);
        System.out.println("-----------------------------------------");
    }

    

    void withdrawBalance(double amount){
        if(amount<=this.balance){
            this.balance=this.balance-amount;
            System.out.println("Successful Withdrawal\nCurrent Balance: "+this.balance);
        }
        else System.out.println("Invalid Amount");
    }

    void checkBalance(){
        System.out.println("Your Balance: "+this.balance);
    }

    
}
