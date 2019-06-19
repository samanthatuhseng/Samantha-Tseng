package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//public class Main extends Application {
public class Main{

    public static void createProducts() throws IOException {
        FileReader fr = new FileReader("products.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        String name;
        Double cost;
        int amount;
        int count = 0;
        while ((line = br.readLine()) != null) {

        }
    }

    public static void main(String[] args) throws IOException {


    }
}

   /* @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}*/
