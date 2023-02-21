import model.Course;
import model.CourseFormat;
import model.Mentor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Mentor mentor=new Mentor();
        Course course=new Course();
        course.setId(1);
        course.setName("java");
        course.setPrice(15000);
        CourseFormat bootcamp=new CourseFormat();
        bootcamp.setId(1);
        bootcamp.setDurationInWeek(18);
        bootcamp.setFormat("bootcamp");
        bootcamp.setLessonCoutPerWeek(5);
        bootcamp.setLessonDuration(3);
    course.setCourseFormat(new CourseFormat());
        System.out.println(course.toString());
    }
}