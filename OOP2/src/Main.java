import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Student s1 = new Student("Morten");
        s1.passedCourses.add("Tysk");
        s1.passedCourses.add("Java 1.0");
        persons.add(s1);

        Student s2 = new Student("Svend");
        s2.passedCourses.add("Matematik");
        s2.passedCourses.add("Dansk");
        persons.add(s2);

        Teacher t1 = new Teacher ("Yvonne");
        t1.canTeach.add("Java 1.0");
        persons.add(t1);


        Teacher t2 = new Teacher ("Egon");
        t2.canTeach.add("Tysk");
        persons.add(t2);

        for (Person p: persons) {
            p.addCourse("Java 1.0");
            if (p.addCourse("Java 1.0") == false) {
                if (p instanceof Teacher)
                    System.out.println(p +" kan ikke undervise I dette fag");
                  if (p instanceof Student)
                      System.out.println(p + " har bestået dette fag");

              }

            }


         }

     }
