public class HW4_Person {
    private String name;
    private int id;
    private double age;


    public HW4_Person() {}

    public HW4_Person(int id, String name, double age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null)
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0)
        this.id = id;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        if(age > 0)
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name // without variable
               + " Age: " + age
               + " ID " + id;

//        String str = "Name"+ name -> with variable
//                + " Age: " + age
//                + " ID " + id;
//        return str;

    }
}
