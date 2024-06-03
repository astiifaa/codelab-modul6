module com.main.codelabm62 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.codelabm62 to javafx.fxml;
    exports com.main.codelabm62;
}