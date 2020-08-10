package sample;
import Object.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
  @FXML
  AnchorPane layout;

  @FXML
  MenuItem listToCheck1;

    @FXML
    MenuItem listToCheck2;

  @FXML
  private TableView table;

  @FXML
  private TableColumn<Employee,String> nameColumn;

  @FXML
  private TableColumn<Employee,Integer> ageColumn;

  @FXML
  private TableColumn<Employee,Integer> heightColumn;

  @FXML
  private TableColumn<Employee,Integer> weightColumn;

  @FXML
  private TableColumn<Employee,Integer> chestSizeColumn;

  @FXML
  private TableColumn<Employee,Integer> waistColumn;

  @FXML
  private TableColumn<Employee,Integer> buttocksColumn;

  @FXML
  private TableColumn<Employee,String> priceColumn;


  private ObservableList<Employee> employeeList;

  private ArrayList<Object> listCave =new ArrayList<Object>();

  private ArrayList<Object> listToSave = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        employeeList = FXCollections.observableArrayList();
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        heightColumn.setCellValueFactory(new PropertyValueFactory<>("height"));
        weightColumn.setCellValueFactory(new PropertyValueFactory<>("weight"));
        chestSizeColumn.setCellValueFactory(new PropertyValueFactory<>("chestSize"));
        waistColumn.setCellValueFactory(new PropertyValueFactory<>("waist"));
        buttocksColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        tableSetItem();
    }


    public void tableSetItem(){
        table.setItems(employeeList);
    }


    public void addSinhVienLoai1() {
        ArrayList listToCheck=readObject("Data/file/DataAll");
        employeeList.clear();
        for (Object e:listToCheck
             ) {
            if(e.getClass().getName()=="Object.SinhVienLoai1"){
                employeeList.add((SinhVienLoai1) e);
            }
        }
        listToCheck.clear();
    }


    public void addSinhVienLoai2() {
        ArrayList listToCheck=readObject("Data/file/DataAll");
        employeeList.clear();
        for (Object e:listToCheck
        ) {
            if(e.getClass().getName()=="Object.SinhVienLoai2"){
                employeeList.add((SinhVienLoai2) e);
            }
        }
        listToCheck.clear();
    }


    public void addCap3() {
        ArrayList listToCheck=readObject("Data/file/DataAll");
        employeeList.clear();
        for (Object e:listToCheck
        ) {
            if(e.getClass().getName()=="Object.Cap3"){
                employeeList.add((Cap3) e);
            }
        }
        listToCheck.clear();
    }
    public void addAll() {
        ArrayList listToCheck=readObject("Data/file/DataAll");
        employeeList.clear();
        for (Object e:listToCheck
        ) { employeeList.add((Employee) e);
        }
        listToCheck.clear();
    }



    public void addPhoThong() {
        ArrayList listToCheck=readObject("Data/file/DataAll");
        employeeList.clear();
        for (Object e:listToCheck
        ) {
            if(e.getClass().getName()=="Object.PhoThong"){
                employeeList.add((PhoThong) e);
            }
        }
        listToCheck.clear();
    }


    public void upDate(){
        try {
            writeObject("Data/file/DataAll");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void writeObject(String URL) throws IOException {
        SinhVienLoai1 linh99 = new SinhVienLoai1("Linh",21,162,43,85,62,90,
                "Data/Img/tranducbo1.jpg,Data/Img/tranducbo2.jpg,Data/Img/tranducbo3.png","1000k/slot");
        SinhVienLoai1 ngan2k = new SinhVienLoai1("Ngân",20,162,43,85,62,90,
                "Data/Img/tranducbo1.jpg,Data/Img/tranducbo2.jpg,Data/Img/tranducbo3.png","1000k/slot");
        Employee thuy2k1 = new Employee("Thủy",19,162,43,85,62,90,
                "Data/Img/tranducbo1.jpg,Data/Img/tranducbo2.jpg,Data/Img/tranducbo3.png","1000k/slot");
        SinhVienLoai2 nhung98 = new SinhVienLoai2("Nhung",22,162,43,85,62,90,
                "Data/Img/tranducbo1.jpg,Data/Img/tranducbo2.jpg,Data/Img/tranducbo3.png","800k/slot");
        SinhVienLoai2 phuong97 = new SinhVienLoai2("Phương",22,162,43,85,62,90,
                "Data/Img/tranducbo1.jpg,Data/Img/tranducbo2.jpg,Data/Img/tranducbo3.png","800k/slot");
        Cap3 anh2k3 = new Cap3("Ánh",17,162,43,85,62,90,
                "Data/Img/tranducbo1.jpg,Data/Img/tranducbo2.jpg,Data/Img/tranducbo3.png","1500k/slot");
        Cap3 ngoc2k4 = new Cap3("Ngọc",16,162,43,85,62,90,
                "Data/Img/tranducbo1.jpg,Data/Img/tranducbo2.jpg,Data/Img/tranducbo3.png","1500k/slot");
        PhoThong trinh96 = new PhoThong("Trinh",24,154,44,75,62,90,
                "Data/Img/tranducbo1.jpg,Data/Img/tranducbo2.jpg,Data/Img/tranducbo3.png","500k/slot");
        PhoThong thuy94 = new PhoThong("Thùy",26,162,43,85,62,90,
                "Data/Img/tranducbo1.jpg,Data/Img/tranducbo2.jpg,Data/Img/tranducbo3.png","500k/slot");
        FileOutputStream fos = new FileOutputStream(URL);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(linh99);
        oos.writeObject(ngan2k);
        oos.writeObject(thuy2k1);
        oos.writeObject(nhung98);
        oos.writeObject(anh2k3);
        oos.writeObject(ngoc2k4);
        oos.writeObject(trinh96);
        oos.writeObject(thuy94);
        oos.writeObject(phuong97);
        fos.close();
        oos.close();
    }


    public ArrayList readObject(String URL) {
        try {
            FileInputStream fis = new FileInputStream(URL);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object object;
            while ((object=ois.readObject())!=null){
                listCave.add(object);
            }
            fis.close();
            ois.close();
        } catch (Exception ex) {
            System.out.println("Đã gán xong");
        }
        return listCave;
    }


    public void clearTableView(){

        try {
            FileOutputStream fos = new FileOutputStream("Data/file/DataAll");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Employee object = new Employee();
            oos.writeObject(object);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList listToCheck = readObject("Data/file/DataAll");
        for (Object e:listToCheck)
              {
            employeeList.clear();
            employeeList.add((Employee) e);
        }listToCheck.clear();
    }
    
    public void getCave(){
        String[] link = new String[10];

        for (int i=0;i<employeeList.size();i++){
            link[i]= employeeList.get(i).getImg();
        }
    }

    public void writeObjectToGetLink(Employee object){
        try {
            FileOutputStream fos = new FileOutputStream("Data/file/FileObject");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showInfo(){
        try{
            Employee employee = (Employee) table.getSelectionModel().getSelectedItem();
            writeObjectToGetLink(employee);

        }catch (Exception e){
            System.out.println("Chưa chọn đối tượng");
        }
        try {
            Stage primaryStage =new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("showinfor.fxml"));
            primaryStage.setTitle("Show infor đây anh ei");
            primaryStage.setScene(new Scene(root));
            primaryStage.setX(810);
            primaryStage.setY(200);
            primaryStage.show();

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

}
