package team02_week4.bill;
import java.io.*;

public class AppView {
	
	public AppView() throws Exception{
		scanFile("input.txt");
		
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
		
		for(int i=0; i<header.length; i++)
			lineData[0][i] = header[i];
		
		while((line = reader.readLine()) != null){
			tmpLine = line.split(" ");
			for(int i = 0; i<3; i++)
				lineData[cnt][i] = tmpLine[i];		
		}
	}	
}
