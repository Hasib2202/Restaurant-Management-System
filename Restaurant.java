package classes;

import java.util.*;
public class Restaurant
{
    public double revenue;
    public Employee employees[]=new Employee[1000];
    public Recipe recipes[]=new Recipe[100];
    {
        employees[0]=new Employee("Liam",0,"000000","01999999992", "Chief Executive Officer","General");
        employees[1]=new Employee("Noah",40000,"100001","01999993992", "Human Resources Manager","General");
        employees[2]=new Employee("Oliver",40000,"100002","01999909992", "Public Relations Manager","General");
        employees[3]=new Employee("Elijah",35000,"200001","01999199992", "Unit Manager","A");
        employees[4]=new Employee("William",35000,"200002","01999299992", "Unit Manager","B");
        employees[5]=new Employee("James",35000,"200003","01999399992", "Unit Manager","C");
        employees[6]=new Employee("Benjamin",35000,"200004","01999949992", "Unit Manager","D");
        employees[7]=new Employee("Lucas",20000,"300001","01995999992", "Counter Server","A");
        employees[8]=new Employee("Henry",20000,"300002","01910999992", "Counter Server","B");
        employees[9]=new Employee("Alexander",20000,"300003","01992299992", "Counter Server","C");
        employees[10]=new Employee("Evelyn",20000,"300004","01934999992", "Counter Server","D");
        employees[11]=new Employee("Levi",37000,"400001","01996999992", "Executive Chef","A");
        employees[12]=new Employee("Jacob",37000,"400002","01969999992", "Executive Chef","B");
        employees[13]=new Employee("Mason",37000,"400003","01997999992", "Executive Chef","C");
        employees[14]=new Employee("Michael",37000,"400004","01777989992", "Executive Chef","D");
        employees[15]=new Employee("Ethan",30000,"410001","01888999982", "Assistant Chef","A");
        employees[16]=new Employee("Daniel",30000,"410002","01222299992", "Assistant Chef","B");
        employees[17]=new Employee("Logan",30000,"410003","01888999992", "Assistant Chef","C");
        employees[18]=new Employee("Sebastian",30000,"410004","01888999993", "Assistant Chef","D");
        employees[19]=new Employee("Mateo", 20000,"310001" , "01494444444", "Waiter", "A");
        employees[20]=new Employee("Emily", 20000,"310002" , "01440444444", "Waiter", "B");
        employees[21]=new Employee("Sophia", 20000,"310003" , "01444404444", "Waiter", "C");
        employees[22]=new Employee("Emma", 20000, "310004", "01444444944", "Waiter", "D");
        employees[23]=new Employee("Peter", 13000, "500001", "01444444344", "Cleaner", "A");
        employees[24]=new Employee("Ken", 13000, "500002", "01444444244", "Cleaner", "B");
        employees[25]=new Employee("Eggsy", 13000, "500003", "01444444144", "Cleaner", "C");
        employees[26]=new Employee("Terry", 13000, "500004", "01444444644", "Cleaner", "D");
    }

    

    public void addEmployee(Employee a/*String employeeName, double salary, String employeeId, String phoneNumber, String designation, String unit*/){
        int i=0;
        while(true){
            if(employees[i]==null){
                employees[i]=a;//=new Employee(employeeName, salary, employeeId, phoneNumber, designation, unit);
                System.out.println("Employee Details Inserted");
                break;
            }
            i++;
        }
    }

    public void getAllEmployeesDetails(){
        int i=0;
        while(i<employees.length){
            if(employees[i]!=null){
                employees[i].getEmployeeDetails();
                //System.out.println();
            }
            i++;
        }
    }

    public void searchEmployeeName(String name){
        int i=0;
        int flag=0;
        while(i<employees.length){
            if(employees[i]!=null){
                if(employees[i].employeeName.equals(name)){
                    employees[i].getEmployeeDetails();
                    flag++;
                }
            }
            i++;
        }
        if(flag==0) System.out.println("Could not find any Employee");
    }

