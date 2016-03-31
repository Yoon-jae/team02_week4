package com.bill.team02.week4;
import java.io.*;

public class AppView {
	
	private static final int NUMBER_OF_SPLIT_CYCLES = 3;
	private static final int MAX_DATA_SIZE = 1000;
	
	public AppView() {
		try {
			scanFile("input.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String[] scanFile(String fileName) throws IOException{
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
		
		FileInputStream stream = new FileInputStream("input_AOVNetwork");
		InputStreamReader reader = new InputStreamReader(stream);
		StreamTokenizer token = new StreamTokenizer(reader);
		
		String[] accountData = new String[MAX_DATA_SIZE];
		int accountDataIndex = 0;
		
		while((token.nextToken() != StreamTokenizer.TT_EOF)){
			switch(token.ttype) {
				case StreamTokenizer.TT_NUMBER:
					if(token.lineno() == 2)	{ // 파일의 첫 번째 줄. 정점의수 
						accountData = new String[((int)token.nval + 1) * 2];
						System.out.printf("numOfLine : %d\n",(int)token.nval);
					}
					break;
					
				case StreamTokenizer.TT_WORD:
					if(token.lineno() == 1) {
						String planName = token.sval;
						accountData[accountData.length-1] = planName;
						System.out.printf("accountData[%d] : %s\n",accountData.length-1,planName);
					}
					else {
						String lineUserName = token.sval;
						accountData[accountDataIndex++] = lineUserName;
						token.nextToken();
						String usedMinute = token.sval;
						accountData[accountDataIndex++] = usedMinute;
						System.out.printf("UserName : %s || UsedMinute : %s\n",lineUserName,usedMinute);
					}
					break;
			}
		}
		stream.close();
		return accountData;
	}	
}
