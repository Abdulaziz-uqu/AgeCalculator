

public class Helper  {
    static int Choice;


    // return the age as string in form of years ,months and days
    public static String GetAge(String Dob) {
            String Str = "" ;
            AgeCalculator Age = new AgeCalculator(Dob);
             
            Str = "Your age is " + Age.getY() + " Years " + Age.getM() + " months "+ Age.getD() + " days" ;
            
        

            return Str ;
    }
     
    // make an obj of class AgeCalculator
    public static AgeCalculator TakeData(String Name,String Dob) {
        
        AgeCalculator Age1 = new AgeCalculator(Name,Dob);

        return Age1 ;
    }

    // return a string to tell who is older between two obj
    public static String whoIsOlder(AgeCalculator U1, AgeCalculator U2) {
        String Str1 = "" ;

        if (U1.getY() == U2.getY()) {
            if (U1.getM() == U2.getM()) {
                if (U1.getD() > U2.getD()) {
                    Str1 = U1.GetName() + " is Older then " + U2.GetName();
                } else if (U1.getD() < U2.getD()) {
                    Str1 = U2.GetName() + " is Older then " + U1.GetName();
                } else if (U1.getD() == U2.getD()) {
                    Str1 = U2.GetName() + " And " + U1.GetName() + " have the same age";
                }
            } else if (U1.getM() > U2.getM()) {
                Str1 = U1.GetName() + " is Older then " + U2.GetName();
            } else if (U1.getM() < U2.getM()) {
                Str1 = U2.GetName() + " is Older then " + U1.GetName();
            }
        } else if (U1.getY() > U2.getY()) {
            Str1 = U1.GetName() + " is Older then " + U2.GetName();
        } else if (U1.getY() < U2.getY()) {
            Str1 = U2.GetName() + " is Older then " + U1.GetName();
        }
        return Str1; 
    }
     
    // return the date when you will reach a specific age 
    public static String Timeuntil(AgeCalculator U,int Age) {
        String Str1 = "" ;
            
        if (Age > U.getY()) {
           int leapdays = Age / 4 ;

            Str1 = U.getDoB().plusDays(Age*365 + leapdays) + " you will reach the age of "+ Age ;
        } else {
            Str1 = "You are older then age " + Age;
        }

        return Str1;

    }

    

}
