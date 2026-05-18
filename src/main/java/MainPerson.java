public class MainPerson {
    public static void main(String[] args) {
       Person p1 = new Person();//DEFAUL CONSTRUCTOR// erstehlt objekt Person
        p1.setName("Olga Fuerstenberg");
        p1.setId(12345);
        p1.setAge(44.6);
        System.out.println("Name: "+ p1.getName());
        System.out.println("Id: "+ p1.getId());
        System.out.println("Age: "+ p1.getAge());

        Person p2 = new Person();
        p2.setName("Hanna Cohen");
        p2.setId(12567);
        p2.setAge(34);
        System.out.println("Name: "+ p2.getName());
        System.out.println("Id: "+ p2.getId());
        System.out.println("Age: "+ p2.getAge());
    }
}
/*
p1 ->[name ='...' id='...' age='...']
p2 ->[]
 */

/*
 1.      Computer
       --------

       company(String) "Lenovo"
       ram(int)          8,16
       cpu(String)       i5 or i9
       sdd(int)     500GB
       set/get


       MainComputer -> main
       create 3 objects Computer
       use setters and getters for printing

       2. Advance
       for your choose


 */