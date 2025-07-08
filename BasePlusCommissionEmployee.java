public class BasePlusCommissionEmployee extends CommissionEmployee {
    public double baseSalary;

    public BasePlusCommissionEmployee(String FirstName, String LastName, String SecuirityNumber,double grosssales,double baseSalary) {
        super(FirstName, LastName, SecuirityNumber,grosssales);
         this.baseSalary=baseSalary;
    }

    public void increaseBaseSalary() {
        baseSalary = baseSalary * 1.10;
    }

    public double Earning() {
        double ans=super.Earning();
        return ans+baseSalary;
    }

    @Override
    public String toString() {
        return "Name "+ getFirstName()+" "+getLastName()+" "+"Security Number "+getSecuirityNumber()+" "+"Weekly Earning "+Earning()+"$";
    }
}