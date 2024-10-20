public abstract class Employee implements Payable {
    private String employeeId;
    private String name;
    private double averageMonthlySalary;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    public void setAverageMonthlySalary(double averageMonthlySalary) {
        this.averageMonthlySalary = averageMonthlySalary;
    }

    @Override
    public String toString() {
        return String.format("Employee ID: %s, Name: %s, Average Monthly Salary: %.2f", employeeId, name, averageMonthlySalary);
    }
}
