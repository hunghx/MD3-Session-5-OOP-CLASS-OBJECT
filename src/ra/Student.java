package ra;

// cú pháp khai báo lớp  :  class + [tên Lớp] (đặt viết hoa chữ cái đầu của các từ)
public class Student {
    // Khai báo thuộc tính : access_modifier data_type property_name;
    private String name;
    private int age;
    private String msv;


    // Hàm khởi tạo (constructor)

    public  Student(){

    }
    public Student(String name, String msv) {
        this.name= name;
        this.msv = msv;
    }
    public Student(String name, int age, String msv){
        this.name = name;
        this.age= age;
        this.msv =msv;

    }

    @Override
    public String toString() {
       return "Name : "+ this.name + " | Age : "+ this.age +" | MSV : "+ this.msv;
    }
    // phương thức getter , setter

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
}