    public void searchEmployeeId(String ID){
        int i=0;
        int flag=0;
        while(i<employees.length){
            if(employees[i]!=null){
                if(employees[i].employeeId.equals(ID)){
                    employees[i].getEmployeeDetails();
                    flag++;
                    break;
                }
            }
            i++;
        }
        if(flag==0) System.out.println("Could not find any Employee");
    }
    public void searchEmployeeContact(String Phone){
        int i=0;
        int flag=0;
        while(i<employees.length){
            if(employees[i]!=null){
                if(employees[i].phoneNumber.equals(Phone)){
                    employees[i].getEmployeeDetails();
                    flag++;
                }
            }
            i++;
        }
        if(flag==0) System.out.println("Could not find any Employee");
    }
    public void searchEmployeeDesignation(String des){
        int i=0;
        int flag=0;
        while(i<employees.length){
            if(employees[i]!=null){
                if(employees[i].designation.equals(des)){
                    employees[i].getEmployeeDetails();
                    flag++;
                }
            }
            i++;
        }
        if(flag==0) System.out.println("Could not find any Employee");
    }
    public void searchEmployeeUnit(String Unit){
        int i=0;
        int flag=0;
        while(i<employees.length){
            if(employees[i]!=null){
                if(employees[i].unit.equals(Unit)){
                    employees[i].getEmployeeDetails();
                    flag++;
                }
            }
            i++;
        }
        if(flag==0) System.out.println("Could not find any Employee");
    }
    
    public String getEmployeeName(String ID){
        int i=0;
        while(i<employees.length){
            if(employees[i]!=null){
                if(employees[i].employeeId.equals(ID)){
                    return employees[i].employeeName;
                }
            }
            i++;
        }
        return ID;
    }

    public void giveSalary(){
        int i=0;
        while(i<employees.length){
            if(employees[i]!=null){
                System.out.println(i);
                
                employees[i].balance=employees[i].balance+employees[i].salary;
                System.out.println(employees[i].balance);
                this.revenue=this.revenue-employees[i].salary;
                System.out.println(this.revenue);
            }
            i++;
        }
    }

    

    public void stockInfo(int uniti){
        
        System.out.println("Unit: "+Units[uniti].name);
        int i=0;
        while(i<Units.length){
            if(Units[uniti].materialName[i]!=null){
                System.out.println(Units[uniti].materialName[i]);
                System.out.println("Quantity: "+Units[uniti].material[i]+"\n");
            }
            i++;
        }
        
    }

    public String getUnit(String ID){
        int i=0;
        while(true){
            if(employees[i]!=null){
                if(employees[i].employeeId.equals(ID)){
                    return employees[i].unit;
                }
            }
            i++;
        }
    }

    public Stock Units[]=new Stock[100];

