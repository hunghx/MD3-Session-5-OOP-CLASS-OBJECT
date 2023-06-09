package ra;

public class Main {
    public static void main(String[] args) {
        //  Khởi tạo đối tượng : <class_name> <object_name> = new <class_name>();
        Student student = new Student("Hùng",23,"SV001"); // tạo 1 vùng nhớ
        System.out.println("student "+student);
        Student student1 = new Student("Hùng 1","SV002");
        System.out.println("student "+student1);
        Student student2 = new Student();
        System.out.println("student "+student2);
        // thay đổi thuộc tính name thông qua phương thức setter
        student.setName("Nam");

        // gọi phương thức
        System.out.println(student1.getMsv());

        ClassName class1 = new ClassName();
    }
}
