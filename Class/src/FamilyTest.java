public class FamilyTest {
    public static void main(String[] args) {
        Family f=new Family();
        f.setFatherName("Gurinder Singh");
        f.setMotherName("Bhupinder Kaur");
        f.setSonName("Gagan");
        f.setDaughterName("Joban");
        f.setFatherSalary(40000);
        f.setMotherSalary(50000);
        f.setSonFee(25000);
        f.setDaughterFee(30000);
        f.displayName();
        System.out.println(f.getTotalsalary());
        System.out.println(f.getTotalFee());
        f.getSavings();

    }
}
