public abstract class Employee {
    private  String FirstName;
    private  String LastName;
    private  String SecuirityNumber;

    public Employee(String FirstName, String LastName, String SecuirityNumber) {
        this.FirstName = FirstName;
        this.LastName =LastName;
        this.SecuirityNumber = SecuirityNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getSecuirityNumber() {
        return SecuirityNumber;
    }


    public  abstract double Earning();

    public String toString(){
        return  "Name:- "+  FirstName + " " + LastName + " " + SecuirityNumber;

    }
}
