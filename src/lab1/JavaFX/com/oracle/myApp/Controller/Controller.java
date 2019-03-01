package com.oracle.myApp.Controller;

import com.oracle.myApp.Model.Model;
import com.oracle.myApp.View.View;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;


public class Controller {

    View view;
    Random r = new Random();
    Model model = new Model();

    private void handleGretter(Event ev) {
        try {
            int number = Integer.parseInt(view.getFieldText());

            view.setTextInGretterLabel(
                    String.valueOf(
                            model.getGrettetThan(number)
                    )
            );
        }
        catch (NumberFormatException e) {
            view.setTextInGretterLabel("format number error");
        }
    }

    private void handleLess(Event ev) {
        try {
            int number = Integer.parseInt(view.getFieldText());

            view.setTextInLessLabel(
                    String.valueOf(
                            model.getLessThan(number)
                    )
            );

        } catch (NumberFormatException e) {
            view.setTextInLessLabel("format number error");
        }
    }

    public Controller(Button gretter, Button less, View view) {

        this.view = view;
        gretter.setOnAction(this::handleGretter);
        less.setOnAction(this::handleLess);
    }
}
