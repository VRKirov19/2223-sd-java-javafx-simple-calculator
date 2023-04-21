package com.calculator.simlecalculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Calculator extends Application {

    TextField textField;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Calculator");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25,25,25,25));

        textField = new TextField();
        textField.setAlignment(Pos.BASELINE_RIGHT);
        textField.setPrefWidth(230);
        textField.setPrefHeight(100);
        textField.setEditable(false);
        textField.setStyle("-fx-font-size: 36px;");
        textField.setText("0");

        gridPane.add(textField, 0, 0, 4, 1);

        Button numberZero = new Button("0");
        numberZero.setStyle("-fx-background-color:#34ebde; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberOne= new Button("1");
        numberOne.setStyle("-fx-background-color:#34ebde; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberTwo = new Button("2");
        numberTwo.setStyle("-fx-background-color:#34ebde; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberThree= new Button("3");
        numberThree.setStyle("-fx-background-color:#34ebde; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberFour = new Button("4");
        numberFour.setStyle("-fx-background-color:#34ebde; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberFive = new Button("5");
        numberFive.setStyle("-fx-background-color:#34ebde; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberSix = new Button("6");
        numberSix.setStyle("-fx-background-color:#34ebde; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberSeven = new Button("7");
        numberSeven.setStyle("-fx-background-color:#34ebde; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberEight = new Button("8");
        numberEight.setStyle("-fx-background-color:#34ebde; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberNine = new Button("9");
        numberNine.setStyle("-fx-background-color:#34ebde; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button buttonOperationAddition = new Button("+");
        buttonOperationAddition.setStyle("-fx-background-color:#0f1875; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button buttonOperationSubtraction = new Button("-");
        buttonOperationSubtraction.setStyle("-fx-background-color:#0f1875; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button buttonOperationMultiplication = new Button("*");
        buttonOperationMultiplication.setStyle("-fx-background-color:#0f1875; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button buttonOperationDivision = new Button("/");
        buttonOperationDivision.setStyle("-fx-background-color:#0f1875; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button buttonOperationEquals = new Button("=");
        buttonOperationEquals.setStyle("-fx-background-color:#0f1875; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button buttonOperationClear = new Button("C");
        buttonOperationClear.setStyle("-fx-background-color:#0f1875; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

//Row 2
        gridPane.add(buttonOperationClear, 2, 1);
        gridPane.add(buttonOperationDivision, 3, 1);

//Row 3
        gridPane.add(numberSeven, 0, 2);
        gridPane.add(numberEight, 1, 2);
        gridPane.add(numberNine, 2, 2);
        gridPane.add(buttonOperationAddition, 3, 2);

//Row 4
        gridPane.add(numberFour, 0, 3);
        gridPane.add(numberFive, 1, 3);
        gridPane.add(numberSix, 2, 3);
        gridPane.add(buttonOperationMultiplication, 3, 3);

//Row 5
        gridPane.add(numberOne, 0, 4);
        gridPane.add(numberTwo, 1, 4);
        gridPane.add(numberThree, 2, 4);
        gridPane.add(buttonOperationSubtraction, 3, 4);

//Row 6
        gridPane.add(numberZero, 1, 5);
        gridPane.add(buttonOperationEquals, 3, 5);

// Events
        numberZero.setOnAction(event -> handleButtonPressNumber("0"));
        numberOne.setOnAction(event -> handleButtonPressNumber("1"));
        numberTwo.setOnAction(event -> handleButtonPressNumber("2"));
        numberThree.setOnAction(event -> handleButtonPressNumber("3"));
        numberFour.setOnAction(event -> handleButtonPressNumber("4"));
        numberFive.setOnAction(event -> handleButtonPressNumber("5"));
        numberSix.setOnAction(event -> handleButtonPressNumber("6"));
        numberSeven.setOnAction(event -> handleButtonPressNumber("7"));
        numberEight.setOnAction(event -> handleButtonPressNumber("8"));
        numberNine.setOnAction(event -> handleButtonPressNumber("9"));

        buttonOperationClear.setOnAction(event -> handleButtonPressClear());

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);

        stage.show();
    }

    private void handleButtonPressNumber(String buttonValue) {
        textField.setText(textField.getText() + buttonValue);
    }

    private void handleButtonPressClear() {
        textField.setText("0");
    }

    public static void main(String[] args) {
        launch();
    }
}