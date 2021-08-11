/*
Java Packages
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Employee PayRoll Services
 */
public class EmpPayRollServices {
    private  List<EmpPayRollData> empPayRollList;

    public EmpPayRollServices(List<EmpPayRollData> empPayRollList) {
        this.empPayRollList = empPayRollList;
    }
    /*
    Declaring Main Method and Calling The Methods
     */

    public static void main(String[] args){
        ArrayList<EmpPayRollData> empPayRollList = new ArrayList<>();
        EmpPayRollServices empPayRollServices = new EmpPayRollServices(empPayRollList);
        Scanner consoleInputReader = new Scanner(System.in);
        empPayRollServices.readEmpPayRollData(consoleInputReader);
        empPayRollServices.writeEmpPayRollData();
    }
    /*
    Write Employee Roll Data Method
    Printing Details Of Employee
     */

    private void writeEmpPayRollData() {
        System.out.println("Writing Employee Data To Console :" +empPayRollList);
    }
    /*
    Read Emp PayRoll Data Method
    Reading Details From The Scanner
    Adding Details To List
     */

    private void readEmpPayRollData( Scanner consoleInputReader) {
        System.out.println("Enter Employee Id :");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name :");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary :");
        double salary = consoleInputReader.nextDouble();
        empPayRollList.add(new EmpPayRollData(id,name,salary));
    }
}