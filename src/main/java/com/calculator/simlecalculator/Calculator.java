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

    double valueOne;
    double valueTwo;

    int operation;
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
        numberZero.setStyle("-fx-background-color:#8f6c03; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberOne= new Button("1");
        numberOne.setStyle("-fx-background-color:#8f6c03; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberTwo = new Button("2");
        numberTwo.setStyle("-fx-background-color:#8f6c03; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberThree= new Button("3");
        numberThree.setStyle("-fx-background-color:#8f6c03; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberFour = new Button("4");
        numberFour.setStyle("-fx-background-color:#8f6c03; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberFive = new Button("5");
        numberFive.setStyle("-fx-background-color:#8f6c03; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberSix = new Button("6");
        numberSix.setStyle("-fx-background-color:#8f6c03; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberSeven = new Button("7");
        numberSeven.setStyle("-fx-background-color:#8f6c03; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberEight = new Button("8");
        numberEight.setStyle("-fx-background-color:#8f6c03; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button numberNine = new Button("9");
        numberNine.setStyle("-fx-background-color:#8f6c03; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

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

        Button buttonOperationBackspace = new Button("⌫");
        buttonOperationBackspace.setStyle("-fx-background-color:#0f1875; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button buttonOperationChangeSign = new Button("±");
        buttonOperationChangeSign.setStyle("-fx-background-color:#0f1875; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button buttonOperationPoint = new Button(".");
        buttonOperationPoint.setStyle("-fx-background-color:#0f1875; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");

        Button buttonToFulfill = new Button("");
        buttonToFulfill.setStyle("-fx-background-color:#0f1875; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px; -fx-background-radius: 10");
//Row 2
        gridPane.add(buttonToFulfill,0 ,1);
        gridPane.add(buttonOperationClear, 2, 1);
        gridPane.add(buttonOperationDivision, 3, 1);
        gridPane.add(buttonOperationBackspace,1 , 1);

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
        gridPane.add(buttonOperationChangeSign, 0, 5);
        gridPane.add(numberZero, 1, 5);
        gridPane.add(buttonOperationPoint, 2 ,5);
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

        buttonOperationAddition.setOnAction(event -> handleButtonPressOperationAddition());

        buttonOperationSubtraction.setOnAction(event -> handleButtonPressOperationSubtraction());

        buttonOperationMultiplication.setOnAction(event -> handleButtonPressOperationMultiplication());

        buttonOperationDivision.setOnAction(event -> handleButtonPressOperationDivision());

        buttonOperationClear.setOnAction(event -> handleButtonPressClear());

        buttonOperationEquals.setOnAction(actionEvent -> handleButtonPressEquals());

        buttonOperationPoint.setOnAction(event -> handleButtonPressPoint());

        buttonOperationBackspace.setOnAction(event -> handleButtonPressBackspace());

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);

        stage.show();
    }

    private void handleButtonPressBackspace(){
        String screen = textField.getText();
        char[] screenArray = screen.toCharArray();
        String result = "";

        for(int i = 0; i < screenArray.length - 1; i++){
            result += String.valueOf(screenArray[i]);
        }

        textField.setText(result);
    }

    private void handleButtonPressPoint(){
        String screen = textField.getText();

        if(!screen.contains(".")){
            textField.setText(textField.getText()+ ".");
        }
    }

    private void handleButtonPressEquals(){
        double result;
        switch (operation){
            case 1:{
                valueTwo = Double.parseDouble(textField.getText());
                result = valueOne + valueTwo;
                textField.setText(String.valueOf(result));
                break;
            }
            case 2:{
                valueTwo = Double.parseDouble(textField.getText());
                result = valueOne - valueTwo;
                textField.setText(String.valueOf(result));
                break;
            }
            case 3:{
                valueTwo = Double.parseDouble(textField.getText());
                result = valueOne * valueTwo;
                textField.setText(String.valueOf(result));
                break;
            }
            case 4:{
                valueTwo = Double.parseDouble(textField.getText());
                result = valueOne / valueTwo;
                textField.setText(String.valueOf(result));
                break;
            }
            default:{
                break;
            }
        }
    }

    private void handleButtonPressNumber(String buttonValue) {
        if (Objects.equals(textField.getText(),"0") && !Objects.equals(buttonValue, "0")){
            textField.setText(buttonValue);
        } else if (!Objects.equals(textField.getText(),"0")){
            textField.setText(textField.getText() + buttonValue);
        }
    }

    private void handleButtonPressOperationAddition() {
        if(valueOne == 0) {
            valueOne = Double.parseDouble(textField.getText());
            operation = 1;
            textField.setText("0");
        }
    }

    private void handleButtonPressOperationSubtraction() {
        if(valueOne == 0) {
            valueOne = Double.parseDouble(textField.getText());
            operation = 2;
            textField.setText("0");
        }
    }

    private void handleButtonPressOperationMultiplication() {
        if(valueOne == 0) {
            valueOne = Double.parseDouble(textField.getText());
            operation = 3;
            textField.setText("0");
        }
    }

    private void handleButtonPressOperationDivision() {
        if(valueOne == 0) {
            valueOne = Double.parseDouble(textField.getText());
            operation = 4;
            textField.setText("0");
        }
    }

    private void handleButtonPressClear() {
        textField.setText("0");
        valueOne = 0;
        valueTwo = 0;
        operation = 0;
    }

    public static void main(String[] args) {
        launch();
    }
}