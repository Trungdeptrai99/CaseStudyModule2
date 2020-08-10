package Object;

public class SinhVienLoai2 extends Employee{

    public String price = "800k/slot";

    public SinhVienLoai2(String name, int age, int height, int weight, int chestSize, int waist, int buttocks, String img,String price) {
        super(name, age, height, weight, chestSize, waist, buttocks, img,price);
    }

    public SinhVienLoai2(String name, int age, int height, int weight, int chestSize, int waist, int buttocks, String img) {
        super(name, age, height, weight, chestSize, waist, buttocks, img);
    }

    public SinhVienLoai2(){
    }



    public SinhVienLoai2(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return  "Sinh viên loại 2: "+
                " Tên: '" + super.getName() + '\'' +
                ", Tuổi: " + super.getAge() +
                ", Chiều cao: " + super.getHeight() +
                ", Cân nặng: " + super.getWeight() +
                ", Ngực: " + super.getChestSize() +
                ", Eo: " + super.getWaist() +
                ", Mông: " + getButtocks() ;
    }
}
