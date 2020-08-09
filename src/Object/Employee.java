package Object;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable {

    private String name;

    private int age,height,weight,chestSize,waist,buttocks;

    private String Img;

    public Employee(String name, int age, int height, int weight, int chestSize, int waist, int buttocks, String img) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.chestSize = chestSize;
        this.waist = waist;
        this.buttocks = buttocks;
        Img = img;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(){

    }

    public String getName() {
        return name;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getChestSize() {
        return chestSize;
    }

    public void setChestSize(int chestSize) {
        this.chestSize = chestSize;
    }

    public int getWaist() {
        return waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getButtocks() {
        return buttocks;
    }

    public void setButtocks(int buttocks) {
        this.buttocks = buttocks;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

    @Override
    public String toString() {
        return "Tên: '" + name + '\'' +
                ", Tuổi: " + age +
                ", Chiều cao: " + height +
                ", Cân nặng: " + weight +
                ", Ngực: " + chestSize +
                ", Eo: " + waist +
                ", Mông: " + buttocks ;
    }
}
