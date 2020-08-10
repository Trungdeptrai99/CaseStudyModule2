package sample;
import Object.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

import java.io.*;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class ControllerShowInfor implements Initializable {


    @FXML
    FlowPane layout;



    public String [] arrayLink;

    Object objectToCheck;

    public String[] readObject(){
        try {
            FileInputStream fis = new FileInputStream("Data/file/FileObject");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object object;
            while ((object=ois.readObject())!=null){
                arrayLink =((Employee) object).getImg().split(",");
                objectToCheck= object;
            }
            fis.close();
            ois.close();
        } catch (Exception ex) {
            System.out.println("Đã gán xong");
        }return arrayLink;
    }

    public void writeToCheckBooking(){

    }

    public void booking(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Booking");
        alert.setHeaderText("Thông báo đặt lịch");
        alert.setContentText("Bạn muốn đặt lịch?");
        ButtonType buttonType1 = new ButtonType("Yes", ButtonBar.ButtonData.YES);
        ButtonType buttonType2 = new ButtonType("No", ButtonBar.ButtonData.NO);
        ButtonType buttonType3 = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(buttonType1,buttonType2,buttonType3);
        Optional<ButtonType> result= alert.showAndWait();
        if(result.get()==buttonType1){
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream("Data/file/datacheck");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(objectToCheck);
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
            alert1.setTitle("Đặt lịch thành công");
            alert1.setContentText("Bạn đã đặt lịch thành công, ");
            alert1.show();
        }if(result.get()==buttonType2){
            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
            alert1.setTitle("Hủy chọn");
            alert1.setContentText("Cảm ơn đã quan tâm, hãy xem thêm hàng");
            alert1.show();
        }if(result.get()==buttonType3){
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            for (String e:readObject()
            ) {
                javafx.scene.image.Image image = new Image(new FileInputStream(e));
                ImageView imageView = new ImageView(image);
                imageView.setFitHeight(600);
                imageView.setFitWidth(356);
                imageView.setPreserveRatio(true);
                layout.getChildren().addAll(imageView);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
