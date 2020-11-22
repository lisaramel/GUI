package sample.BMIGui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    public TextField nameField;

    @FXML
    public TextField weightField;

    @FXML
    public TextField lenghtField;

    @FXML
    public Label label;

    @FXML
    private Pane pane;

    @FXML
    private Text bmiText;

    @FXML
    private Text calculatorText;

    @FXML
    private Button button;

    @FXML
    public double calculateBMI(int weight, double lenght){
        double lenghtCm = lenght/100;
        double bmi = weight/(lenghtCm*lenghtCm);
        return bmi;
    }

    @FXML
    public void calculate(ActionEvent ae) {
        if (ae.getSource() == button) {
            String nameString = nameField.getText().trim();
            String weightString = weightField.getText().trim();
            String lengthString = lenghtField.getText().trim();

            int weightInt = Integer.parseInt(weightString);
            double lenghtDouble = Double.parseDouble(lengthString);

            label.setText("Hej " + nameString + " ditt BMI är: " +
                    (int) calculateBMI(weightInt, lenghtDouble));
        }
    }

   /* @FXML
    void clearText(MouseEvent event) {

        label.setText("");

    }

    */


}
