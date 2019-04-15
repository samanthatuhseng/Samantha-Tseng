package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Controller {

    public TextField screen;
    String display = "";
    ArrayList<String> operations = new ArrayList<>();
    ArrayList<Double> num = new ArrayList<>();
    double answer= 0;
    int pos = 0;


    @FXML
    void changeinteger(ActionEvent event) {

    }

    @FXML
    void clear(ActionEvent event) {
    clearout();
    screen.setText("0");
    }

    void clearout(){
        pos = 0;
        display = "";
        operations.clear();
        num.clear();
    }

    @FXML
    void decimal(ActionEvent event) {
        display+=".";
        screen.setText(display);;

    }

    @FXML
    void divide(ActionEvent event) {
        operations.add("divide");
        num.add(Double.parseDouble(display));
        display = "";
    }

    @FXML
    void eight(ActionEvent event){
        if (display.length() < 10) {
            display += "8";
            screen.setText(display);
        }
    }

    @FXML
    void equals(ActionEvent event) {
        num.add(Double.parseDouble(display));
        if(num.size()<2){
            return;
        }
        else{
            answer = num.get(0);
            for(int i = 1; i<num.size(); i++){
                if(operations.get(pos).equals("plus")){
                    answer+=num.get(i);
                    pos++;
                }
                else if(operations.get(pos).equals("minus")){
                    answer-=num.get(i);
                    pos++;
                }
                else if(operations.get(pos).equals("multiply")){
                    answer*=num.get(i);
                    pos++;
                }
                else if(operations.get(pos).equals("divide")){
                    answer/=num.get(i);
                    pos++;

                }
            }

            screen.setText(Double.toString(answer));
            clearout();
        }

    }

    @FXML
    void five(ActionEvent event) {
        if (display.length() < 10) {
            display += "5";
            screen.setText(display);
        }
    }

    @FXML
    void four(ActionEvent event) {
        if (display.length() < 10) {
            display += "4";
            screen.setText(display);

        }
    }

    @FXML
    void multiply(ActionEvent event) {
        operations.add("multiply");
        num.add(Double.parseDouble(display));
        display = "";
    }

    @FXML
    void nine(ActionEvent event) {
        if (display.length() < 10) {
            display += "9";
            screen.setText(display);
        }
    }

    @FXML
    void one(ActionEvent event) {
        if (display.length() < 10) {
            display += "1";
            screen.setText(display);
        }
    }

    @FXML
    void percent(ActionEvent event) {

    }

    @FXML
    void plus(ActionEvent event) {
        operations.add("plus");
        num.add(Double.parseDouble(display));
        display = "";


    }

    @FXML
    void seven(ActionEvent event) {
        if (display.length() < 10) {
            display += "7";
            screen.setText(display);
        }
    }

    @FXML
    void six(ActionEvent event) {
        if (display.length() < 10) {
            display += "6";
            screen.setText(display);
        }
    }

    @FXML
    void subtract(ActionEvent event) {
        operations.add("minus");
        num.add(Double.parseDouble(display));
        display = "";
    }

    @FXML
    void three(ActionEvent event) {
        if (display.length() < 10) {
            display += "3";
            screen.setText(display);
        }
    }

    @FXML
    void two(ActionEvent event) {
        if (display.length() < 10) {
            display += "2";
            screen.setText(display);
        }
    }

    @FXML
    void zero(ActionEvent event) {
        if (display.length() < 10) {
            display += "0";
            screen.setText(display);
        }
    }

}
