module ufc.integrador.projeto.projeto {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;

    opens ufc.integrador.projeto.projeto to javafx.fxml;
    exports ufc.integrador.projeto.projeto;
}