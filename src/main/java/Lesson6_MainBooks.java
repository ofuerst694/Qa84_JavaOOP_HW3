public class Lesson6_MainBooks {

    public static void main(String[] args) {
        Book bk = new Book("Buratino","Tolstoy",150,12345);
        System.out.println(bk.toString());
        FictionBook fb =
                new FictionBook("Wij", "Gogol",230, 13567,"Drama");
        System.out.println(fb.toString());

        EducationBook eb =
                new EducationBook("Math", "Pifagor",300,18765,"Geometry");
        System.out.println(eb);

        KidsFictionBook kfb =
                new KidsFictionBook("Kolobok", "Persons",
                        40, 14432, "Fairytale",3);
        System.out.println(kfb);
    }
}


/*
                                Person
                            [name, id, age]
                        |           |              |
                     Employee     SportsMan       Patient
             [company, salary]    [sport, status]     [idCardInsurance]
                     |                   |
                SalesEmployee
                [bonus]

 */