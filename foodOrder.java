package classes;


import java.util.Scanner;

public class foodOrder extends Restaurant{

    
    
    public String foodItems[] = new String [100];
    public double prices[] = new double[100];

    {
        foodItems[0]="Pizza";
        foodItems[1]="Pasta";
        foodItems[2]="Burger";
        foodItems[3]="Drinks";
        //foodItems[4]=
    }
    {
        prices[0]=800;
        prices[1]=400;
        prices[2]=300;
        prices[3]=100;
    }
    {
        recipes[0]=new Recipe();
        recipes[1]=new Recipe();
        recipes[2]=new Recipe();
        recipes[3]=new Recipe();
        recipes[0].rawName[0]="dough";
        recipes[0].rawName[1]="meat";
        recipes[0].rawName[2]="cheese";
        recipes[0].rawName[3]="sauce";
        recipes[0].rawName[4]="spices";
        recipes[0].rawQuantity[0]=3;
        recipes[0].rawQuantity[1]=3;
        recipes[0].rawQuantity[2]=2;
        recipes[0].rawQuantity[3]=2;
        recipes[0].rawQuantity[4]=3;
        recipes[1].rawName[0]="bun";
        recipes[1].rawName[1]="meat";
        recipes[1].rawName[2]="cheese";
        recipes[1].rawName[3]="sauce";
        recipes[1].rawName[4]="spices";
        recipes[1].rawQuantity[0]=2;
        recipes[1].rawQuantity[1]=3;
        recipes[1].rawQuantity[2]=1;
        recipes[1].rawQuantity[3]=1;
        recipes[1].rawQuantity[4]=1;
        recipes[2].rawName[0]="dough";
        recipes[2].rawName[1]="meat";
        recipes[2].rawName[2]="cheese";
        recipes[2].rawName[3]="sauce";
        recipes[2].rawName[4]="spices";
        recipes[2].rawQuantity[0]=3;
        recipes[2].rawQuantity[1]=2;
        recipes[2].rawQuantity[2]=2;
        recipes[2].rawQuantity[3]=1;
        recipes[2].rawQuantity[4]=3;
        recipes[3].rawName[0]="drinks";
        recipes[3].rawQuantity[0]=1;
    }
    
    public void menu(){
        System.out.println("--------------Menu--------------\n");
        int i=0;
        while(i<foodItems.length){
            if(foodItems[i]!=null) System.out.println("    "+(i+1)+". "+foodItems[i]+"      :  "+prices[i]+" Unit ");
            i++;
        }
        /*System.out.println("--------------------------------");
        System.out.println("      Foodie Nation Menu      \n");
        System.out.println("    1.Pizza      :  800.00 Taka ");
        System.out.println("    2.Pasta      :  400.00 Taka ");
        System.out.println("    3.Burger     :  450.00 Taka ");
        System.out.println("    4.Drinks     :  100.00 Taka ");
        System.out.println("    5.Cancel                 \n ");
        System.out.println("--------------------------------");*/
    }

    public void removeMenuItem(String Name){
        int i=0;
        while(i<foodItems.length){
            if(foodItems[i]!=null){
                if(foodItems[i].equals(Name)){
                    foodItems[i]=null;
                    recipes[i]=null;
                    prices[i]=0;
                    while(i+1<foodItems.length){
                        
                        foodItems[i]=foodItems[i+1];
                        recipes[i]=recipes[i+1];
                        prices[i]=prices[i+1];
                        i++;
                    }
                    System.out.println(Name+" Menu Item Removed");
                }
            }
            i++;
        }
    }

