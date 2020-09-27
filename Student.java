/**
 * @program: Assignment4
 * @filename: Student
 * @author: Ke Chen
 * @date: 2020/9/27
 * @description:
 **/
public class Student implements Cloneable{
    private String firstName;
    private String lastName;
    private int age;
    private float gpa;
    private String major;
    private String department;
    private Course course;

    public Student(String firstName, String lastName, int age, float gpa, String major, String department, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.course = course;
    }

    @Override
    public Object clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Student(this.firstName, this.lastName, this.age, this.gpa, this.major, this.department, (Course) this.course.clone());
        }
    }

    public void printInfo(){
        System.out.println("Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", major='" + major + '\'' +
                ", department='" + department + '\'' +
                ", course=" + course +
                '}');
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
