/**
 * @program: Assignment4
 * @filename: StudentTest
 * @author: Ke Chen
 * @date: 2020/9/27
 * @description:
 **/
public class StudentTest {
    public static void main(String[] args) {
        Course course = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tue");
        Student student = new Student("John", "Smith", 20, (float) 3.6, "Computer Science major", "School of Computer Science department", course);
        Student studentClone = (Student) student.clone();
        student.printInfo();
        studentClone.printInfo();
    }
}
