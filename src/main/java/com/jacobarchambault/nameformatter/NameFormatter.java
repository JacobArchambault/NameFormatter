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
	TextField mnTextField = new TextField();
	TextField lnTextField = new TextField();
	TextField tTextField = new TextField();
	Label outputLabel = new Label();
	TextLabelGrid main = new TextLabelGrid(
			new Label(
					"First Name: "),
			new Label(
					"Middle Name: "),
			new Label(
					"Last Name: "),
			new Label(
					"Title: "),
			fnTextField,
			mnTextField,
			lnTextField,
			tTextField);

	@Override
	public void start(
			Stage primaryStage) throws Exception {
		main.setAlignment(Pos.CENTER);
		// Create the output label.
		// Register event handlers.
		// Set the scene to the stage and display it.
		primaryStage.setScene(
				new Scene(
						new MasterVBox(
								10,
								new Insets(
										10),
								main,
								new HBox(
										10,
										new EventButton(
												"Format 1",
												e -> {
													outputLabel.setText(
															tTextField.getText() + " " + fnTextField.getText() + " "
																	+ mnTextField.getText() + " "
																	+ lnTextField.getText());
												}),
										new EventButton(
												"Format 2",
												e -> {
													outputLabel.setText(
															fnTextField.getText() + " " + mnTextField.getText() + " "
																	+ lnTextField.getText());
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
															lnTextField.getText() + ", " + fnTextField.getText() + " "
																	+ mnTextField.getText() + ", "
																	+ tTextField.getText());
												}),
										new EventButton(
												"Format 5",
												e -> {
													outputLabel.setText(
															lnTextField.getText() + ", " + fnTextField.getText() + " "
																	+ mnTextField.getText());
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
