package sample;


import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {

        @FXML
        private TextField getName;

        @FXML
        private TextField getGender;

        @FXML
        private TextField getAge;

        @FXML
        private ListView<Friend> friendslist = new ListView<>();

        @FXML
        private Label showName;

        @FXML
        private Label showGender;

        @FXML
        private Label showAge;

        @FXML
        void createFriend(ActionEvent event) throws IOException {
            String name = getName.getText();
            String gender = getGender.getText();
            int age= Integer.parseInt(getAge.getText());
            Friend temp = new Friend(name, gender, age);
            friendslist.getItems().add(temp);
            getAge.clear();
            getName.clear();
            getGender.clear();
        }

        @FXML
        void deleteFriend(ActionEvent event) {
            Friend temp;
            temp = friendslist.getSelectionModel().getSelectedItem();
            getGender.clear();
            getName.clear();
            getAge.clear();
            friendslist.getItems().remove(temp);
            showGender.setText("");
            showAge.setText("");
            showName.setText("");
        }

        @FXML
        void showFriend(MouseEvent event) {
            Friend temp;
            temp = friendslist.getSelectionModel().getSelectedItem();
            showName.setText(temp.name);
            showAge.setText(Integer.toString(temp.getAge()));
            showGender.setText(temp.getGender());
        }

        public void saveFriend(ActionEvent actionEvent) throws IOException {
            ObservableList<Friend> myList = friendslist.getItems();
            for(Friend f: myList){
                f.writeToFile();
            }
            for(Friend f: myList){
                if(f.getGender().equals("male")){
                    f.writeToMaleFile();
                }
            }
            for(Friend f: myList) {
                if (f.getGender().equals("female")) {
                    f.writeToFemaleFile();
                }
            }
            friendslist.getItems().clear();

        }

        public void loadFriend(ActionEvent actionEvent) throws IOException {
            friendslist.getItems().clear();
            ArrayList<Friend> friends = CreateFriend.createFriend("friends.txt");
            for(Friend f: friends){
                friendslist.getItems().add(f);
            }

        }

    public void loadMale(ActionEvent actionEvent) throws IOException {
        friendslist.getItems().clear();
        ArrayList<Friend> friends = CreateFriend.createFriend("friends.txt");
        for(Friend f: friends){
            if(f.getGender().equals("male")){
                friendslist.getItems().add(f);
            }
        }

    }

    public void loadFemale(ActionEvent actionEvent) throws IOException {
        friendslist.getItems().clear();
        ArrayList<Friend> friends = CreateFriend.createFriend("friends.txt");
        for(Friend f: friends){
            if(f.getGender().equals("female")){
                friendslist.getItems().add(f);
            }
        }
    }
}





