package com.example.openjfx_experiment;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PersonController {
    @FXML
    private Label name;

    @FXML
    private Button add;

    public void initialize() {
        name.setText("test1");
    }

    @FXML
    protected void onAddButtonCLick() {
        add.setText("test");
    }


}