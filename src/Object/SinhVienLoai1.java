package Object;

public class SinhVienLoai1 extends Employee{

    public  String price = "1000k/slot";

    public SinhVienLoai1(String name, int age, int height, int weight, int chestSize, int waist, int buttocks, String img,String price) {
        super(name, age, height, weight, chestSize, waist, buttocks, img,price);
    }

    public SinhVienLoai1(String name, int age, int height, int weight, int chestSize, int waist, int buttocks, String img) {
        super(name, age, height, weight, chestSize, waist, buttocks, img);
    }


    public SinhVienLoai1(){
    }

    public SinhVienLoai1(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return  "Sinh viên loại 1: "+
                " Tên: '" + super.getName() + '\'' +
                ", Tuổi: " + super.getAge() +
                ", Chiều cao: " + super.getHeight() +
                ", Cân nặng: " + super.getWeight() +
                ", Ngực: " + super.getChestSize() +
                ", Eo: " + super.getWaist() +
                ", Mông: " + getButtocks() ;
    }
}
