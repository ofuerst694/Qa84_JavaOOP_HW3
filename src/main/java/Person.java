public class Person {
    //this - link inhalt dieses klasses
    //fields
    private String name; //globalnaja
    private int id;
    private double age;

    //DEFAULT CONSTRUCTOR
    public Person() {
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    //setters
    public void setName(String name) {//lokalnaja
        if(name != null)
            this.name = name;
    }
    public void setId(int id) {
        if(id > 0)
           this.id = id;
    }
    public void setAge(double age) {
        if(age > 0)
            this.age = age;
    }
    //getters
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getAge() {
        return age;
    }
}
