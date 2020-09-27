/**
 * @program: Assignment4
 * @filename: Employee
 * @author: Ke Chen
 * @date: 2020/9/27
 * @description:
 **/
public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private float hourlyPay;

    class TooManyHoursWorkedException extends Throwable {
    }

    public Employee(String firstName, String lastName, int id, float hourlyPay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    public float computePay(int hour) throws TooManyHoursWorkedException {
        if (hour < 0) {
            throw new NumberFormatException();
        }
        if (hour > 40) {
            throw new TooManyHoursWorkedException();
        }
        return hour * hourlyPay;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(float hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
}
