package model;

public class Main {
   public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new GoodStudent();
        students[1] = new NormalStudent();
        for (Student student : students) {
            if (student instanceof GoodStudent) {
                student.showMe();
            }
            if (student instanceof NormalStudent) {
                student.showMe();
            }
        }
    }


}
