package com.example.openjfx_experiment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class PersonApplication extends Application {
    final static Logger logger = null;

    @Override
    public void start(Stage stage) throws IOException {
        Logger logger = LogManager.getLogger(PersonApplication.class);
        logger.info("HelloApplication started");

        FXMLLoader fxmlLoader = new FXMLLoader(PersonApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
