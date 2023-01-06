package sectiona.week4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage stage){

        Label leah = new Label("Hi, I am Leah the Label.");
        leah.setAlignment(Pos.CENTER);
        leah.setFont(Font.font("comic sans ms", FontWeight.BOLD, FontPosture.REGULAR, 20));

        Button button = new Button("Click me!");

//        ButtonHandlerTwo handler = new ButtonHandlerTwo();
//        button.setOnAction(new EventHandler<ActionEvent>(){
//            public void handle(ActionEvent actionEvent) {
//                Button button = (Button)actionEvent.getSource();
//
//                if(button.getFont().getFamily().toLowerCase().equals("comic sans ms")){
//                    button.setFont(new Font("papyrus",30));
//                }else{
//                    button.setFont(new Font("comic sans ms",30));
//                }
//            }
//        });

        button.setOnAction(actionEvent -> {
            Button btn = (Button)actionEvent.getSource();
                if(btn.getFont().getFamily().toLowerCase().equals("comic sans ms")){
                    btn.setFont(new Font("papyrus",30));
                }else{
                    btn.setFont(new Font("comic sans ms",30));
                }
        });


        VBox box = new VBox();
        box.getChildren().addAll(leah, button);
        box.setAlignment(Pos.CENTER);

        Scene scene = new Scene(box);

        stage.setScene(scene);

        stage.show();

    }

    private class ButtonHandlerTwo implements EventHandler<ActionEvent>{
        public void handle(ActionEvent actionEvent) {
            Button button = (Button)actionEvent.getSource();

            if(button.getFont().getFamily().toLowerCase().equals("comic sans ms")){
                button.setFont(new Font("papyrus",30));
            }else{
                button.setFont(new Font("comic sans ms",30));
            }
        }
    }

}