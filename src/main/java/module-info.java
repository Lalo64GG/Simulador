module com.example.simulador_restaurante {
    requires javafx.controls;
    requires javafx.fxml;


    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires com.almasb.fxgl.core;

    opens com.example.simulador_restaurante to javafx.fxml;
    exports com.example.simulador_restaurante;
}