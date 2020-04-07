package PRACTICE;

public class EmployeeParTime extends SalaryPolicy{

    private float rate;

    public EmployeeParTime() {
        this.rate = (float) 2.5;
    }

    public EmployeeParTime(float baseSalary) {
        super(baseSalary);
        this.rate = (float) 2.5;
    }

    @Override
    float getSalary() {
        return this.rate * super.getBaseSalary();
    }
}
