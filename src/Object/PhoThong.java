package Object;

public class PhoThong extends Employee{

    public  String price = "300k/slot";

    public PhoThong(String name, int age, int height, int weight, int chestSize, int waist, int buttocks, String img,String price) {
        super(name, age, height, weight, chestSize, waist, buttocks, img,price);
    }

    public PhoThong(){
    }

    public PhoThong(String name, int age, int height, int weight, int chestSize, int waist, int buttocks, String img) {
        super(name, age, height, weight, chestSize, waist, buttocks, img);
    }



    public PhoThong(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return  "Phổ thông: "+
                " Tên: '" + super.getName() + '\'' +
                ", Tuổi: " + super.getAge() +
                ", Chiều cao: " + super.getHeight() +
                ", Cân nặng: " + super.getWeight() +
                ", Ngực: " + super.getChestSize() +
                ", Eo: " + super.getWaist() +
                ", Mông: " + getButtocks() ;
    }
}
