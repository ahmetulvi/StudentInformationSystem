public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int perf;
    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;

    }

    void addTeacher(Teacher teacher){
        this.teacher=teacher;
        if (teacher.branch.equals(prefix))
            this.teacher=teacher;
        else System.out.println("Academician cannot teach this course");

    }
    void printTeacher(){
        this.teacher.print();
    }
}
