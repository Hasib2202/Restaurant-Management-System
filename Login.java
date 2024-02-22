package classes;


import java.util.Scanner;

public class Login extends Restaurant {
    public Scanner input=new Scanner(System.in);

    private String user;
    private String pass;
    private String Pass[]=new String[1000];
    private String User[]=new String[1000]; 

    public void setUser(String user){
        this.user=user;
    }

    public void setPass(String pass){
        this.pass=pass;
    }

    public String getPass(){
        return this.pass;
    }
    {
        Pass[0]="ceo";
        Pass[1]="hrm";
        Pass[2]="prm";
        Pass[3]="unit manager a";
        Pass[4]="unit manager b";
        Pass[5]="unit manager c";
        Pass[6]="unit manager d";
        Pass[7]="counter server a";
        Pass[8]="counter server b";
        Pass[9]="counter server c";
        Pass[10]="counter server d";
        Pass[11]="executive chef a";
        Pass[12]="executive chef b";
        Pass[13]="executive chef c";
        Pass[14]="executive chef d";
        Pass[15]="assistant chef a";
        Pass[16]="assistant chef b";
        Pass[17]="assistant chef c";
        Pass[18]="assistant chef d";
        Pass[19]="waiter a";
        Pass[20]="waiter b";
        Pass[21]="waiter c";
        Pass[22]="waiter d";
        Pass[23]="cleaner a";
        Pass[24]="cleaner b";
        Pass[25]="cleaner c";
        Pass[26]="cleaner d";
    }
    
    {
        User[0]="000000";
        User[1]="100001";
        User[2]="100002";
        User[3]="200001";
        User[4]="200002";
        User[5]="200003";
        User[6]="200004";
        User[7]="300001";
        User[8]="300002";
        User[9]="300003";
        User[10]="300004";
        User[11]="400001";
        User[12]="400002";
        User[13]="400003";
        User[14]="400004";
        User[15]="410001";
        User[16]="410002";
        User[17]="410003";
        User[18]="410004";
        User[19]="310001";
        User[20]="310002";
        User[21]="310003";
        User[22]="310004";
        User[23]="500001";
        User[24]="500002";
        User[25]="500003";
        User[26]="500004";
    }
    
    public String checkReg()
    {
        int i=0;
        while(i<employees.length){
            if(user.equals(User[i]) && pass.equals(Pass[i])) return User[i].substring(0,2);
            i++;
        }
        return "a";
    }

    public void register(Employee e, String p){
        int i=0;
        while(i<User.length){
            if(User[i]==null){
                User[i]=e.employeeId;
                Pass[i]=p;
            }
            i++;
        }
    }

    public void removeEmployee(String ID){
        int i=0;
        int flag=0;
        while(i<employees.length){
            if(employees[i].employeeId.equals(ID)){
                employees[i]=null;
                User[i]=null;
                Pass[i]=null;
                System.out.println("Employee Removed");
                flag++;
                break;
            }
            i++;
        }
        if(flag==0) System.out.println("Could not find Employee of ID: "+ID);
    }

    public String getId(){
        return user;
    }

    public void changePassword(String u, String p){
        int i=0;
        while(i<User.length){
            if(User[i]!=null){
                if(User[i].equals(u)){
                    Pass[i]=p;
                    break;
                }
            }
            i++;
        }
    }

    
}
