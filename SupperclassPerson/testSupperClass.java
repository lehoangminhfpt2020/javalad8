package lad8.SupperclassPerson;

public class testSupperClass {
    public static void main(String[] args) {
        Person minh = new Person("minh","Ha Noi");
        Student no1 = new Student("","","ok ",1996,4.4);
        no1.name = "minh";
        no1.address="Ha Nội";
        no1.program= "ok";
        no1.year=1996;
        no1.fee=4.4;
        System.out.println(no1);

        Staff no2 = new Staff("name", "Lang Son","FPT",9.0);
        no2.name= "minh";
        no2.address="lang son";
        no2.school= "NEU";
        no2.pay= 9.0;
        System.out.println(no2);
    }

}
