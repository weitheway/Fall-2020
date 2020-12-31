
/*
 * Author: Wen Wei Zheng
 * Course: CS 501 - Intro to JAVA Programming 
 * Textbook: 10th Edition 
 * Assignment 5 Question 12.13
 */
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class c12e13ParseFile {

	public static void main(String[] args) {
		int option=JOptionPane.YES_OPTION;	
		JOptionPane.showMessageDialog(null, "This program will count the characters, words, and lines in a file.","Program Purpose", JOptionPane.INFORMATION_MESSAGE);
		while(option==JOptionPane.YES_OPTION){
			
			JFileChooser file = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Text file only", "txt");
			file.setFileFilter(filter);
			int numchar=0;
            int numword=0;
            int numline=0;
			if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				try {
					FileReader fr = new FileReader(file.getSelectedFile().getPath());
		            BufferedReader br = new BufferedReader(fr);
		            String line;
		            while((line=br.readLine())!=null) {
		            	numline++;
		            	String[] word = line.split("[\r \n \t ,;:.]");
	            		for(int i=0; i < word.length; i++){
	            			if(word[i].length()>0){
	            				numword++;
	            				numchar += word[i].length();
	            			}
	            		}
		            }
				}
				catch (IOException e){
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "The file you have selected is "+file.getSelectedFile().getName()+
						"This file has: "+
						"\n"+numchar+" characters"+
						"\n"+numword+" words"+
						"\n"+numline+" lines",
						"Informtion of "+file.getSelectedFile().getName(), JOptionPane.INFORMATION_MESSAGE);
				
			}
			option = JOptionPane.showConfirmDialog(null, "Do you want to check another file?");
		}
	}
}
