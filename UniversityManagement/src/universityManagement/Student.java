package universityManagement;
import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course>enrolledCourses;
	public Student(String name) {
		super();
		this.name = name;
		this.enrolledCourses = new ArrayList<>();
	}
    public String getName() {
        return name;
    }
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
        }
    }
    public List<Course> getEnrolledCourses() {
        return enrolledCourses; 
    }
    @Override
    public String toString() {
        return name;
    }
}