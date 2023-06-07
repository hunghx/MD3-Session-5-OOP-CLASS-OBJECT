package ra;

import java.util.Calendar;
import java.util.Date;

public class Student {
    // property , method , các constructor để khởi tạo đối tượng từ lớp
    // khai báo cá trường, thuộc tính , property
    private int studentId ;
    private String studentName;
    private int age;
//     constructor
    public Student(){

    }

    public Student(int studentId, String studentName, int age){
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }

    // các method

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                '}';
    }
    // phương thức tính năm sinh của đối tượng , bắt buộc phải khởi tạo đối tượng
    // từ khóa static - phương thức thuộc về lớp , gọi trực tiếp từ Lớp
    public  int getBornIn(){
        Date date = new Date();
        int yearCurrent =  date.getYear();
        return yearCurrent - this.age;
    }
}
