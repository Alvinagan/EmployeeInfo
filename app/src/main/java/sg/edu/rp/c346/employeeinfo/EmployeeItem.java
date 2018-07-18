package sg.edu.rp.c346.employeeinfo;

public class EmployeeItem {

    private String employeeName;
    private String employeeTitle;
    private  String employeeSalary;

    public EmployeeItem(String employeeName, String employeeTitle, String employeeSalary) {
        this.employeeName = employeeName;
        this.employeeTitle = employeeTitle;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "EmployeeItem{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeTitle='" + employeeTitle + '\'' +
                ", employeeSalary='" + employeeSalary + '\'' +
                '}';
    }
}
