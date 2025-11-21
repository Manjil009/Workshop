import java.util.Scanner;
/**
 * Write a description of class Rickshaw_Fare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rickshaw_Fare
{
    public static void main(String[] argus){
        Scanner scanner=new Scanner(System.in);
        System.out.println("------Rickshaw Fare Calculator------");
        System.out.println("Enter distance travelled (in km)=");
        double distance=scanner.nextDouble();
        System.out.println("Enter travel time (in min)=");
        double time=scanner.nextDouble();
        System.out.println("Is customer a local? (Y=Yes/N=No)=");
        String YN=scanner.next().toUpperCase();
        if(YN.equalsIgnoreCase("Y"))
        {
            double local=1.00;
            System.out.println("Is the travel during night time? (Y/N)=");
            String y=scanner.next().toUpperCase();
            if(y.equalsIgnoreCase("Y"))
            {
                double N=1.25;
                double basefare=49.5;
                double ratepkm=20.5;
                double ratepmin=5.5;
                
                //calculation of variable fare 
                double disCharge=Math.max(0,distance-1)*ratepkm; //Math.max() to find greater of two numeric values
                double timeCharge=Math.max(0,time-1)*ratepmin;
                double ufare=basefare+disCharge+timeCharge;
                double total=ufare*local*N;
                
                
                String ufaredisplay=String.format("Rs:%.2f",ufare);
                String totaldisplay=String.format("Rs:%.2f",total);
                
                System.out.println("\n------Fare Details------");
                System.out.println("Initially Fare Calculated="+ufaredisplay);
                System.out.println("Night="+N);
                System.out.println("Local="+local);
                System.out.println("\n=======================================================");
                System.out.println("The FINAL FARE is="+totaldisplay);
                System.out.println("=========================================================");}
                else if(y.equalsIgnoreCase("N"))
                {
                    //for day time
                    double N=1.00;
                double basefare=49.5;
                double ratepkm=20.5;
                double ratepmin=5.5;
                double disCharge=Math.max(0,distance-1)*ratepkm; 
                double timeCharge=Math.max(0,time-1)*ratepmin;
                double ufare=basefare+disCharge+timeCharge;
                double total=ufare*local*N;
                String ufaredisplay=String.format("Rs:%.2f",ufare);
                String totaldisplay=String.format("Rs:%.2f",total);
                System.out.println("\n------Fare Details------");
                System.out.println("Initially Fare Calculated="+ufaredisplay);
                System.out.println("Night="+N);
                System.out.println("Local="+local);
                System.out.println("\n=======================================================");
                System.out.println("The FINAL FARE is="+totaldisplay);
                System.out.println("=========================================================");
            }
            else if(YN.equalsIgnoreCase("N"))
            System.out.println("You will be charged according to drivers will");
            
        }
        scanner.close();
        
        
        
        
    }
    
}