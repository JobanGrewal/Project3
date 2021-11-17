public class PersonTest {
    public static void main(String[] args) {
        Person p1= new Person();
        Person p= new Person("Joban","Grewal","brampton",25);
//        p.setFirstName("Joban");
//        p.setLastName("Grewal");
//        p.setAddress("abc");
//        p.setAge(28);
       //System.out.println("Name of person is " + p.getFirstName()+ " " + p.getLastName());
        System.out.println("Full name of person is " + p.fullName());
        System.out.println("Address of person is " + p.getAddress());
        System.out.println("Age of person is " + p.getAge());
        System.out.println("New address is: " + p.changedAddress("hamilton"));
    }
}