    public void addMenuItem(String name, double price){
        Scanner input=new Scanner(System.in);
        Scanner ins=new Scanner(System.in);
        int i=0;
        while(i<foodItems.length){
            if(foodItems[i]==null){
               foodItems[i]=name;
               prices[i]=price;
               recipes[i]=new Recipe();
               int c=i;
               String matName[]=new String [400];
               double matQuantity[]=new double[400];
               System.out.println("Materials needed name and quantity 1 by 1, Press \"-\" When Done: ");
               i=0;
               while(true){
                    String s=input.nextLine();
                    if(s.equals("-")){
                        break;
                    }   
                    else {
                        matName[i]=s;
                        recipes[c].rawName[i]=matName[i];
                        System.out.print("Quantity: ");
                        matQuantity[i]=ins.nextDouble();
                        recipes[c].rawQuantity[i]=matQuantity[i];
                        i++;
                    }
                }
                i=0;
                
                
                int x=0;
                while(i<Units.length){
                    
                    if(Units[i]!=null){
                        //System.out.println(i);
                        x=0;
                        while(x<matName.length){
                            int k=0;
                            int flag=0;
                            while(k<Units[i].materialName.length){
                                if(Units[i].materialName[k]!=null && matName[x]!=null){
                                    if(Units[i].materialName[k].equals(matName[x])){
                                        
                                        flag++;
                                        //System.out.println(i+" "+k+" "+flag);
                                        break;
                                    }
                                }
                                k++;
                            }
                            if(flag==0 && matName[x]!=null){
                                Units[i].addMaterialName(matName[x]);
                                //System.out.println(x);
                            }
                            x++;

                        }
                    }
                    i++;
                }
                break;
            }
            i++;
        }
    }

    public void takeOrder(int unit, Account a){
        Scanner input=new Scanner(System.in);
        Scanner ins=new Scanner(System.in);
        double total=0;
        this.menu();
        System.out.println("     0. Done Ordering");
        while(true){
            System.out.print("Please Select: ");
            int i=input.nextInt();
            if(i==0) {
                System.out.println("\nTotal: "+total+"\n");
                a.revenue=a.revenue+total;
                break;
            }
            System.out.print("Quntity of "+foodItems[i-1]+": ");
            int q=ins.nextInt();
            total=total+q*prices[i-1];
            Recipe r=new Recipe();
            r.deductStock(Units[unit], recipes[i-1], q);
        }
    }

    public void getRecipes(){
        int i=0;
        while(i<recipes.length){
            if(recipes[i]!=null){
                System.out.println("\n-------"+foodItems[i]+"-------");
                int k=0;
                while(recipes[i].rawName[k]!=null){
                    System.out.println(recipes[i].rawName[k]+"\n");
                    
                    k++;
                }
            }
            i++;
        }
    }

    public void searchRecipe(String Name){
        int i=0;
        while(i<foodItems.length){
            if(foodItems[i]!=null){
                if(foodItems[i].equals(Name)){
                    int k=0;
                    while(k<recipes[i].rawName.length){
                        if(recipes[i].rawName[k]!=null){
                            System.out.println(recipes[i].rawName[k]+"       Quantity: "+recipes[i].rawQuantity[k]);
                        }
                        k++;
                    }
                }
            }
            i++;
        }
    }
    
    public void refillStock(Stock s, Account a){
        Scanner input=new Scanner(System.in);
        int i=0;
        System.out.println("Per material Cost");
        while(i<s.materialName.length){
            if(s.materialName[i]!=null){
            System.out.print("Price of unit "+s.materialName[i]+": ");
            double perCost=input.nextDouble();
            double amount=1000-s.material[i];
            a.revenue=a.revenue-amount*perCost;
            s.material[i]=1000;}
            i++;
        }
    }

    
    
    
    
    
    
    /*public void feedbackCard(){
        System.out.println("------------------------");
        System.out.println("  Feedback Card   \n");
        System.out.println("   1.Excellent      ");
        System.out.println("   2.Good           ");
        System.out.println("   3.Fair           ");
        System.out.println("   4.Improvement    ");
        System.out.println("   5.No comments  \n");
        System.out.println("------------------------");
    }*/

