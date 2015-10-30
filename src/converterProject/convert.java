package converterProject;

import java.util.ArrayList;
import java.util.Scanner;

public class convert {
	private static Scanner reader;
	static public void main(String args[])
	{
		reader = new Scanner(System.in);
		String hex = "";
		int decimal;
		do{
			System.out.println("please enter a 3 char hexadecimal");
			hex =  reader.next();
		}while(hex.length() < 3 || hex == ""|| hex.length() > 3);
				
		decimal = decimalConvert(hex);
		System.out.println(decimal);
		
		for (int i = 0;i < 4; ++i){
			System.out.print(octalConvert(decimal).get(i));
		}
		// this prints out arraylist in a neat format
	}
	static public int decimalConvert(String hex){
		int dec = Integer.parseInt(hex,16);
		// 16^2,16^1,16^0
		return(dec);
	}
	static public ArrayList<Integer> octalConvert(int decimal){
		int[] octalArray = {512,64,8,1};
		ArrayList<Integer> octal = new ArrayList<Integer>();
		// 8^3,8^2,8^1,8^0
		int x = octalArray.length;
		int j = decimal;
		for(int i = 0; i < x; ++i){
			octal.add(Math.round(j / octalArray[i]));
			j=j - (Math.round(j / octalArray[i]) * octalArray[i]);
		}
		return(octal);
	}
}
	
