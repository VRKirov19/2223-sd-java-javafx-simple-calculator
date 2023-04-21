module com.calculator.simlecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.calculator.simlecalculator to javafx.fxml;
    exports com.calculator.simlecalculator;
}