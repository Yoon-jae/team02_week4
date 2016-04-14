package com.bill.team02.week4;

import java.io.*;

public class AppView {

    private static final int NUM_OF_LINE_INDEX = 2;
    private static final int PLAN_IDNEX = 1;
    private static final int MUL_PAIR = 2;
    private static final int ADD_PAIR = 1;
    private static final int LINE_NUMBER_ONE = 1;
    private static final int LINE_NUMBER_TWO = 2;
    private static final int MAX_DATA_SIZE = 1000;

    public AppView() {
        // Intentionally Empty
    }

    public String[] scanFile(String fileName) throws IOException {

        FileInputStream stream = new FileInputStream(fileName);
        InputStreamReader reader = new InputStreamReader(stream);
        StreamTokenizer token = new StreamTokenizer(reader);

        String[] accountData = new String[MAX_DATA_SIZE];
        int accountDataIndex = 0;
        String planName = null;
        while (token.nextToken() != StreamTokenizer.TT_EOF) {
            if (token.ttype == StreamTokenizer.TT_NUMBER) {
                if (token.lineno() == LINE_NUMBER_TWO) {
                    int numOfLine = (int) token.nval;
                    accountData = new String[(numOfLine + ADD_PAIR) * MUL_PAIR];
                    accountData[accountData.length - PLAN_IDNEX] = planName;
                    accountData[accountData.length - NUM_OF_LINE_INDEX] = String.valueOf(numOfLine);
                }
                else{
                    
                }
                continue;
            }
            if (token.ttype == StreamTokenizer.TT_WORD) {
                if (token.lineno() == LINE_NUMBER_ONE) {
                    planName = token.sval.toLowerCase();
                } else {
                    String lineUserName = token.sval;
                    accountData[accountDataIndex++] = lineUserName;
                    token.nextToken();
                    String usedMinute = Double.toString(token.nval);
                    accountData[accountDataIndex++] = usedMinute;
                }
            }
            else{
                
            }
        }
        stream.close();
        return accountData;
    }
}
