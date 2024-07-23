package Method;

public class EmployeeDemo {
    protected int empId;
    public String empName;
    private long empSalary;
    String empDept;

    public void doPublic(){

    }

    void doDefault(){

    }

    protected void doProtected(){

    }

    private void doPrivate()
    {

    }

    @Override
    public String toString() {
        return "EmployeeDemo [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDept="
                + empDept + "]";
    }

    
    
    public static void main(String[] args) {
        EmployeeDemo emp =  new EmployeeDemo();
        emp.empId=1;
        emp.empName="Nishu";
        emp.empDept="HR";
        emp.empSalary=1000000;
        System.out.println(emp);


    }

}
