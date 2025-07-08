import java.util.Scanner;

public class CommissionEmployee extends Employee {

    final double commissionRate=0.05;
    double grosssales;

    public CommissionEmployee(String FirstName, String LastName, String SecuirityNumber,double grosssales) {
        super(FirstName, LastName, SecuirityNumber);

        this.grosssales=grosssales;
    }


    public double Earning() {
        return grosssales*commissionRate;
    }
   public String toString() {
        return "Name "+ getFirstName()+" "+getLastName()+" "+"Security Number "+getSecuirityNumber()+" "+"Weekly Earning "+Earning()+"$";
    }
}
