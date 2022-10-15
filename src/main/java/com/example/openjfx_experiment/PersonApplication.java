package com.example.openjfx_experiment;

import com.example.openjfx_experiment.model.Person;
import com.example.openjfx_experiment.persistence.DatabaseFacade;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;

public class PersonApplication extends Application {
    final static Logger logger = null;

    @Override
    public void start(Stage stage) throws IOException {
        Logger logger = LogManager.getLogger(PersonApplication.class);
        logger.info("HelloApplication started");

        FXMLLoader fxmlLoader = new FXMLLoader(PersonApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        Person john = new Person();
        john.setFirstName("John");
        john.setLastName("Doe");

        DatabaseFacade dbf = new DatabaseFacade();
        //dbf.addPerson(john);

        launch();

        /*List<Person> persons = dbf.getAllPersons();
        logger.info("test");
        for (Person pers : persons) {
            System.out.println(pers.toString());
        }*/
    }
}
