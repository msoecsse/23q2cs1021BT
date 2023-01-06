package sectionc.week4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage stage){

        Label leah = new Label("Hi, I am Leah the Label.");
        leah.setAlignment(Pos.CENTER);
        leah.setFont(new Font("comic sans MS",  30));

        Button button = new Button("Click me!");
        button.setAlignment(Pos.CENTER);

        VBox box = new VBox();
        box.getChildren().addAll(leah, button);
        box.setAlignment(Pos.CENTER);

        Scene scene = new Scene(box,400,400);

        stage.setScene(scene);

        stage.show();

    }



}