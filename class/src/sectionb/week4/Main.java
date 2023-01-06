package sectionb.week4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage stage){

        Label leah = new Label("Hi I am Leah the Label.");
        leah.setAlignment(Pos.CENTER);

        Button button = new Button("Click me!");

        EventHandler<ActionEvent> btn = new ButtonListener2();
        button.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent actionEvent) {
                Button btn = (Button)actionEvent.getSource();

                if(btn.getFont().getFamily().toLowerCase().equals("comic sans ms")){
                    btn.setFont(new Font("papyrus", 30));
                }else{
                    btn.setFont(new Font("comic sans ms", 30));
                }

            }
        });

        VBox box = new VBox();
        box.getChildren().addAll(leah, button);
        box.setAlignment(Pos.CENTER);

        Scene scene = new Scene(box);

        stage.setScene(scene);

        stage.show();

    }

    private class ButtonListener2 implements EventHandler<ActionEvent>{
        public void handle(ActionEvent actionEvent) {
            Button btn = (Button)actionEvent.getSource();

            if(btn.getFont().getFamily().toLowerCase().equals("comic sans ms")){
                btn.setFont(new Font("papyrus", 30));
            }else{
                btn.setFont(new Font("comic sans ms", 30));
            }

        }
    }

}