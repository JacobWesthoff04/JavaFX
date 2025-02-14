module org.example.hellofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.hellofx to javafx.fxml;
    exports org.example.hellofx;
}