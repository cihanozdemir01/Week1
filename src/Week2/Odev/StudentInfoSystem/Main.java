package Week2.Odev.StudentInfoSystem;

// A Program for Entering Student Courses and Grades, and Assigning Teachers to Courses
// In this program, three classes are defined: Student, Course, and Teacher. Each class serves a
// specific purpose in managing information related to students, courses, and teachers.
public class Main{
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","TRH", "111");
        Teacher t2 = new Teacher("Graham Bell","FZK","000");
        Teacher t3 = new Teacher("Külyutmaz","BIO","001");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course bio = new Course("Biyoloji","103","BIO");
        bio.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,bio);
        s1.addBulkExamNote(100,90,80);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "124","4",tarih,fizik,bio);
        s2.addBulkExamNote(90,50,20);
        s2.isPass();
    }

}
