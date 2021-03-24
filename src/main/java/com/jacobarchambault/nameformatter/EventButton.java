package com.jacobarchambault.nameformatter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
public class EventButton extends Button{

	EventButton(String text, EventHandler<ActionEvent> value){
		super(text);
		setOnAction(value);
	}
}
