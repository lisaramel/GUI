package sample.BMIGui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-26
 * Time: 10:26
 * Project: OOPJ-JavaFx
 * Copywrite: MIT
 */
public class BMIkalkylator extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample.fxml"));
        stage.setTitle("BMI-kalkylator");
        stage.setScene(new Scene(root));
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
