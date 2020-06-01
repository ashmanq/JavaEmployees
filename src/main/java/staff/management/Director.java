package staff.management;

public class Director extends Manager {

    private Double budget;

    public Director(String name, String natInsNo, Double salary, Double budget) {
        super(name, natInsNo, salary);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }
}
