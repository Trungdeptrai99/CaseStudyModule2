package sample;
import Object.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
  @FXML
  AnchorPane layout;

  @FXML
  MenuItem hihi1;

    @FXML
    MenuItem hihi2;

  @FXML
  private TableView table;

  @FXML
  private TableColumn<Employee,String> nameColumn;

  @FXML
  private TableColumn<Employee,Integer> ageColumn;

  private ObservableList<Employee> employeeList;

  private ArrayList<Object> listCave =new ArrayList<Object>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        employeeList = FXCollections.observableArrayList();
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        tableSetItem();
    }


    public void tableSetItem(){
        table.setItems(employeeList);
    }


    public void addSinhVienLoai1() {
        ArrayList hihi=readObject("Data/file/DataAll");
        employeeList.clear();
        for (Object e:hihi
             ) {
            if(e.getClass().getName()=="Object.SinhVienLoai1"){
                employeeList.add((SinhVienLoai1) e);
            }
        }
        hihi.clear();
    }


    public void addSinhVienLoai2() {
        ArrayList hihi=readObject("Data/file/DataAll");
        employeeList.clear();
        for (Object e:hihi
        ) {
            if(e.getClass().getName()=="Object.SinhVienLoai2"){
                employeeList.add((SinhVienLoai2) e);
            }
        }
        hihi.clear();
    }


    public void addCap3() {
        ArrayList hihi=readObject("Data/file/DataAll");
        employeeList.clear();
        for (Object e:hihi
        ) {
            if(e.getClass().getName()=="Object.Cap3"){
                employeeList.add((Cap3) e);
            }
        }
        hihi.clear();
    }


    public void addPhoThong() {
        ArrayList hihi=readObject("Data/file/DataAll");
        employeeList.clear();
        for (Object e:hihi
        ) {
            if(e.getClass().getName()=="Object.PhoThong"){
                employeeList.add((PhoThong) e);
            }
        }
        hihi.clear();
    }


    public void printf(){
        try {
            writeObject("Data/file/DataAll");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void writeObject(String URL) throws IOException {
        SinhVienLoai1 linh99 = new SinhVienLoai1("Linh",21);
        SinhVienLoai1 ngan2k = new SinhVienLoai1("Ngân",20);
        Employee thuy2k1 = new Employee("Thủy",19);
        SinhVienLoai2 nhung98 = new SinhVienLoai2("Nhung",22);
        Cap3 anh2k3 = new Cap3("Ánh",17);
        PhoThong trinh96 = new PhoThong("Trinh",24);


        FileOutputStream fos = new FileOutputStream(URL);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(linh99);
        oos.writeObject(ngan2k);
        oos.writeObject(thuy2k1);
        oos.writeObject(nhung98);
        oos.writeObject(anh2k3);
        oos.writeObject(trinh96);
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
        ArrayList hihi = readObject("Data/file/DataAll");
        for (Object e:hihi)
              {
            employeeList.clear();
            employeeList.add((Employee) e);
        }hihi.clear();
    }
    
    public void getCave(){
        for (ObservableList:
             ) {
            
        }
    } 
    
    public void addImage(String URLIMG){
        try {
            javafx.scene.image.Image image = new Image(new FileInputStream(URLIMG));
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(600);
            imageView.setFitWidth(900);
            imageView.setPreserveRatio(true);
            layout.getChildren().addAll(imageView);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
