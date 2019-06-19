package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;


public class Controller {
    public TextField getMin;
    public TextField getHour;
    @FXML
    private AnchorPane getDate;

    @FXML
    private DatePicker date;

    @FXML
    private TextField getTime;

    @FXML
    private ListView<Patient> appointmentList = new ListView<>();

    @FXML
    private TextField getPatientName;

    @FXML
    private Label showPatient;

    @FXML
    private Label showTime;

    @FXML
    private Label showDate;



    @FXML
    public void cancel(javafx.event.ActionEvent actionEvent) {
        Patient temp;
        temp = appointmentList.getSelectionModel().getSelectedItem();
        appointmentList.getItems().remove(temp);
        showDate.setText("");
        showTime.setText("");
        showPatient.setText("");
    }

    @FXML
    public void schedule(ActionEvent actionEvent) {
        String name = getPatientName.getText();
        //int time = Integer.parseInt(getTime.getText());
        LocalDate theDate = date.getValue();
        int hour = Integer.parseInt(getHour.getText());
        int min = Integer.parseInt(getMin.getText());
        Patient temp = new Patient (name,hour, min, theDate);
        appointmentList.getItems().add(temp);
        getPatientName.clear();
        getHour.clear();
        getMin.clear();
        date.setValue(null);


    }

    @FXML
    public void showPatient(MouseEvent mouseEvent) {
        Patient temp;
        temp = appointmentList.getSelectionModel().getSelectedItem();
        showPatient.setText(temp.getName());
        showTime.setText(temp.getTime());
        showDate.setText(temp.getDate().toString());
    }




}


