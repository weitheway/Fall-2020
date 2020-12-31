/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 7 Question 14.1
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class c14e1DisplayImages extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5, 5, 5, 5));
		Image flag1 = new Image("flag0.gif");
		ImageView imageflag1 = new ImageView(flag1);
		Image flag2 = new Image("flag1.gif");
		ImageView imageflag2 = new ImageView(flag2);
		Image flag3 = new Image("flag2.gif");
		ImageView imageflag3 = new ImageView(flag3);
		Image flag4 = new Image("flag3.gif");
		ImageView imageflag4 = new ImageView(flag4);
		pane.add(imageflag1, 0, 0);
		pane.add(imageflag2, 0, 1);
		pane.add(imageflag3, 1, 0);
		pane.add(imageflag4, 1, 1);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Chapter 14 Exercise 1 - Display Images");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}