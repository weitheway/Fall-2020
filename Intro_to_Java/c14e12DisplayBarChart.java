/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 7 Question 14.12
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class c14e12DisplayBarChart extends Application{
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		HBox hBox = new HBox(15);
		
		hBox.setPadding(new Insets(15, 15, 15, 15));
		
		VBox vBox1 = new VBox(2);
		VBox vBox2 = new VBox(2);
		VBox vBox3 = new VBox(2);
		VBox vBox4 = new VBox(2);
		
		vBox1.setAlignment(Pos.BOTTOM_LEFT);
		vBox2.setAlignment(Pos.BOTTOM_LEFT);
		vBox3.setAlignment(Pos.BOTTOM_LEFT);
		vBox4.setAlignment(Pos.BOTTOM_LEFT);
		
		Rectangle r1 = new Rectangle(0, 0, 100, 100);
		r1.setFill(Color.RED);
		Text text1 = new Text(0, 0, "Project -- 20%");
		Rectangle r2 = new Rectangle(0, 0, 100, 50);
		r2.setFill(Color.BLUE);
		Text text2 = new Text(0, 0, "Quizzes -- 10%");
		Rectangle r3 = new Rectangle(0, 0, 100, 150);
		r3.setFill(Color.GREEN);
		Text text3 = new Text(0, 0, "Midterm -- 30%");
		Rectangle r4 = new Rectangle(0, 0, 100, 200);
		r4.setFill(Color.ORANGE);
		Text text4 = new Text(0, 0, "Project -- 40%");

		vBox1.getChildren().addAll(text1,r1);
		vBox2.getChildren().addAll(text2,r2);
		vBox3.getChildren().addAll(text3,r3);
		vBox4.getChildren().addAll(text4,r4);
		
		hBox.getChildren().addAll(vBox1,vBox2,vBox3,vBox4);
		pane.getChildren().add(hBox);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Chapter 14 Exercise 12 - Display Bar Chart");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
