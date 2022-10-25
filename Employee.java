public class Employee extends Person
{
    private double salary;
    private int hireDate;
    private String employee_id;
    public Student(String initialName, int cur_salary, int hired, String emp_id)
    {
        super(initialName);
        salary = cur_salary;
        hireDate = hired;
        employee_id = emp_id;
    }

    public void reset(String newName, int newStudentNumber)
    {
        setName(newName);
        studentNumber = newStudentNumber;
    }

    public int getEmployeeID()
    {
        return employee_id;
    }
    
    public void setEmployeeID(String newEmployeeID)
    {
        employee_id = newEmployeeID;
    }

    public int getHireDate()
    {
        return employee_id;
    }
    
    public void setHireDate(int new_hd)
    {
        hireDate = new_hd;
    }

    public double getSalary()
    {
        return employee_id;
    }
    
    public void setSalary(double new_sal)
    {
        salary = new_sal;
    }
    
    public void writeOutput()
    {
        System.out.println("Name: " + getName( ));
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Hire Date: " + getHireDate());
        System.out.println("Salary: " + getSalary());
    }
    
    public boolean equals(Employee otherEmployee)
    {
        return this.hasSameName(otherEmployee) &&
        (this.employee_id == otherEmployee.employee_id) && 
        (this.hireDate == otherEmployee.hireDate) &&
        (this.salary == otherEmployee.salary);
    }

}