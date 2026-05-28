public class SalesEmployee extends Employee {

    private double bonus;
    private double totalSales;

    public SalesEmployee(){}

    public SalesEmployee(int id, String name,
                         double age, String company,
                         double salary, double totalSalares,
                         double bonus) {
        super(id, name, age, company, salary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        if (bonus >= 0)
        this.bonus = bonus;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSalares(double totalSales) {
        if (totalSales >= 0)
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return super.toString()
                +"Bonus: " + bonus
                +"TotalSales: " + totalSales;
    }

    @Override
    public double calculateSalary() {
        double salary = super.getSalary();
        double bonus_money = (totalSales * bonus)/100;
        return salary + bonus_money;
    }
}
