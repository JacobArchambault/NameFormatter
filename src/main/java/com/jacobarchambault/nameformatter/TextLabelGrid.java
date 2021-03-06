package com.jacobarchambault.nameformatter;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class TextLabelGrid extends GridPane {

	TextLabelGrid(
			final Label l1,
			final Label l2,
			final Label l3,
			final Label l4,
			final TextField tf1,
			final TextField tf2,
			final TextField tf3,
			final TextField tf4) {
		add(
				l1,
				0,
				0);
		add(
				l2,
				0,
				1);
		add(
				l3,
				0,
				2);
		add(
				l4,
				0,
				3);
		add(
				tf1,
				1,
				0);
		add(
				tf2,
				1,
				1);
		add(
				tf3,
				1,
				2);
		add(
				tf4,
				1,
				3);
		setVgap(
				10);
		setCenterShape(
				true);
		setAlignment(
				Pos.CENTER);
	}
}
