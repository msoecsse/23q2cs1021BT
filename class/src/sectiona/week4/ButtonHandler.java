package sectiona.week4;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class ButtonHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        Button button = (Button)actionEvent.getSource();

        if(button.getFont().getFamily().toLowerCase().equals("comic sans ms")){
            button.setFont(new Font("papyrus",30));
        }else{
            button.setFont(new Font("comic sans ms",30));
        }
    }
}
