package model;

public class CourseFormat  extends  BaseEntity{
    private  String format;
    private  int durationInWeek;
    private  boolean isOnline;
    private  int lessonDuration;
    private  int lessonCoutPerWeek;

    @Override
    public String toString() {
        return "CourseFormat{" +
                "format='" + format + '\'' +
                ", durationInWeek=" + durationInWeek +
                ", isOnline=" + isOnline +
                ", lessonDuration=" + lessonDuration +
                ", lessonCoutPerWeek=" + lessonCoutPerWeek +
                '}';
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getDurationInWeek() {
        return durationInWeek;
    }

    public void setDurationInWeek(int durationInWeek) {
        this.durationInWeek = durationInWeek;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public int getLessonDuration() {
        return lessonDuration;
    }

    public void setLessonDuration(int lessonDuration) {
        this.lessonDuration = lessonDuration;
    }

    public int getLessonCoutPerWeek() {
        return lessonCoutPerWeek;
    }

    public void setLessonCoutPerWeek(int lessonCoutPerWeek) {
        this.lessonCoutPerWeek = lessonCoutPerWeek;
    }
}
