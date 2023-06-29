public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes,Course c1,Course c2, Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;

    }
    void addBulkExamNote(int note1,int note2,int note3){
        if (note1>=0 && note1<=100)
            this.c1.note=note1;
        else System.out.println("Invalid Note");

        if (note2>=0 && note2<=100)
            this.c2.note=note2;
        else System.out.println("Invalid Note");
        if (note3>=0 && note3<=100)
            this.c3.note=note3;
        else System.out.println("Invalid Note");
    }
    void addBulkPerformanceNote(int perf1,int perf2,int perf3){
        this.c1.perf=perf1;
        this.c2.perf=perf2;
        this.c3.perf=perf3;
    }

     void isPass(){
        this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3.0;
        if (this.avarage>55){
            System.out.println("You passed the class");
        }else System.out.println("You failed.");

     }
     void calcAvarage(){
        double result=((this.c1.note+this.c2.note+this.c3.note)/3.0)*0.8+ ((this.c1.perf+this.c2.perf+this.c3.perf)/3.0)*0.2;
         System.out.println("Avarage Note => "+result);

     }
     void printNote(){
         System.out.println(this.c1.name+" Result => "+this.c1.note);
         System.out.println(this.c2.name+ "Result => "+this.c2.note);
         System.out.println(this.c3.name+ "Result => "+this.c3.note);
         System.out.println(this.c1.name+ " Performance Note => "+this.c1.perf);
         System.out.println(this.c2.name+ " Performance Note => "+this.c2.perf);
         System.out.println(this.c3.name+ " Performance Note => "+this.c3.perf);

     }
}
