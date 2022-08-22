
public class clockangle{

    public static double clocke(double inValue) throws Exception{
        System.out.println(" Input value received :: " + inValue);
        if(inValue > 2359){
            throw new Exception("Invalid Input");
        }
        int hours = (int)inValue/100;
        int minutes = (int)inValue%100;
        if(minutes > 59){
            throw new Exception("Invalid Input");
        }
        // convert hours into 12 hours clock format
        hours= hours>12?hours-12:hours;
        //Total number of minutes for hours angle calculation
        int totalMinutes = ((hours * 60) + minutes);
        //Calculate total Minutes; every minute has 6degree angle
        int mangle =  minutes * 6;
        double hangle = totalMinutes * 0.5;
        System.out.println("Hours angle " + hangle + " minutes angle :: " + mangle); 
        double angle = Math.abs(hangle - mangle);        
        if(hangle > mangle)
            angle = 360 - angle;
        System.out.println("Angle " + angle); 
        return Math.abs(angle);
    }

    public static void main(String[] args){
        System.out.println("Starting Java program");
        try{
            double angle = clocke(Double.parseDouble(args[0]));
            System.out.println("Output :: " + angle);
        }catch(Exception exception ){
            System.out.println(exception.getMessage());
        }
    }

}