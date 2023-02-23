
import java.time.*;



public class AgeCalculator {
    
    private String Name;
    private LocalDate DOB ;
    private  int Y ;
    private  int M ;
    private  int D ;
    

    public AgeCalculator(String dob){
        this.Name = null;
        this.DOB = LocalDate.parse(dob);  
        LocalDate curDate = LocalDate.now(); 
        int Y = Period.between(this.DOB, curDate).getYears();  
        int M = Math.abs(this.DOB.getMonthValue()-curDate.getMonthValue()) ;
        int D = Math.abs(this.DOB.getDayOfMonth()-curDate.getDayOfMonth()) ;

        this.Y = Y ;
        this.M = M ;
        this.D = D ;
    }
    
    public AgeCalculator(String Name,String dob){
        this.Name = Name ;
        this.DOB = LocalDate.parse(dob);  
        LocalDate curDate = LocalDate.now(); 
        int Y = Period.between(this.DOB, curDate).getYears();  
        int M = Math.abs(this.DOB.getMonthValue()-curDate.getMonthValue()) ;
        int D = Math.abs(this.DOB.getDayOfMonth()-curDate.getDayOfMonth()) ;

        this.Y = Y ;
        this.M = M ;
        this.D = D ;
    }

    public String GetName(){
        return this.Name;
    }

    public int getY(){
        return this.Y;
    } 

    public int getM(){
        return this.M;
    } 

    public int getD(){
        return this.D;
    } 
    

    public LocalDate getDoB() {
       return this.DOB ;         
    }

    

}
