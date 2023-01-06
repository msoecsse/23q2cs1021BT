package sectionb.week4;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class ButtonListener implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        Button btn = (Button)actionEvent.getSource();

        if(btn.getFont().getFamily().toLowerCase().equals("comic sans ms")){
            btn.setFont(new Font("papyrus", 30));
        }else{
            btn.setFont(new Font("comic sans ms", 30));
        }

    }
}
