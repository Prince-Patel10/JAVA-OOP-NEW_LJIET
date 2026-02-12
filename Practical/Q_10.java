
class Q_10 {

    String employee_Id;
    String employee_Name;
// Constructor

    Q_10(String id, String name) {
        employee_Id = id;
        employee_Name = name;
    }
// Method to display employee details

    void display() {
        System.out.println("Employee ID: " + employee_Id);
        System.out.println("Employee Name: " + employee_Name);
    }
}

class SalariedEmployee extends Q_10 {

    String designation;
    double monthly_salary;
// Constructor

    SalariedEmployee(String id, String name, String desig, double salary) {
        super(id, name);
        designation = desig;
        monthly_salary = salary;
    }
// Method to update details

    //void update(String desig, double salary) {
        //designation = desig;
        //monthly_salary = salary;
    //}
// Method to display all details

    void displayAll() {
        super.display();
        System.out.println("Designation: " + designation);
        System.out.println("Monthly Salary: " + monthly_salary);
    }
// Main method

    public static void main(String[] args) {
// Create array of SalariedEmployee from command line arguments
// Example arguments: E101 Ravi Manager 50000 E102 Anita Clerk 30000
        int n = args.length / 4; // Each employee has 4 arguments
        SalariedEmployee[] emp = new SalariedEmployee[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            String id = args[k++];
            String name = args[k++];
            String desig = args[k++];
            double salary = Double.parseDouble(args[k++]);
            emp[i] = new SalariedEmployee(id, name, desig, salary);
        }
// Display all employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1) + " Details:");
            emp[i].displayAll();
        }
    }
}
