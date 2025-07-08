import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static ArrayList<Employee> empList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("=================================================== PAYROLL SYSTEM ========================================");
        while (true) {

            Employee employeeS1 = new SalariedEmployee("Md.", "Mahmud", "MM001");
            Employee employeeH1 = new HourlyEmployee("Md.", "Hasan", "H001",32);
            Employee employeeC1 = new CommissionEmployee("Md.", "Dhrubo", "C001",4000.0);
            Employee employeeB1 = new BasePlusCommissionEmployee("Md.", "Anik", "B001",3000.0,85.0);

            empList.add(employeeS1);
            empList.add(employeeH1);
            empList.add(employeeC1);
            empList.add(employeeB1);

            System.out.println("========== Choice Anything ============");
            System.out.println("1. Add Employee");
            System.out.println("2. View all Employee");
            System.out.println("3. Process Payroll(Apply 10% bonus)");
            System.out.println("4. Display Payrool report");
            System.out.println("5. Search Employee");
            System.out.println("6. Exit");

            int s = input.nextInt();
            input.nextLine();

            if (s == 1) {
                addEmployee();
            } else if (s == 2) {
                viewAllEmployees();
            } else if (s == 3) {
                processPayroll();
            } else if (s == 4) {
                displayPayroolREport();
            } else if (s == 5) {
                searchEmployee();
            } else if (s == 6) {
                System.out.println("Exixting Payrool system");
                System.exit(0);
            } else {
                System.out.println("Invalid Input");
            }

        }
    }



     static void addEmployee() {

         System.out.println("=".repeat(18));
         System.out.println("Chosse Employee Type:");
         System.out.println("=".repeat(18));
         System.out.println("1.Salaried Employee");
         System.out.println("2.Hourly  Employee");
         System.out.println("3.Commission Employee");
         System.out.println("4.Base Plus Commission Employee");
         System.out.println("Enter Type of Employee:");
         int s=input.nextInt();
         input.nextLine();
         System.out.println("What is your first name?");
         String firstName = input.nextLine();
         System.out.println("What is your last name?");
         String lastName = input.nextLine();
         String ssn;
         while (true) {
             System.out.print("Enter Secuirity Number: ");
             ssn = input.nextLine();
             boolean exists = false;
             for (Employee emp : empList) {
                 if (emp.getSecuirityNumber().equalsIgnoreCase(ssn)) {
                     exists = true;
                     break;
                 }
             }
             if (exists) {
                 System.out.println("SSN already exists. Please enter a unique SSN.");
             } else {
                 break;
             }
         }
         if(s==1) {
            empList.add(new SalariedEmployee(firstName, lastName, ssn));
         }
         else if(s==2) {
             System.out.println("How many hours do you want to work in a week?");
             double hours = input.nextDouble();
             empList.add(new HourlyEmployee(firstName, lastName, ssn, hours));
         }
         else if(s==3) {
             System.out.println("Grooss sales in the week?");
             double grosssales = input.nextDouble();
             empList.add(new CommissionEmployee(firstName, lastName, ssn,grosssales));
         }
         else if(s==4) {
             System.out.println("Grooss sales in the week?");
             double grosssales = input.nextDouble();
             System.out.println("Base Salary");
             double baseSalary = input.nextDouble();
             empList.add(new BasePlusCommissionEmployee(firstName, lastName, ssn,grosssales,baseSalary));
         }
         else{
             System.out.println("Invalid Input. Please try again later.");
         }
    }


    static void viewAllEmployees(){
        if(empList.isEmpty()){
            System.out.println("There are no employees available.");
        }
        else{
            for(Employee emp : empList){
                System.out.println("-".repeat(8));
                System.out.println(emp);
                System.out.println("-".repeat(8));

            }
        }
    }
     static void processPayroll() {
        for (Employee emp : empList) {
            if (emp instanceof BasePlusCommissionEmployee bpce) {
                bpce.increaseBaseSalary();
                System.out.printf("Increased base salary for: %s %s\n", bpce.getFirstName(), bpce.getLastName());
            }
        }
    }
    static void displayPayroolREport(){
        for (Employee emp : empList) {
            System.out.println("-----------------------------");
            System.out.println(emp);
            System.out.printf("Earnings: $%.2f\n", emp.Earning());
        }
    }
     static void searchEmployee() {
        System.out.print("Enter SSN to search: ");
        String searchSSN = input.nextLine();

        for (Employee emp : empList) {
            if (emp.getSecuirityNumber().equalsIgnoreCase(searchSSN)) {
                System.out.println("Employee Found:");
                System.out.println(emp);
                System.out.printf("Earnings: $%.2f\n", emp.Earning());
                return;
            }
        }
        System.out.println("No employee found with SSN: " + searchSSN);
    }
}