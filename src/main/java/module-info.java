module com.example.openjfx_experiment {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;
    requires java.persistence;

    opens com.example.openjfx_experiment to javafx.fxml;
    exports com.example.openjfx_experiment;
}