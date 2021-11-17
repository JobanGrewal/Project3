public class Family {
    private String fatherName;
    private String motherName;
    private String sonName;
    private String daughterName;
    private double fatherSalary;
    private double motherSalary;
    private double sonFee;
    private double daughterFee;
    private int grocery = 500;

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getSonName() {
        return sonName;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }

    public String getDaughterName() {
        return daughterName;
    }

    public void setDaughterName(String daughterName) {
        this.daughterName = daughterName;
    }

    public double getFatherSalary() {
        return fatherSalary;
    }

    public void setFatherSalary(double fatherSalary) {
        this.fatherSalary = fatherSalary;
    }

    public double getMotherSalary() {
        return motherSalary;
    }

    public void setMotherSalary(double motherSalary) {
        this.motherSalary = motherSalary;
    }

    public double getSonFee() {
        return sonFee;
    }

    public void setSonFee(double sonFee) {
        this.sonFee = sonFee;
    }

    public double getDaughterFee() {
        return daughterFee;
    }

    public void setDaughterFee(double daughterFee) {
        this.daughterFee = daughterFee;
    }

    public int getGrocery() {
        return grocery;
    }

    public void setGrocery(int grocery) {
        this.grocery = grocery;
    }

    public void displayName() {
        System.out.println("Father's name is: " + fatherName + " Mother's name is: " + motherName + " Son's name is: " + sonName + " Daughter's name is: " + daughterName );
    }

    public double getTotalsalary() {
        double totalSalary = fatherSalary + motherSalary;
        System.out.println("Total salary is ");
        return totalSalary;
    }

    public double getTotalFee() {
        double totalFee = sonFee + daughterFee;
        System.out.println("Total fees is");
        return totalFee;
    }

    public void getSavings() {
        double saving = (fatherSalary + motherSalary) - (sonFee + daughterFee) - grocery;
        System.out.println("Savings is: " + saving);
        if (saving > 1000) {
            System.out.println("Congratulations " + fatherName + " you saved " + saving + "this month");
        } else {
            System.out.println("Dear " + fatherName + " try to save for next month");
        }
    }

    @Override
    public String toString() {
        return "Family{" +
                "fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", sonName='" + sonName + '\'' +
                ", daughterName='" + daughterName + '\'' +
                ", fatherSalary=" + fatherSalary +
                ", motherSalary=" + motherSalary +
                ", sonFee=" + sonFee +
                ", daughterFee=" + daughterFee +
                ", grocery=" + grocery +
                '}';
    }
}
