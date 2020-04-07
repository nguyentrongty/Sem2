package PRACTICE;

public abstract class SalaryPolicy {

    private float baseSalary;

    public SalaryPolicy() {

    }

    public SalaryPolicy(float baseSalary) {
        this.baseSalary = baseSalary;
    }
    public float getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    abstract float getSalary();
}

