
package classes;

public class Feedback extends foodOrder {
    
    public String cusFeedbacks[]=new String[500];
    public String empFeedbacks[]=new String[500];
    public String notices[]=new String[100];
    public String toPrm[]=new String[100];
    public String toHrm[]=new String [100];

    public void giveCusFeedback(String feed){
        int i=0;
        while(true){
            if(cusFeedbacks[i]==null){
                cusFeedbacks[i]=feed;
                break;
            }
            i++;
        }
    }

    public void giveToPrm(String feed){
        int i=0;
        while(true){
            if(toPrm[i]==null){
                toPrm[i]=feed;
                break;
            }
            i++;
        }
    }

    public void giveToHrm(String feed){
        int i=0;
        while(true){
            if(toHrm[i]==null){
                toHrm[i]=feed;
                break;
            }
            i++;
        }
    }

    public void giveEmpFeedback(String feed){
        int i=0;
        while(true){
            if(empFeedbacks[i]==null){
                empFeedbacks[i]=feed;
                break;
            }
            i++;
        }
    }

    public void giveNotice(String notice){
        int i=0;
        while(true){
            if(notices[i]==null){
                notices[i]=notice;
                break;
            }
            i++;
        }
    }

    public void CusFeedbacks(){
        int i=0;
        while(i<cusFeedbacks.length){
            if(cusFeedbacks[i]!=null) System.out.println((i+1)+". "+cusFeedbacks[i]+"\n");
            i++;
        }
    }

    
    public void toPrm(){
        int i=0;
        while(i<toPrm.length){
            if(toPrm[i]!=null) System.out.println((i+1)+". "+toPrm[i]+"\n");
            i++;
        }
    }

    public void toHrm(){
        int i=0;
        while(i<toHrm.length){
            if(toHrm[i]!=null) System.out.println((i+1)+". "+toHrm[i]+"\n");
            i++;
        }
    }

    public void notices(){
        int i=0;
        while(i<notices.length){
            if(notices[i]!=null) System.out.println((i+1)+". "+notices[i]+"\n");
            i++;
        }
    }

    public void empFeedbacks(){
        int i=0;
        while(i<empFeedbacks.length){
            if(empFeedbacks[i]!=null) System.out.println((i+1)+". "+empFeedbacks[i]+"\n");
            i++;
        }
    }

    public void delCusFeedbacks(){
        int i=0;
        while(i<cusFeedbacks.length){
            cusFeedbacks[i]=null;
            i++;
        }
    }

    public void delEmpFeedbacks(){
        int i=0;
        while(i<empFeedbacks.length){
            empFeedbacks[i]=null;
            i++;
        }
    }

    public void delNotices(){
        int i=0;
        while(i<notices.length){
            notices[i]=null;
            i++;
        }
    }

    public void deltoPrm(){
        int i=0;
        while(i<toPrm.length){
            toPrm[i]=null;
            i++;
        }
    }

    public void deltoHrm(){
        int i=0;
        while(i<toHrm.length){
            toHrm[i]=null;
            i++;
        }
    }
}