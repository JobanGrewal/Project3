package package1;

public class PackagePracticeTest {
    public static void main(String[] args) {
        PackagePractice d = new PackagePractice();
        d.setAge(23);
        d.setName("joban");
        System.out.println(d.getAge());
        System.out.println(d.getName());
        Address a = new Address();                // Created object of another class to access its public and protected method
        a.setAddress("hamilton");                 // Accessing Public method of another class which is present in same package
        System.out.println(a.getAddress());       // Accessing Default method of another class which is present in same package
    }
}
