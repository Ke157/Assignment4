/**
 * @program: Assignment4
 * @filename: EmployeeTest
 * @author: Ke Chen
 * @date: 2020/9/27
 * @description:
 **/
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Smith", 101, 35f);
        int[] hours = {40, 23, 1, 0, -5, 45};
        for (int i = 0; i < hours.length; i++) {
            int hour = hours[i];
            try {
                System.out.println("hour: " + hour + " pay:" + employee.computePay(hour));
            } catch (Employee.TooManyHoursWorkedException e) {
                System.out.println("TooManyHoursWorkedException:" + hour);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException:" + hour);
            }
        }

    }
}
