package com.example.clockpane;

import com.example.clockpane.ClockClass.ClockPane;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class HelloApplication extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage stage) {
        // Create a clock and label
        ClockPane clock = new ClockPane();
        String timeString = clock.getHour() + ":" + clock.getMinute();
        + ":" + clock.getSecond();
        Label lblCurrentTime = new Label(timeString);

        // Place clock and label in border pane
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 250);
        stage.setTitle("DisplayClock"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show();

    }

}