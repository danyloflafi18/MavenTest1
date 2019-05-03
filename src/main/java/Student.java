public class Student {

    public String firstName;
    public String lastName;
    public int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void print() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }
}
