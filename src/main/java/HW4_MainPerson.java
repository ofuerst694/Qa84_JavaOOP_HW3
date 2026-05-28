public class HW4_MainPerson {

    public static void main(String[] args) {
        HW4_Person p = new HW4_Person();
        p.setName("Anna");
        p.setAge(23.5);
        p.setId(1234);

        System.out.println(p);
        //System.out.println(p.getName());

//        Employee emp = new Employee(1243,"Anna",32.5,"IBM",4000);
//        System.out.println(emp);
        SalesEmployee se = new SalesEmployee(1256,
                "Alex",45.5, "IBM",
                3500,100000,2);
        System.out.println(se);
        System.out.println("Salary: ");
        System.out.println(se.calculateSalary() + "euro");

    }
    /*
    p->[name = Anna, id = 1234, age = 23.5]
     */
}
