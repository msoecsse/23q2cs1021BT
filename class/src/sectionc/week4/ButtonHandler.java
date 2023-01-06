package sectionc.week4;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ButtonHandler implements EventHandler {
    @Override
    public void handle(Event actionEvent) {
        Button button = (Button)actionEvent.getSource();

        button.setRotate(button.getRotate() + 30);

    }
}
