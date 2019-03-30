package Application.FXML;

import Application.Account;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainGUI {
    // check for login
    @FXML
    private Label accountLabel;


    Account account = new Account(null, 0);
    String accountName;
    int balance;

    @FXML
    private void initialize() {
        accountLabel.setText("I'm a Label.");
    }

    @FXML
    private void add_expense (){
        accountLabel.setText("I'm a Label.");
    }



}



