package com.bill.team02.week4;
import java.io.*;

public class AppView {
	
	private static final int NUMBER_OF_SPLIT_CYCLES = 3;
	private static final int MAX_DATA_SIZE = 1000;
	
	public AppView() {
		
	}

	public String[] scanFile() throws IOException {
//		File inputFile = new File(fileName);
//		@SuppressWarnings("resource")
//		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//		
//		String planName = reader.readLine();
//		String numOfLines = reader.readLine();
//		
//		String[] accountData = new String[(Integer.parseInt(numOfLines) + 1) * 2];
//		
//		String[] header;
//		header = line.split(" ");
//		int cnt = 0;
//		String[] tmpLine;
//		String[][] lineData = null;
//		for(int i=0; i<header.length; i++) {
//			lineData[0][i] = header[i];
//		}
//		while((line = reader.readLine()) != null){
//			tmpLine = line.split(" ");
//			for(int i = 0; i < NUMBER_OF_SPLIT_CYCLES; i++) {
//				lineData[cnt][i] = tmpLine[i];
//			}
//		}
		
		FileInputStream stream = new FileInputStream("input.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		StreamTokenizer token = new StreamTokenizer(reader);
		
		String[] accountData = new String[MAX_DATA_SIZE];
		int accountDataIndex = 0;
		String planName = null;
		while((token.nextToken() != StreamTokenizer.TT_EOF)){
			switch(token.ttype) {
				case StreamTokenizer.TT_NUMBER:
					if(token.lineno() == 2)	{ 
						int numOfLine = (int)token.nval;
						accountData = new String[(numOfLine + 1) * 2];
						accountData[accountData.length-1] = planName;
						accountData[accountData.length-2] = String.valueOf(numOfLine);
						System.out.printf("planName : %s\n",accountData[accountData.length-1]);
						System.out.printf("numOfLine : %s\n",accountData[accountData.length-2]);
					}
					break;
					
				case StreamTokenizer.TT_WORD:
					if(token.lineno() == 1) {
						planName = token.sval;
					}
					else {
						String lineUserName = token.sval;
						accountData[accountDataIndex++] = lineUserName;
						token.nextToken();
						String usedMinute = ""+token.nval;
						accountData[accountDataIndex++] = usedMinute;
						System.out.printf("UserName : %s || UsedMinute : %s\n",lineUserName,usedMinute);
					}
					break;
			}
		}
		
		for(int i=0; i<accountDataIndex; i++) {
			System.out.printf("accountData[%d] : %s\n",i,accountData[i]);
			
		}
		stream.close();
		return accountData;
	}	
}
