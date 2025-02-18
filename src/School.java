public class School {
    String lesson;
    String student;
    public School(String lesson,String student){
        this.lesson=lesson;
        this.student=student;
    }

    @Override
    public String toString() {
        return "School{" +
                "lesson='" + lesson + '\'' +
                ", student='" + student + '\'' +
                '}';
    }
}
