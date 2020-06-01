package staff;

public abstract class Employee {

    private String name;
    private String natInsNo;
    private Double salary;

    public Employee(String name, String natInsNo, Double salary) {
        this.name = name;
        this.natInsNo = natInsNo;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNatInsNo() {
        return natInsNo;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(Double payRise) {
        // Prevents method from returning a negative value
        if(payRise > 0) {
            this.salary += payRise;
        }
    }

    public Double payBonus() {
        return (this.salary/100);
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }
}
