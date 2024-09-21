
package classes;

public class Recipe extends Restaurant {
    public String rawName[]=new String [400];
    public double rawQuantity[]=new double[400];

    public void deductStock(Stock s, Recipe r, int multi){
        int i=0;
        while(i<r.rawName.length){
            int x=0;
            while(x<s.materialName.length){
                if(r.rawName[i]!=null){
                    if(r.rawName[i].equals(s.materialName[x])){
                        s.material[x]=s.material[x]-multi*(r.rawQuantity[i]);
                    }
                }
                x++;
            }
            i++;
        }
    }
}
