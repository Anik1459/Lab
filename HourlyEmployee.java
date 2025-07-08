import java.util.Scanner;

public class HourlyEmployee extends Employee {

    private Double hoursalary =5.0;
   private double hour;

    public HourlyEmployee( String FirstName, String LastName, String SecuirityNumber,double hour) {
        super(FirstName, LastName, SecuirityNumber);
          this.hour=hour;

    }

    public double Earning() {
         if(hour<=40){
             return hoursalary*hour;
         }
         else{
             return hoursalary*40 +hoursalary*1.5*(hour-40);
         }
    }

    @Override
    public String toString() {
        return "Name "+ getFirstName()+" "+getLastName()+" "+"Security Number "+getSecuirityNumber()+" "+"Weekly Earning "+Earning()+"$";
    }
}
