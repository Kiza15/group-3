module org.example.group3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.group3 to javafx.fxml;
    exports org.example.group3;
}