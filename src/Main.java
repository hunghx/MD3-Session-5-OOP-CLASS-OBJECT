import ra.Cars;
import ra.Persons;
import ra.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // OOP - CLass - Object -  Lập trình hướng đói tượng là xấy dựng chương trình chỉ tập trung vào đặc điểm hành vi của đối tượng
        // 1 đối tượng : Property(thuộc tính) và Method(hành vi)

        // sử dụng máy nhập để lắng nghe thông tin người dùng nhập vào
        Scanner sc = new Scanner(System.in);

        // qui tắc , cú pháp khơi tạo 1 đối tượng trong java
        // Tất cả các Lớp ở trong java đều kế thừa từ Lớp Object
        // [Tên lớp] [tên đối tượng] = new [constructor của lớp]
        Student student1 = new Student();
        System.out.println("Student 1 "+student1);

        Student student2 = new Student(10,"Hồ Xuân Hùng",23);
        System.out.println("Student 2 "+student2);
        System.out.println("Student 2 has id = "+student2.getStudentId());
        // nguyên thủy
        int a ; // khai báo
        a =2; // khởi tọa giá trị
        // đối tượng
        Student student3;
        student3 =new Student();
        System.out.println(student3);
        // gọi phương thức
        Student  student4 = new Student(12,"Nam",24);
        System.out.println("Năm sinh của "+student4.getStudentName()+" là "+student4.getBornIn());
        System.out.printf("Năm sinh của %s là %d \n",student4.getStudentName(),student4.getBornIn());
  // tạo màu và icon trong console
        System.out.println("\u001B[31m Red textfdfd");
        System.out.println("\u001B[32m Green text");
        System.out.println("\u001B[33m Yellow text");
        System.out.println("\u001B[34m Blue text ⚛️⚛️⚛️⚛️⚛️");
        System.out.println("\u001B[35m Purple text");
        System.out.println("\u001B[36m Cyan text 😢🤦‍♂️🤦‍♀️🤦‍♀️😜🤞✌️🤷‍♂️😁👍🙌😒😍😊😂🤣❤️⚛️♾️◀️🔼");
        System.out.println("\u001B[37m White text😊😂😂😂🤣🤣❤️");
    // Truy xuất thuọc tính của đối tượng
        Persons persons1= new Persons("Hùng",23);
        System.out.println("Tên của đối tượng students1 là "+ persons1.getName());


        // Test
        Cars mazda = new Cars("Mazda","Mazda 5","US") ;
        System.out.println("Tên xe "+ mazda.getName());
        // thay đổi thuộc tính :
        mazda.setName("Mazda 7");
        System.out.println("Tên xe "+ mazda.getName());
        mazda.makeSound();
    }
}