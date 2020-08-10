package Object;

public class Cap3 extends Employee {

    public  String price = "1500k/slot";

    public Cap3(String name, int age, int height, int weight, int chestSize, int waist, int buttocks, String img,String price) {
        super(name, age, height, weight, chestSize, waist, buttocks, img,price);
    }

    public Cap3(){
    }

    public Cap3(String name, int age, int height, int weight, int chestSize, int waist, int buttocks, String img) {
        super(name, age, height, weight, chestSize, waist, buttocks, img);
    }


    public Cap3(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return  "Gái cấp 3: "+
                " Tên: '" + super.getName() + '\'' +
                ", Tuổi: " + super.getAge() +
                ", Chiều cao: " + super.getHeight() +
                ", Cân nặng: " + super.getWeight() +
                ", Ngực: " + super.getChestSize() +
                ", Eo: " + super.getWaist() +
                ", Mông: " + getButtocks() ;
    }

}
