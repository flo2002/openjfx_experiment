package com.example.openjfx_experiment;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PersonController {
    @FXML
    private Label firstnameLabel;
    @FXML
    private Label lastnameLabel;
    @FXML
    private TextField firstnameField;
    @FXML
    private TextField lastnameField;
    @FXML
    private Button addPersonBtn;

    @FXML
    public void initialize() {
        addPersonBtn.setOnAction( e -> {
            String firstname = firstnameField.getText();
            String lastname = lastnameField.getText();
            firstnameLabel.setText(firstname);
            lastnameLabel.setText(lastname);
        });
        addPersonBtn.fire();
    }

    @FXML
    protected void addPerson() {
        //add.setText("test");
    }


}