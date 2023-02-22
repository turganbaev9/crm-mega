package model;

import java.time.LocalTime;

public class Course extends BaseEntity {
    private String name;
    private double price;
    private CourseFormat courseFormat;

    public CourseFormat getCourseFormat() {
        return courseFormat;
    }

    public void setCourseFormat(CourseFormat courseFormat) {
        this.courseFormat = courseFormat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                super.toString()+'\n'+
                "name='" + name + '\n' +
                " price=" + price + '\n'+
                " courseFormat=" + courseFormat +
                '}';
    }
}