/**
 * @program: Assignment4
 * @filename: Course
 * @author: Ke Chen
 * @date: 2020/9/27
 * @description:
 **/
public class Course implements Cloneable {
    private String name;
    private String description;
    private String department;
    private String start;
    private String weekday;

    public Course(String name, String description, String department, String start, String weekday) {
        this.name = name;
        this.description = description;
        this.department = department;
        this.start = start;
        this.weekday = weekday;
    }

    @Override
    public Object clone() {
        try {
            return (Course) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Course(this.name, this.description, this.department, this.start, this.weekday);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
}
