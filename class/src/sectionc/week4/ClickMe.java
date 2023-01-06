package sectionc.week4;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ClickMe extends Application {
    @Override
    public void start(Stage stage){

        Button button = new Button("Click me!");
        button.setAlignment(Pos.CENTER);

        //ButtonBoi handler = new ButtonBoi();
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                Button button = (Button)actionEvent.getSource();
//
//                button.setRotate(button.getRotate() + 30);
//            }
//        });
        //button.setOn

        button.setOnAction(this::buttonResponse);

        VBox box = new VBox();
        box.getChildren().addAll(button);
        box.setAlignment(Pos.CENTER);

        Scene scene = new Scene(box,300,300);

        stage.setScene(scene);

        stage.show();

    }

    private void buttonResponse(Event e){
        Button btn = (Button)e.getSource();
        btn.setRotate(btn.getRotate() + 30);
    }

    private class ButtonBoi implements EventHandler{




        @Override

        public void handle(Event actionEvent) {


        }

    }
}
