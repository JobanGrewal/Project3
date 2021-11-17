public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    public  Person(){}

    public Person(String firstName, String lastName, String address, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.age=age;
    }

    public String getFirstName() {
        return firstName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String fullName(){
        return firstName + " " + lastName;
    }
    public String changedAddress(String address){
       return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
