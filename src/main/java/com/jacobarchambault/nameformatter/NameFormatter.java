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
	TextField tTextField = new TextField();
	HBox thbox = new HBox(
			10,
			new Label(
					"Title:"),
			tTextField);
	Label outputLabel = new Label();

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
		// Create the output label.
		// Register event handlers.
		// Set the scene to the stage and display it.
		primaryStage.setScene(
				new Scene(
						new MasterVBox(
								10,
								new Insets(
										10),
								fnhbox,
								mnhbox,
								lnhbox,
								thbox,
								new HBox(
										10,
										new EventButton(
												"Format 1",
												e -> {
													outputLabel.setText(
															tTextField.getText() + " " + fnTextField.getText() + " " + mnTextField.getText() + " "
																	+ lnTextField.getText());
												}),
										new EventButton(
												"Format 2",
												e -> {
													outputLabel.setText(
															fnTextField.getText() + " " + mnTextField.getText() + " " + lnTextField.getText());
												}),
										new EventButton(
												"Format 3",
												e -> {
													outputLabel.setText(
															fnTextField.getText() + " " + lnTextField.getText());
												}),
										new EventButton(
												"Format 4",
												e -> {
													outputLabel.setText(
															lnTextField.getText() + ", " + fnTextField.getText() + " " + mnTextField.getText()
																	+ ", " + tTextField.getText());
												}),
										new EventButton(
												"Format 5",
												e -> {
													outputLabel.setText(
															lnTextField.getText() + ", " + fnTextField.getText() + " " + mnTextField.getText());
												}),
										new EventButton(
												"Format 6",
												e -> {
													outputLabel.setText(
															lnTextField.getText() + ", " + fnTextField.getText());
												})),
								new HBox(
										outputLabel))));
		primaryStage.show();
	}

	public static void main(
			String[] args) {
		launch(
				args);
	}

}
