
public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca","TRH101","905");
        Teacher t2=new Teacher("Graham Bell","PHY101","905");
        Teacher t3=new Teacher("James Donkey","BIO101","905");

        Course history=new Course("History","101","TRH101");
        history.addTeacher(t1);

        Course physic=new Course("Physic","102","PHY101");
        physic.addTeacher(t2);

        Course biology=new Course("Biology","103","BIO101");
        biology.addTeacher(t3);

        Student s1=new Student("Ulvi Korkmaz","65","11-C",physic,biology,history);
        s1.addBulkExamNote(40,90,100);
        s1.addBulkPerformanceNote(50,50,50);
        s1.printNote();
        s1.calcAvarage();
        s1.isPass();

    }
}