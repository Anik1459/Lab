public class SalariedEmployee extends Employee {
    final Double  fixedSalary=200.0;
    public SalariedEmployee(String FirstName, String LastName, String SecuirityNumber) {
        super(FirstName, LastName, SecuirityNumber);
    }




    @Override
    public double Earning() {
        return fixedSalary;
    }

    @Override
    public String toString() {
            return "Name "+ getFirstName()+" "+getLastName()+" "+"Security Number "+getSecuirityNumber()+" "+"Weekly Earning "+Earning()+"$";
    }
}
