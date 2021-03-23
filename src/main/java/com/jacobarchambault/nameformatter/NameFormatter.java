package com.jacobarchambault.nameformatter;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class NameFormatter extends Application {
	TextField fnTextField = new TextField();
	HBox fnhbox = new HBox(
			10,
			new Label(
					"First name:"),
			fnTextField);
	TextField mnTextField = new TextField();
	HBox mnhbox = new HBox(
			10,
			new Label(
					"Middle name:"),
			mnTextField);
	TextField lnTextField = new TextField();
	HBox lnhbox = new HBox(
			10,
			new Label(
					"Last name:"),
			lnTextField);
	Label tprompt = new Label(
			"Title:");
	TextField tTextField = new TextField();
	HBox thbox = new HBox(
			10,
			tprompt,
			tTextField);
	Button button1 = new Button(
			"Format 1");
	Button button2 = new Button(
			"Format 2");
	Button button3 = new Button(
			"Format 3");
	Button button4 = new Button(
			"Format 4");
	Button button5 = new Button(
			"Format 5");
	Button button6 = new Button(
			"Format 6");
	HBox bhbox = new HBox(
			10,
			button1,
			button2,
			button3,
			button4,
			button5,
			button6);
	Label outputLabel = new Label();
	HBox outputHBox = new HBox(
			outputLabel);
	VBox masterVBox = new VBox(
			10,
			fnhbox,
			mnhbox,
			lnhbox,
			thbox,
			bhbox,
			outputHBox);

	@Override
	public void start(
			Stage primaryStage) throws Exception {
		// Create the controls for the first name.
		fnhbox.setAlignment(
				Pos.CENTER);
		// Create the controls for the middle name.
		mnhbox.setAlignment(
				Pos.CENTER);
		// Create the controls for the last name.
		lnhbox.setAlignment(
				Pos.CENTER);
		// Create the controls for the title.
		thbox.setAlignment(
				Pos.CENTER);
		// Create the Button Controls.
		bhbox.setAlignment(
				Pos.CENTER);
		// Create the output label.
		// Register event handlers.
		button1.setOnAction(
				e -> {
					outputLabel.setText(
							tTextField.getText() + " " + fnTextField.getText() + " " + mnTextField.getText() + " "
									+ lnTextField.getText());
				});
		button2.setOnAction(
				e -> {
					outputLabel.setText(
							fnTextField.getText() + " " + mnTextField.getText() + " " + lnTextField.getText());
				});
		button3.setOnAction(
				e -> {
					outputLabel.setText(
							fnTextField.getText() + " " + lnTextField.getText());
				});
		button4.setOnAction(
				e -> {
					outputLabel.setText(
							lnTextField.getText() + ", " + fnTextField.getText() + " " + mnTextField.getText() + ", "
									+ tTextField.getText());
				});
		button5.setOnAction(
				e -> {
					outputLabel.setText(
							lnTextField.getText() + ", " + fnTextField.getText() + " " + mnTextField.getText());
				});
		button6.setOnAction(
				e -> {
					outputLabel.setText(
							lnTextField.getText() + ", " + mnTextField.getText());
				});
		// Create a master VBox
		masterVBox.setPadding(
				new Insets(
						10));// Add the master VBox to a scene.
		// Set the scene to the stage and display it.
		primaryStage.setScene(
				new Scene(
						masterVBox));
		primaryStage.show();
	}

	public static void main(
			String[] args) {
		launch(
				args);
	}

}
