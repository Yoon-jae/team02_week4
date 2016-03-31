package com.bill.team02.week4;
import java.io.*;

public class AppView {
	
	private static final int NUMBER_OF_SPLIT_CYCLES = 3;
	public AppView() {
		try {
			scanFile("input.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("null")
	private void scanFile(String fileName) throws IOException{
		File inputFile = new File(fileName);
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		
		String line = null;
		
		line = reader.readLine();
		
		String[] header;
		
		header = line.split(" ");
		
		int cnt = 0;
		
		String[] tmpLine;
		String[][] lineData = null;
		
		for(int i=0; i<header.length; i++) {
			lineData[0][i] = header[i];
		}
		
		while((line = reader.readLine()) != null){
			tmpLine = line.split(" ");
			for(int i = 0; i < NUMBER_OF_SPLIT_CYCLES; i++) {
				lineData[cnt][i] = tmpLine[i];
			}
		}
	}	
}
