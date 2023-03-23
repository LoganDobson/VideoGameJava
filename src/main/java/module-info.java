module com.example.videogamejava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.videogamejava to javafx.fxml;
    exports com.example.videogamejava;
}