package package2;

import package1.PackagePractice;

public class AccessModifierTest {
    public static void main(String[] args) {
        AccessModifierDemo a = new AccessModifierDemo();
        a.multiply(3,4);
        a.division(8,2);
        PackagePractice d = new PackagePractice();  // Created object of class present in different package
        d.setAge(20);                               // Accessing public method of class present in different package
        System.out.println(d.getAge());
        d.setName("abc");
        System.out.println(d.getName());
    }

}