    public int getUniti(String unitName){
        int i=0;
        while(i<Units.length){
            if(Units[i]!=null){
                if(Units[i].name.equals(unitName)){
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    public Stock unitStock(int i){
        return Units[i];
    }

    {   //Pizzaitems
        Units[0]=new Stock();
        Units[0].materialName[0]= "dough";
        Units[0].materialName[1]= "meat";
        Units[0].materialName[2]= "cheese"; 
        Units[0].materialName[3]= "sauce";
        Units[0].materialName[4]= "spices";
        //Burgeritems 
        Units[0].materialName[5]= "bun";
        //Units[0].materialName[6]= "meat";     
        //Units[0].materialName[7]= "sauce"; 
        //Units[0].materialName[8]= "spices"; 
        //Pastaitems 
        Units[0].materialName[9]= "pasta"; 
        Units[0].materialName[10]= "veg" ;
        Units[0].materialName[11]= "cream";
        //Units[0].materialName[12]= "spices";
        Units[0].materialName[13]= "drinks";
    }
    {   //Pizzaitems
        Units[1]=new Stock();
        Units[1].materialName[0]= "dough";
        Units[1].materialName[1]= "meat";
        Units[1].materialName[2]= "cheese"; 
        Units[1].materialName[3]= "sauce";
        Units[1].materialName[4]= "spices";
        //Burgeritems 
        Units[1].materialName[5]= "bun";
        //Units[1].materialName[6]= "meat";     
        //Units[1].materialName[7]= "sauce"; 
        //Units[1].materialName[8]= "spices"; 
        //Pastaitems 
        Units[1].materialName[9]= "pasta"; 
        Units[1].materialName[10]= "veg" ;
        Units[1].materialName[11]= "cream";
        //Units[1].materialName[12]= "spices";
        Units[1].materialName[13]= "drinks";
    }
    {   //Pizzaitems
        Units[2]=new Stock();
        Units[2].materialName[0]= "dough";
        Units[2].materialName[1]= "meat";
        Units[2].materialName[2]= "cheese"; 
        Units[2].materialName[3]= "sauce";
        Units[2].materialName[4]= "spices";
        //Burgeritems 
        Units[2].materialName[5]= "bun";
        //Units[2].materialName[6]= "meat";     
        //Units[2].materialName[7]= "sauce"; 
        //Units[2].materialName[8]= "spices"; 
        //Pastitems 
        Units[2].materialName[9]= "pasta"; 
        Units[2].materialName[10]= "veg" ;
        Units[2].materialName[11]= "cream";
        //Units[2].materialName[12]= "spices";
        Units[2].materialName[13]= "drinks";
    }
    {   //Pizzaitems
        Units[3]=new Stock();
        Units[3].materialName[0]= "dough";
        Units[3].materialName[1]= "meat";
        Units[3].materialName[2]= "cheese"; 
        Units[3].materialName[3]= "sauce";
        Units[3].materialName[4]= "spices";
        //Burgeritems 
        Units[3].materialName[5]= "bun";
        //Units[3].materialName[6]= "meat";     
        //Units[3].materialName[7]= "sauce"; 
        //Units[3].materialName[8]= "spices"; 
        //Pastaitems 
        Units[3].materialName[9]= "pasta"; 
        Units[3].materialName[10]= "veg" ;
        Units[3].materialName[11]= "cream";
        //Units[3].materialName[12]= "spices";
        Units[3].materialName[13]= "drinks";
    }
    {
        Units[0].material[0]=1000;
        Units[0].material[1]=1000;
        Units[0].material[2]=1000;
        Units[0].material[3]=1000;
        Units[0].material[4]=1000;
        Units[0].material[5]=1000;
        //Units[0].material[6]=1000;
        //Units[0].material[7]=1000;
        //Units[0].material[8]=1000;
        Units[0].material[9]=1000;
        Units[0].material[10]=1000;
        Units[0].material[11]=1000;
        //Units[0].material[12]=1000;
        Units[0].material[13]=1000;
    }
    {
        Units[1].material[0]=1000;
        Units[1].material[1]=1000;
        Units[1].material[2]=1000;
        Units[1].material[3]=1000;
        Units[1].material[4]=1000;
        Units[1].material[5]=1000;
        //Units[1].material[6]=1000;
        //Units[1].material[7]=1000;
        //Units[1].material[8]=1000;
        Units[1].material[9]=1000;
        Units[1].material[10]=1000;
        Units[1].material[11]=1000;
        //Units[1].material[12]=1000;
        Units[1].material[13]=1000;
    }
    {
        Units[2].material[0]=1000;
        Units[2].material[1]=1000;
        Units[2].material[2]=1000;
        Units[2].material[3]=1000;
        Units[2].material[4]=1000;
        Units[2].material[5]=1000;
        //Units[2].material[6]=1000;
        //Units[2].material[7]=1000;
        //Units[2].material[8]=1000;
        Units[2].material[9]=1000;
        Units[2].material[10]=1000;
        Units[2].material[11]=1000;
        //Units[2].material[12]=1000;
        Units[2].material[13]=1000;
    }
    {
        Units[3].material[0]=1000;
        Units[3].material[1]=1000;
        Units[3].material[2]=1000;
        Units[3].material[3]=1000;
        Units[3].material[4]=1000;
        Units[3].material[5]=1000;
        //Units[3].material[6]=1000;
        //Units[3].material[7]=1000;
        //Units[3].material[8]=1000;
        Units[3].material[9]=1000;
        Units[3].material[10]=1000;
        Units[3].material[11]=1000;
        //Units[3].material[12]=1000;
        Units[3].material[13]=1000;
    }

    {
        Units[0].name="A";
        Units[1].name="B";
        Units[2].name="C";
        Units[3].name="D";
    }

    public void newBranch(Account a){
        Scanner in=new Scanner(System.in);
        Scanner in1=new Scanner (System.in);
        int i=0;
        while(i<Units.length){
            if(Units[i]==null){
                System.out.print("New Unit Name: ");
                String name=in.nextLine();
                Units[i].name=name;
                int c=0,k=0;
                while(c<Units.length){
                    if(Units[c]!=null){
                        while(k<Units[c].materialName.length){
                            if(Units[c].materialName[k]!=null){
                                Units[i].materialName[k]=Units[c].materialName[k];
                                System.out.print("Price of per unit "+Units[c].materialName[k]+": ");
                                double d=in1.nextDouble();
                                a.revenue=a.revenue-d*1000;
                                Units[i].material[k]=1000;
                                
                            }
                            k++;
                        }
                        break;
                    }
                    c++;
                }
                break;
            }
            i++;
        }
        System.out.print("Extra Cost: ");
        double d1=in1.nextDouble();
        a.revenue=a.revenue-d1;
        System.out.println("\nNew Branch Of The Restaurant Was Created\n");
    }

}
