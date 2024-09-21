
import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;

public class Start{
    public static void main(String[]args)
    {
        String space = "                                                     ";
        Account account=new Account();
        foodOrder food=new foodOrder();
        Feedback feedback=new Feedback();
        Scanner in1=new Scanner(System.in);
        
        boolean repeat=true;
        boolean b=false;
        
        Login login=new Login();
        //Login login=new Login();
        System.out.println("                                       ============Welcome to Restaurant X============\n");
        while(repeat){
            int a;
            System.out.println(space+"1. Login Staff only\n"+space+"2. Customer Helps\n"+space+"3. Exit");
            System.out.print("\n"+space+" >>");
            a=in1.nextInt();
            switch(a){
                case 1:
                boolean repeat1=true;
                while(repeat1){
                    
                    Scanner in2=new Scanner (System.in);
            
                    System.out.println(space+"=======Log In=======");
                    System.out.print("User Name: ");
                    login.setUser(in2.nextLine());
                    System.out.print("Password: ");
                    login.setPass(in2.nextLine());
                    if(login.checkReg()!="a") b=true;
                    if(b) {
                        Scanner in3=new Scanner(System.in);
                        System.out.println("Welcome "+login.getEmployeeName(login.getId())+"\n");
                        //b=false;
                        //from here
                        boolean repeat2=true;
                        //while(true){
                        if(login.checkReg().equals("00")){//ceo
                            while(repeat2){  
                                boolean repeat5=true;
                                //byte t5;
                                System.out.println("1. Employee\n2. Accounts");
                                System.out.println("3. Recipe/Menu\n4. Proposal and Feedback\n5. Notice\n6. New Branch\n7. Change Password\n8. Log out");
                                System.out.print(space+" >>");
                                byte selection=in1.nextByte();

                                switch(selection){
                                    case 1:
                                        boolean repeat3=true;
                                        while(repeat3){
                                            System.out.println("1. Recruit Employee\n2. Sack Employee\n3. Search Employee\n4. All Employees\n5.Go Back");
                                            System.out.print(space+" >>");
                                            byte selection1=in1.nextByte();
                                        //Login login=new Login();
                                            switch(selection1){
                                                case 1:
                                                    System.out.print("Employee Name    : ");
                                                    String name=in3.nextLine();
                                                    System.out.print("Employee ID      : ");
                                                    String id=in3.nextLine();
                                                    System.out.print("Designation      : ");
                                                    String des=in3.nextLine();
                                                    System.out.print("Unit             : ");
                                                    String unit=in3.nextLine();
                                                    System.out.print("Salary           : ");
                                                    double salary=in1.nextDouble();
                                                    System.out.print("Contact          : ");
                                                    String pn=in3.nextLine();
                                                    System.out.print("Access Password  : ");
                                                    String pass=in3.nextLine();
                                                    Employee e1=new Employee(name, salary, id, pn, des, unit);
                                                //Login login=new Login();
                                                    login.addEmployee(e1);
                                                    login.register(e1, pass);
                                                    break;
                                                case 2:
                                                    System.out.print("Employee ID      : ");
                                                    String id1=in3.nextLine();
                                                //Login l2=new Login();
                                                    login.removeEmployee(id1);
                                                    break;
                                                case 3:
                                                    System.out.println("Search by");
                                                    System.out.println("1. Employee Name\n2. Employee ID\n3. Contact\n4. Designation\n5. Unit");
                                                    System.out.print(space+" >>");
                                                    byte selection3=in1.nextByte();
                                                    switch(selection3){
                                                        case 1:
                                                            System.out.print("Employee Name: ");
                                                            String name1=in3.nextLine();
                                                        //Login l3=new Login();
                                                            login.searchEmployeeName(name1);
                                                            break;
                                                        case 2:
                                                            System.out.print("Employee ID: ");
                                                            String id3=in3.nextLine();
                                                            login.searchEmployeeId(id3);
                                                            break;
                                                        case 3:
                                                            System.out.print("Contact: ");
                                                            String phone=in3.nextLine();
                                                            login.searchEmployeeContact(phone);
                                                            break;
                                                        case 4:
                                                            System.out.print("Designation: ");
                                                            String des1=in3.nextLine();
                                                            login.searchEmployeeDesignation(des1);
                                                            break;
                                                        case 5:
                                                            System.out.print("Unit: ");
                                                            String u=in3.nextLine();
                                                            login.searchEmployeeUnit(u);
                                                            break;
                                                    }
                                                    break;
                                                case 4:
                                                    System.out.println("----------All Employees Details----------\n");
                                                    login.getAllEmployeesDetails();
                                                    break;
                                                case 5:
                                                    repeat3=false;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        boolean repeat4=true;
                                        while(repeat4){
                                            System.out.println("1. Revenue\n2. Expendeture\n3. Give Salary\n4. Go Back");
                                            System.out.println(space+" >>");
                                            byte t2=in1.nextByte();
                                            switch(t2){
                                            case 1:
                                                System.out.println("Revenue: "+account.revenue);
                                                break;
                                            case 2:
                                                System.out.print("Amount: ");
                                                double amount=in1.nextDouble();
                                                account.revenue=account.revenue-amount;
                                                System.out.println("Amount Paid: "+amount+"\nRevenue: "+account.revenue);
                                                break;
                                            case 3:
                                                account.giveSalary();
                                                System.out.println("Salary Given");
                                                break;
                                            case 4:
                                                repeat4=false;
                                                break;
                                            }
                                        }
                                        break;
                                    case 3:
                                        while(repeat5){
                                            System.out.println("1. Menu\n2. Remove Menu Item\n3. Add Menu Item\n4. Recipes\n5. Go Back");
                                            System.out.print(space+" >>");
                                            byte t5=in1.nextByte();
                                            switch(t5){
                                                case 1:
                                                    food.menu();
                                                    break;
                                                case 2:
                                                    System.out.print("Food Item Name on the Menu: ");
                                                    String name=in3.nextLine();
                                                    food.removeMenuItem(name);
                                                    break;
                                                case 3:
                                                    System.out.print("Menu Item Name: ");
                                                    String name1=in3.nextLine();
                                                    System.out.print("Set Price: ");
                                                    double price=in1.nextDouble();
                                                    food.addMenuItem(name1, price);
                                                    System.out.println(name1+" added to the menu with price set to "+price);
                                                    break;
                                                case 4:
                                                    food.getRecipes();
                                                    break;
                                                case 5:
                                                    repeat5=false;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 4:
                                        System.out.print("1. Employee Proposals\n2. Customer Feedbacks\nPlease Select: ");
                                        byte t5=in1.nextByte();
                                        switch(t5){
                                            case 1:
                                                feedback.empFeedbacks();
                                                System.out.print("1. Delete Previous Entries\n2. Keep Previous Entries\nPlease Select: ");
                                                byte t6=in1.nextByte();
                                                if(t6==1) feedback.delEmpFeedbacks();
                                                break;
                                            case 2:
                                                feedback.CusFeedbacks();
                                                System.out.print("1. Delete Previous Entries\n2. Keep Previous Entries\nPlease Select: ");
                                                byte t7=in1.nextByte();
                                                if(t7==1) feedback.delCusFeedbacks();
                                                break;
                                        }
                                        break;
                                    case 5:
                                        System.out.print("\nNotice: ");
                                        String notice=in3.nextLine();
                                        feedback.giveNotice(notice);
                                        System.out.println("Press \"0\" to delete notices");
                                        System.out.println();
                                        break;
                                    case 6:
                                        account.newBranch(account);
                                        break;
                                    case 7:
                                        System.out.print("Current Password: ");
                                        String pass=in3.nextLine();
                                        if(login.getPass().equals(pass)){
                                            System.out.print("New Password: ");
                                            String pass1=in3.nextLine();
                                            login.changePassword(login.getId(), pass1);
                                        }
                                        else {
                                            System.out.println("Wrong Password, logging out for security purposes");
                                            repeat1=false;
                                            repeat2=false;
                                        }
                                        break;
                                    case 8:
                                        
                                        repeat1=false;
                                        repeat2=false;
                                        break;
                                }
                            }
                        }

                        else if(login.getId().equals("100001")){//hrm
                            while(repeat2){
                                System.out.println("1. Employee\n");
                                System.out.println("2. Check Messages\n3. Notice\n4. Proposal to CEO\n5. Salary\n6. Change Password\n 7. Log out");
                                System.out.print(space+" >>");

                                byte selection=in1.nextByte();

                                switch(selection){
                                    case 1:
                                    boolean repeat3=true;
                                    while(repeat3){
                                        System.out.println("1. Recruit Employee\n2. Sack Employee\n3. Search Employee\n4. All Employees\n5.Go Back");
                                        System.out.print(space+" >>");
                                        byte selection1=in1.nextByte();
                                    //Login login=new Login();
                                        switch(selection1){
                                            case 1:
                                                System.out.print("Employee Name    : ");
                                                String name=in3.nextLine();
                                                System.out.print("Employee ID      : ");
                                                String id=in3.nextLine();
                                                System.out.print("Designation      : ");
                                                String des=in3.nextLine();
                                                System.out.print("Unit             : ");
                                                String unit=in3.nextLine();
                                                System.out.print("Salary           : ");
                                                double salary=in1.nextDouble();
                                                System.out.print("Contact          : ");
                                                String pn=in3.nextLine();
                                                System.out.print("Access Password  : ");
                                                String pass=in3.nextLine();
                                                Employee e1=new Employee(name, salary, id, pn, des, unit);
                                            //Login login=new Login();
                                                login.addEmployee(e1);
                                                login.register(e1, pass);
                                                break;
                                            case 2:
                                                System.out.print("Employee ID      : ");
                                                String id1=in3.nextLine();
                                            //Login l2=new Login();
                                                if(id1.equals("000000")|| id1.equals("100001")) System.out.println("Invalid Removal");    
                                                else login.removeEmployee(id1);
                                                break;
                                            case 3:
                                                System.out.println("Search by");
                                                System.out.println("1. Employee Name\n2. Employee ID\n3. Contact\n4. Designation\n5. Unit");
                                                System.out.print(space+" >>");
                                                byte selection3=in1.nextByte();
                                                switch(selection3){
                                                    case 1:
                                                        System.out.print("Employee Name: ");
                                                        String name1=in3.nextLine();
                                                    //Login l3=new Login();
                                                        login.searchEmployeeName(name1);
                                                        break;
                                                    case 2:
                                                        System.out.print("Employee ID: ");
                                                        String id3=in3.nextLine();
                                                        login.searchEmployeeId(id3);
                                                        break;
                                                    case 3:
                                                        System.out.print("Contact: ");
                                                        String phone=in3.nextLine();
                                                        login.searchEmployeeContact(phone);
                                                        break;
                                                    case 4:
                                                        System.out.print("Designation: ");
                                                        String des1=in3.nextLine();
                                                        login.searchEmployeeDesignation(des1);
                                                        break;
                                                    case 5:
                                                        System.out.print("Unit: ");
                                                        String u=in3.nextLine();
                                                        login.searchEmployeeUnit(u);
                                                        break;
                                                }
                                                break;
                                            case 4:
                                                System.out.println("----------All Employees Details----------\n");
                                                login.getAllEmployeesDetails();
                                                break;
                                            case 5:
                                                repeat3=false;
                                                break;
                                        }
                                    }
                                    break;
                                        
                                    case 2:
                                        while(true){
                                            System.out.print("1. Check Messages from Unit Managers\n2. Message Public Relations Manager\n3. Delete Messages\n >>");
                                            byte b1=in1.nextByte();
                                            if(b1==2){
                                                System.out.println("Your Message to Public relations manager: ");
                                                String s=in3.nextLine();
                                                feedback.giveToPrm(s);
                                                break;
                                            }
                                            else if(b1==1){
                                                feedback.toHrm();
                                                break;
                                            }
                                            else if(b1==3){
                                                feedback.deltoPrm();
                                                feedback.deltoHrm();
                                                break;
                                            }
                                        }
                                        break;
                                    case 3:
                                    
                                    System.out.println();
                                    feedback.notices();
                                    System.out.println();
                                    break;
                                        
                                    case 4:
                                        System.out.print("Your Proposal in 1 Line: ");
                                        String s1=in3.nextLine();
                                        feedback.giveEmpFeedback(s1);
                                        break;
                                        
                                    case 5:
                                    System.out.println("Current Balance: "+account.goBalance(login.getId()));
                                    while(true){
                                        System.out.print("1. Withdraw\n2. Log Out\nChoose any: ");
                                        byte t1=in1.nextByte();
                                        if(t1==2) {
                                            repeat1=false;
                                            break;
                                        }
                                        
                                        else if(t1==1){
                                            System.out.print("Amount: ");
                                            double amount=in1.nextDouble();
                                            if(amount<=account.goBalance(login.getId())){
                                                account.withdraw(login.getId(), amount);
                                                System.out.println("Withdrew Amount: "+amount);
                                                System.out.println("Current Balance: "+account.goBalance(login.getId()));
                                            }
                                            else System.out.println("Insufficient Balance");
                                        }
                                        else System.out.println("Choice Invalid");
                                    }
                                    break;
                                    case 6:
                                        System.out.print("Current Password: ");
                                        String pass=in3.nextLine();
                                        if(login.getPass().equals(pass)){
                                            System.out.print("New Password: ");
                                            String pass1=in3.nextLine();
                                            login.changePassword(login.getId(), pass1);
                                        }
                                        else {
                                            System.out.println("Wrong Password, logging out for security purposes");
                                            repeat1=false;
                                            repeat2=false;
                                        }
                                        break;
                                    case 7:
                                        repeat1=false;
                                        repeat2=false;
                                        break;
                                }
                            }
                        }

                        else if(login.getId().equals("100002")){//prm
                            while(repeat2){
                                System.out.println("1. Marketing/Ad");
                                System.out.println("2. Notices\n3. Proposal to CEO\n4. Search Employee\n5. Customer Feedback\n6. Salary\n7. Change Password\n8. Log out");
                                System.out.print(space+" >>");
                                byte selection=in1.nextByte();

                                switch(selection){
                                    case 1:
                                        System.out.print("Budget: ");
                                        double budget=in1.nextDouble();
                                        account.releaseMoney(budget);
                                        break;
                                    case 2:
                                    System.out.println();
                                    feedback.notices();
                                    System.out.println();
                                        break;
                                    
                                    case 3:
                                        System.out.print("Your Proposal in 1 Line: ");
                                        String s1=in3.nextLine();
                                        feedback.giveEmpFeedback(s1);
                                        break;
                                    case 4:
                                    
                                    System.out.println("Search by");
                                    System.out.println("1. Employee Name\n2. Employee ID\n3. Contact\n4. Designation\n5. Unit");
                                    System.out.print(space+" >>");
                                    byte selection3=in1.nextByte();
                                    switch(selection3){
                                        case 1:
                                            System.out.print("Employee Name: ");
                                            String name1=in3.nextLine();
                                        //Login l3=new Login();
                                            login.searchEmployeeName(name1);
                                            break;
                                        case 2:
                                            System.out.print("Employee ID: ");
                                            String id3=in3.nextLine();
                                            login.searchEmployeeId(id3);
                                            break;
                                        case 3:
                                            System.out.print("Contact: ");
                                            String phone=in3.nextLine();
                                            login.searchEmployeeContact(phone);
                                            break;
                                        case 4:
                                            System.out.print("Designation: ");
                                            String des1=in3.nextLine();
                                            login.searchEmployeeDesignation(des1);
                                            break;
                                        case 5:
                                            System.out.print("Unit: ");
                                            String u=in3.nextLine();
                                            login.searchEmployeeUnit(u);
                                            break;
                                    }
                                    break;
                                        
                                    case 5:
                                        feedback.CusFeedbacks();
                                        break;
                                    case 6:
                                    System.out.println("Current Balance: "+account.goBalance(login.getId()));
                                    while(true){
                                        System.out.print("1. Withdraw\n2. Log Out\nChoose any: ");
                                        byte t1=in1.nextByte();
                                        if(t1==2) {
                                            repeat1=false;
                                            break;
                                        }
                                        
                                        else if(t1==1){
                                            System.out.print("Amount: ");
                                            double amount=in1.nextDouble();
                                            if(amount<=account.goBalance(login.getId())){
                                                account.withdraw(login.getId(), amount);
                                                System.out.println("Withdrew Amount: "+amount);
                                                System.out.println("Current Balance: "+account.goBalance(login.getId()));
                                            }
                                            else System.out.println("Insufficient Balance");
                                        }
                                        else System.out.println("Choice Invalid");
                                    }
                                    break;
                                    case 7:
                                    System.out.print("Current Password: ");
                                        String pass=in3.nextLine();
                                        if(login.getPass().equals(pass)){
                                            System.out.print("New Password: ");
                                            String pass1=in3.nextLine();
                                            login.changePassword(login.getId(), pass1);
                                        }
                                        else {
                                            System.out.println("Wrong Password, logging out for security purposes");
                                            repeat1=false;
                                            repeat2=false;
                                        }
                                        break;
                                    case 8:
                                        repeat1=false;
                                        repeat2=false;
                                        break;
                                }
                            } 
                        }

                        else if(login.checkReg().equals("20")){//manager
                            
                            while(repeat2){
                                System.out.println("1. Proposal for Employee\n2. Account\n3. Notice\n4. Search Employee\n5. Customer Feedback\n6. Proposal to CEO\n7. Salary\n8. Change Password\n9. Log out");
                                System.out.print(space+" >>");
                                byte selection=in1.nextByte();

                                switch(selection){
                                    case 1:
                                    while(true){
                                        //System.out.print("1. \n >>");
                                        byte b1=in1.nextByte();
                                        if(b1==2){
                                            System.out.println("\nYour Message to Human Resources manager: ");
                                            String s=in3.nextLine();
                                            feedback.giveToHrm(s);
                                            break;
                                        }
                                        
                                    }
                                    break;
                                        
                                    case 2:
                                        System.out.print("Utilities Charge: ");
                                        double aa=in1.nextDouble();
                                        account.releaseMoney(aa);
                                        break;
                                    case 3:
                                    System.out.println();
                                    feedback.notices();
                                    System.out.println();
                                    break;
                                        
                                    case 4:
                                    System.out.println("Search by");
                                    System.out.println("1. Employee Name\n2. Employee ID\n3. Contact\n4. Designation\n5. Unit");
                                    System.out.print(space+" >>");
                                    byte selection3=in1.nextByte();
                                    switch(selection3){
                                        case 1:
                                            System.out.print("Employee Name: ");
                                            String name1=in3.nextLine();
                                        //Login l3=new Login();
                                            login.searchEmployeeName(name1);
                                            break;
                                        case 2:
                                            System.out.print("Employee ID: ");
                                            String id3=in3.nextLine();
                                            login.searchEmployeeId(id3);
                                            break;
                                        case 3:
                                            System.out.print("Contact: ");
                                            String phone=in3.nextLine();
                                            login.searchEmployeeContact(phone);
                                            break;
                                        case 4:
                                            System.out.print("Designation: ");
                                            String des1=in3.nextLine();
                                            login.searchEmployeeDesignation(des1);
                                            break;
                                        case 5:
                                            System.out.print("Unit: ");
                                            String u=in3.nextLine();
                                            login.searchEmployeeUnit(u);
                                            break;
                                    }
                                    break;
                                    case 5:
                                        feedback.CusFeedbacks();
                                        break;
                                    case 6:
                                        System.out.print("Your Proposal in 1 Line: ");
                                        String s1=in3.nextLine();
                                        feedback.giveEmpFeedback(s1);
                                        break;
                                        
                                    case 7:
                                    System.out.println("Current Balance: "+account.goBalance(login.getId()));
                                    while(true){
                                        System.out.print("1. Withdraw\n2. Log Out\nChoose any: ");
                                        byte t1=in1.nextByte();
                                        if(t1==2) {
                                            repeat1=false;
                                            break;
                                        }
                                        
                                        else if(t1==1){
                                            System.out.print("Amount: ");
                                            double amount=in1.nextDouble();
                                            if(amount<=account.goBalance(login.getId())){
                                                account.withdraw(login.getId(), amount);
                                                System.out.println("Withdrew Amount: "+amount);
                                                System.out.println("Current Balance: "+account.goBalance(login.getId()));
                                            }
                                            else System.out.println("Insufficient Balance");
                                        }
                                        else System.out.println("Choice Invalid");
                                    }
                                    break;
                                    case 8:
                                    System.out.print("Current Password: ");
                                        String pass=in3.nextLine();
                                        if(login.getPass().equals(pass)){
                                            System.out.print("New Password: ");
                                            String pass1=in3.nextLine();
                                            login.changePassword(login.getId(), pass1);
                                        }
                                        else {
                                            System.out.println("Wrong Password, logging out for security purposes");
                                            repeat1=false;
                                            repeat2=false;
                                        }
                                        break;
                                    
                                    case 9:
                                        repeat1=false;
                                        repeat2=false;
                                        break;
                                }
                            }
                        }

                        else if(login.checkReg().equals("30")){//counter
                            while(repeat2){
                                System.out.println("1. Menu\n2. Recipe\n3. Place Order\n4. Detailed Order Information\n5. Salary\n6. Change Password\n7. Log out");
                                System.out.print(space+" >>");
                                byte selection=in1.nextByte();

                                switch(selection){
                                    case 1:
                                        food.menu();
                                        
                                        break;
                                    case 2:
                                        food.getRecipes();
                                        break;
                                    case 3:
                                        food.takeOrder(login.getUniti(login.getUnit(login.getId())), account);
                                        break;
                                    case 4:
                                        break;
                                    case 5:
                                    System.out.println("Current Balance: "+account.goBalance(login.getId()));
                                    while(true){
                                        System.out.print("1. Withdraw\n2. Log Out\nChoose any: ");
                                        byte t1=in1.nextByte();
                                        if(t1==2) {
                                            repeat1=false;
                                            break;
                                        }
                                        
                                        else if(t1==1){
                                            System.out.print("Amount: ");
                                            double amount=in1.nextDouble();
                                            if(amount<=account.goBalance(login.getId())){
                                                account.withdraw(login.getId(), amount);
                                                System.out.println("Withdrew Amount: "+amount);
                                                System.out.println("Current Balance: "+account.goBalance(login.getId()));
                                            }
                                            else System.out.println("Insufficient Balance");
                                        }
                                        else System.out.println("Choice Invalid");
                                    }
                                    break;
                                    case 6:
                                        System.out.print("Current Password: ");
                                        String pass=in3.nextLine();
                                        if(login.getPass().equals(pass)){
                                            System.out.print("New Password: ");
                                            String pass1=in3.nextLine();
                                            login.changePassword(login.getId(), pass1);
                                        }
                                        else {
                                            System.out.println("Wrong Password, logging out for security purposes");
                                            repeat1=false;
                                            repeat2=false;
                                        }
                                        break;
                                    case 7:
                                        repeat1=false;
                                        repeat2=false;
                                        break;     
                                }
                            }
                        }

                        else if(login.checkReg().equals("40")){//chef
                            while(repeat2){
                                System.out.println("1. Stock\n2. Search Recipe\n3. Notice\n4. Search Employee\n5. Proposal to CEO\n6. Salary\n7. Change Password\n8. Log out");
                                System.out.print(space+" >>");
                                byte selection=in1.nextByte();

                                switch(selection){
                                    case 1:
                                    while(true){
                                        System.out.println("1. Stock Info\n2. Re-Stock\n >>");
                                        byte t3=in1.nextByte();
                                        if(t3==1){
                                            food.stockInfo(login.getUniti(login.getUnit(login.getId())));
                                            break;
                                        }
                                        else if(t3==2){
                                            food.refillStock(login.unitStock(login.getUniti(login.getUnit(login.getId()))), account);
                                            break;
                                        }
                                    }
                                        break;
                                    case 2:
                                        System.out.print("Food Item Name on the Menu: ");
                                        String name=in3.nextLine();
                                        food.searchRecipe(name);
                                        System.out.println();

                                        break;
                                    case 3:
                                    System.out.println();
                                    feedback.notices();
                                    System.out.println();
                                        
                                        break;
                                    case 4:
                                        System.out.println("Search by");
                                    System.out.println("1. Employee Name\n2. Employee ID\n3. Contact\n4. Designation\n5. Unit");
                                    System.out.print(space+" >>");
                                    byte selection3=in1.nextByte();
                                    switch(selection3){
                                        case 1:
                                            System.out.print("Employee Name: ");
                                            String name1=in3.nextLine();
                                        //Login l3=new Login();
                                            login.searchEmployeeName(name1);
                                            break;
                                        case 2:
                                            System.out.print("Employee ID: ");
                                            String id3=in3.nextLine();
                                            login.searchEmployeeId(id3);
                                            break;
                                        case 3:
                                            System.out.print("Contact: ");
                                            String phone=in3.nextLine();
                                            login.searchEmployeeContact(phone);
                                            break;
                                        case 4:
                                            System.out.print("Designation: ");
                                            String des1=in3.nextLine();
                                            login.searchEmployeeDesignation(des1);
                                            break;
                                        case 5:
                                            System.out.print("Unit: ");
                                            String u=in3.nextLine();
                                            login.searchEmployeeUnit(u);
                                            break;
                                    }
                                    break;
                                    
                                    case 5:
                                        System.out.print("Your Proposal in 1 Line: ");
                                        String s1=in3.nextLine();
                                        feedback.giveEmpFeedback(s1);
                                        break;
                                        
                                    case 6:
                                        System.out.println("Current Balance: "+account.goBalance(login.getId()));
                                        while(true){
                                            System.out.print("1. Withdraw\n2. Log Out\nChoose any: ");
                                            byte t1=in1.nextByte();
                                            if(t1==2) {
                                                repeat1=false;
                                                break;
                                            }
                                            
                                            else if(t1==1){
                                                System.out.print("Amount: ");
                                                double amount=in1.nextDouble();
                                                if(amount<=account.goBalance(login.getId())){
                                                    account.withdraw(login.getId(), amount);
                                                    System.out.println("Withdrew Amount: "+amount);
                                                    System.out.println("Current Balance: "+account.goBalance(login.getId()));
                                                }
                                                else System.out.println("Insufficient Balance");
                                            }
                                            else System.out.println("Choice Invalid");
                                        }
                                        break;
                                    case 7:
                                        System.out.print("Current Password: ");
                                        String pass=in3.nextLine();
                                        if(login.getPass().equals(pass)){
                                            System.out.print("New Password: ");
                                            String pass1=in3.nextLine();
                                            login.changePassword(login.getId(), pass1);
                                        }
                                        else {
                                            System.out.println("Wrong Password, logging out for security purposes");
                                            repeat1=false;
                                            repeat2=false;
                                        }
                                        break;
                                    case 8:
                                        repeat1=false;
                                        repeat2=false;
                                        break;
                                }
                            } 
                        }

                        else {//others
                             
                                System.out.println("Current Balance: "+account.goBalance(login.getId()));
                                while(true){
                                    System.out.print("1. Withdraw\n2. Notice\n3. Change Password\n4. Log Out\nChoose any: ");
                                    byte t1=in1.nextByte();
                                    if(t1==4) {
                                        repeat1=false;
                                        break;
                                    }
                                    else if(t1==3){
                                        System.out.print("Current Password: ");
                                        String pass=in3.nextLine();
                                        if(login.getPass().equals(pass)){
                                            System.out.print("New Password: ");
                                            String pass1=in3.nextLine();
                                            login.changePassword(login.getId(), pass1);
                                        }
                                        else {
                                            System.out.println("Wrong Password, logging out for security purposes");
                                            repeat1=false;
                                            //repeat2=false;
                                        }
                                    
                                    }
                                    else if(t1==2){
                                        System.out.println();
                                        feedback.notices();
                                        System.out.println();
                                        
                                    }
                                    else if(t1==1){
                                        System.out.print("Amount: ");
                                        double amount=in1.nextDouble();
                                        if(amount<=account.goBalance(login.getId())){
                                            account.withdraw(login.getId(), amount);
                                            System.out.println("Withdrew Amount: "+amount);
                                            System.out.println("Current Balance: "+account.goBalance(login.getId()));
                                        }
                                        else System.out.println("Insufficient Balance");
                                    }
                                    else System.out.println("Choice Invalid");
                                }
                                //break;
                        }
                        
                        
                    }
                    byte t;
                    while(b!=true){
                        System.out.print("Invalid Credentials\n1. Try Again\n2. Back\nPlease select: ");
                        t=in2.nextByte();
                        if(t==1) {
                            break;
                        }
                        else if(t==2) {
                            repeat1=false;
                            break;
                        }
                    }
                    b=false;
                }


                break;
                

                case 2:
                Scanner in4=new Scanner(System.in);
                System.out.println("--------------Welcome to Restaurant X--------------\n");
                boolean repeat2=true;
                while(repeat2){
                    System.out.print("1. Menu\n2. Submit Feedback\n3. Go Back\nPlease Select: ");
                    byte t2=in1.nextByte();
                    switch(t2){
                        case 1:
                        food.menu();
                        System.out.println("\nPlease Place Order at the Counter");
                        repeat2=false;
                        break;
                        case 2:
                        System.out.print("Your Feedback in 1 line: ");
                        String s1=in4.nextLine();
                        feedback.giveCusFeedback(s1);
                        System.out.println("Thank you, Sir");
                        repeat2=false;
                        break;
                        case 3:
                        repeat2=false;
                        break;
                    }
                }
                break;

                case 3:
                System.out.println("Exiting the program, Thank you.");
                repeat=false;
                break;
            }
        
            
        }
    }
}
