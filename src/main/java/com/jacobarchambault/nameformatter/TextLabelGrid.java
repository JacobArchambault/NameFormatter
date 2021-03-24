package com.jacobarchambault.nameformatter;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class TextLabelGrid extends GridPane {

	TextLabelGrid(
			Label l1,
			Label l2,
			Label l3,
			Label l4,
			TextField tf1,
			TextField tf2,
			TextField tf3,
			TextField tf4) {
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
		setVgap(10);
		setCenterShape(true);

	}
}
