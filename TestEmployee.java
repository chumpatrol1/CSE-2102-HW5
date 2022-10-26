import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Initialize and get the presets of Employee 1
        System.out.println("Employee 1");
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee id: ");
        String id = sc.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = Double.parseDouble(sc.nextLine());
        System.out.print("Enter date (year) of hire: ");
        int year = Integer.parseInt(sc.nextLine());

        Employee employee1 = new Employee(name, id, salary, year);

        // Print out Employee 1
        System.out.println();
        employee1.writeOutput();
        
        // Set new name and salary for employee 1
        System.out.print("\nEnter new name for employee #1: ");
        String newName = sc.nextLine();
        System.out.print("Enter new salary for employee #1: ");
        double newSalary = Double.parseDouble(sc.nextLine());

        employee1.reset(newName, newSalary);
        System.out.println();
        employee1.writeOutput(); //reset and print

        // Initialize Employee 2
        System.out.println("\nEmployee 2");
        System.out.print("Enter employee name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter employee id: ");
        String id2 = sc.nextLine();
        System.out.print("Enter employee salary: ");
        double salary2 = Double.parseDouble(sc.nextLine());
        System.out.print("Enter date (year) of hire: ");
        int year2 = Integer.parseInt(sc.nextLine());

        Employee employee2 = new Employee(name2, id2, salary2, year2);
        employee2.writeOutput();
        employee1.writeOutput();

        // Check if equal
        if(employee1.equals(employee2)){
            System.out.println("\nThey are the same employee");
        } else {
            System.out.println("\nThey are not the same employees");
        }

    }
}
