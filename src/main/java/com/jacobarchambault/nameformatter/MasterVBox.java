package com.jacobarchambault.nameformatter;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

class MasterVBox extends VBox {
	MasterVBox(int spacing, Insets insets, Node... children){
		super(spacing, children);
		setPadding(insets);
	}

}
