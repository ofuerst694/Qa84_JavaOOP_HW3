public abstract class Employee extends HW4_Person {

    private String company;
    private double salary;

    public Employee() {}

    public Employee(int id, String name, double age, String company, double salary) {
        super(id, name, age);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if(company != null)
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary)
    {
        if(salary > 0)
        this.salary = salary;
    }

    @Override
    public String toString() {

//        return super.toString()
//                + "Company: " + company
//                + "Salary: " + salary;
        String str = super.toString()
         + "Company: " + company
                + "Salary: " + salary;
        return str;
    }
    public abstract double calculateSalary();// schablon , bez tela(bez {})üüüü

}
