package com.oracle.myApp.View;

import com.oracle.myApp.Controller.Controller;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.Random;


public class View extends GridPane{

    private Label labelGretter = new Label();
    private Label labelLess = new Label();

    private Button gretter = new Button("Сгенерировать больше");
    private Button less = new Button("Сгенерировать меньше");

    private TextField field = new TextField();

    private Random r = new Random();

    public View() {
        super();

        this.add(field, 0, 0);
        this.add(gretter, 0, 1);
        this.add(less, 0, 2);
        this.add(labelGretter, 1, 1);
        this.add(labelLess, 1, 2);

        new Controller(gretter, less, this);

    }

    public String getFieldText() {
        return this.field.getText();
    }

    public void setTextInGretterLabel(String text) {
        labelGretter.setText(text);
    }
    public void setTextInLessLabel(String text) {
        labelLess.setText(text);
    }
}
