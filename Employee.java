public class Employee extends Person
{   
    // Declare variables
    private String employeeId;
    private int employeeYearHired;
    private double employeeSalary;

    // Initialize the Employee
    public Employee(String initialName, String initialId, double salary, int yoh)
    {
        super(initialName);
        employeeId = initialId;
        employeeYearHired = yoh;
        employeeSalary = salary;
    }
    // Reset function
    public void reset(String newName, double newSalary)
    {
        setName(newName);
        employeeSalary = newSalary;
    }
    //Gets employee name
    public String getEmployeeName()
    {
        return getName();
    }
    //Gets employee ID
    public String getEmployeeId()
    {
        return employeeId;
    }
    //gets employee salary
    public double getEmployeeSalary()
    {
        return employeeSalary;
    }
    //gets the start year of the employee
    public int getYoh()
    {
        return employeeYearHired;
    }
    // Sets the name of the employee
    public void setEmployeeName(String newName)
    {
        setName(newName);
    }
    // Sets the employee ID
    public void setEmployeeId(String newId)
    {
        employeeId = newId;
    }
    // Sets the employee's salary
    public void setEmployeeSalary(double newSalary)
    {
        employeeSalary = newSalary;
    }
    // Sets the employee's year of hire
    public void setEmployeeYear(int newYoh)
    {
        employeeYearHired = newYoh;
    }
    // Writes the output, including name, id, salary and year of hire
    public void writeOutput()
    {
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + employeeId);
        System.out.println(String.format("Salary: %.1f", employeeSalary));
        System.out.println("Year of hire: " + employeeYearHired);
    }
    // Check if equal to another employee
    public boolean equals(Employee otherEmployee)
    {
        return this.hasSameName(otherEmployee) &&
                (this.employeeId == otherEmployee.employeeId) &&
                (this.employeeSalary == otherEmployee.employeeSalary) &&
                (this.employeeYearHired == otherEmployee.employeeYearHired);
    }
}
