package classes;

import java.util.*;
public class Stock {
    public String name;
    public String materialName[]=new String[400];
    public double material[]=new double[400];
    
    /*{//Pizzaitems
        materialName[0]= "dough";
        materialName[1]= "meat";
        materialName[2]= "cheese"; 
        materialName[3]= "sauce";
        materialName[4]= "spices";
    //Burgeritems 
        materialName[5]= "bun";
        materialName[6]= "patty";     
        materialName[7]= "burgerSauce"; 
        materialName[8]= "burgerSpices"; 
    //Pastaitems 
        materialName[9]= "pasta"; 
        materialName[10]= "veg" ;
        materialName[11]= "cream";
        materialName[12]= "pastaSpices";
        materialName[13]= "drinks";
    }
    {
        material[0]=1000;
        material[1]=1000;
        material[2]=1000;
        material[3]=1000;
        material[4]=1000;
        material[5]=1000;
        material[6]=1000;
        material[7]=1000;
        material[8]=1000;
        material[9]=1000;
        material[10]=1000;
        material[11]=1000;
        material[12]=1000;
        material[13]=1000;
    }*/
    
    public void addMaterialName(String name){
        int i=0;
        while(i<materialName.length){
            if(materialName[i]==null){
                materialName[i]=name;
            }
            i++;
        }
    }

    

    
        
}
