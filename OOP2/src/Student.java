import java.util.ArrayList;

public class Student extends Person {

    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name) {
        super(name);
        this.passedCourses = passedCourses;
    }

    @Override
    public boolean addCourse(String course) {

        for (int i = 0; i < passedCourses.size(); i++) {
            if (course == passedCourses.get(i))  {
                return false;
            } else{
                currentCourses.add(course);
            }

        }
        return true;
    }


}