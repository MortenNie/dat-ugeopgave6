import java.util.ArrayList;

public class Teacher extends Person {

    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name) {
        super(name);
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course) {

        for (int i = 0; i < canTeach.size(); i++) {
            if (course == canTeach.get(i))  {
                return false;
            } else{
                currentCourses.add(course);
            }

        }
        return true;
    }



}
