package staff.techStaff;

import staff.Employee;

public class DatabaseAdmin extends Employee {

    private String deptName;

    public DatabaseAdmin(String name, String natInsNo, Double salary) {
        super(name, natInsNo, salary);
        this.deptName = "Tech Staff";
    }

    public String getDeptName() {
        return deptName;
    }
}