    /*public void giveFeedback(){
 
        System.out.print("Enter Your Choice: \n");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
            System.out.println("Thank you so much for your feedback!! \n");
            System.out.println("---------------------------------");
            break;
            
            case 2:
            System.out.println("Thank you so much for your feedback!! \n");
            System.out.println("---------------------------------");
            break;

            case 3:
            System.out.println("Thank you so much for your feedback!! \n");
            System.out.println("---------------------------------");
            break;

            case 4:
            System.out.println(" Thank you for your feedback and Sorry for your incovenience\n We will make neccessary improvements \n");
            System.out.println("---------------------------------");
            break;

            case 5:
            break;
            }
            
            

    }*/

    /*public void takeOrder(){
        //System.out.println("Press 1 for pizza, Press 2 for Pasta , Press 3 for Burger, Press 4 for Drinks, Press 5 for Cancel");
        //System.out.print("Enter Your Choice: \n");
        
        double total=0;
        int quantityPizza, quantityPasta, quantityBurger, quantityDrinks;
        boolean repeat=true;
        /*while(repeat){
            System.out.println("Press 1 for pizza\nPress 2 for Pasta\nPress 3 for Burger\nPress 4 for Drinks\nPress 5 for Done Ordering\nPress 6 for Cancel Order");
        System.out.print("Enter Your Choice: \n");
            int choice = sc.nextInt();
            switch(choice){
            case 1:
            System.out.println("Pizza chosen \n");
            System.out.println("Quantity of pizza : ");
            quantityPizza = sc.nextInt();
            total = total +(quantityPizza*800); 
        
        //System.out.println("Total price is : "+ total);
        //System.out.println("---------------------------------");
            break;
            
            case 2:
            System.out.println("Pasta chosen \n");
            System.out.println("Quantity of pasta : ");
            quantityPasta = sc.nextInt();
            total = total +(quantityPasta*400); 
        
        //System.out.println("Total price is : "+ total);
        //System.out.println("---------------------------------");
            break;

            case 3:
            System.out.println("Burger chosen \n");
            System.out.println("Quantity of Burger : ");
            quantityBurger = sc.nextInt();
            total = total +(quantityBurger*450); 
        
        //System.out.println("Total price is : "+ total);
        //System.out.println("---------------------------------");
            break;


            case 4:
            System.out.println("Drinks chosen \n");
            System.out.println("1. Coke \n2. Sprite \n3. Water \nPress 1 for Coke \nPress 2 for Sprite \nPress 3 for Water");
            choice = sc.nextInt();
            switch(choice){
                case 1 :
                System.out.println("Quantity of Coke : ");
                quantityDrinks = sc.nextInt();
                total = total +(quantityDrinks*60); 
                break;

                case 2 :
                System.out.println("Quantity of Sprite : ");
                quantityDrinks = sc.nextInt();
                total = total +(quantityDrinks*50); 
                break;

                case 3 :
                System.out.println("Quantity of Water : ");
                quantityDrinks = sc.nextInt();
                total = total +(quantityDrinks*25); 
                break;


            }
            
        
        //System.out.println("Total price is : "+ total);
        //System.out.println("---------------------------------");
            break;
            
            case 5:
            repeat=false;
            System.out.println("Total price is :  \n"+ total);
            if(total>6000){
                
                System.out.println("You are elegible for 50% discount");

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter The Price Of The Food:");

            double price=sc.nextDouble();
 

                if(price>6000){

                double discount;
               discount=price - (price*0*5);
            

            System.out.println("Total price after 50% discount is:"+discount);}

            else if (total<6000 && total> 3000){
                 System.out.println("You are elegible for 25% discount");


            System.out.println("Enter The Price Of The Food:");

            price=sc.nextDouble();
 

                if(price>3000){

                double discount;
               discount=price - (price*0*25);
            

            System.out.println("Total price after 25% discount is:"+discount);}
            }


            }
            else
            {

            System.out.println("Not elegible for discount");
            }



            System.out.println("Thank you so much for ordering");
            System.out.println("would you like to give feedback?  \npress 1 for yes \npress 2 for no");
            choice = sc.nextInt();
            if(choice==1){
                feedbackCard();
                giveFeedback();
            }

            System.out.println("---------------------------------");
            break;
            case 6:
            repeat=false;
            break;
        }
        }
    }*/
}