package package1;

public class AddressTest {
    public static void main(String[] args) {
        Address a = new Address();
        a.setAddress("Brampton");
        System.out.println(a.getAddress());
        PackagePractice d = new PackagePractice();      // Created object of another class which is present in same package to access public method of that class
        d.setAge(20);                                  //Accessing Public Method from another class in same package
        System.out.println(d.getAge());                //Accessing Public Method from another class in same package
    }
}
