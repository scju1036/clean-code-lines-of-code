package com.exxeta.domain;

import java.util.List;

public class FileAnalyser {

    private final static String COMMENT = "//";
    private final static String REGEX = "\\s+";


    public LOCStat analyseFile(String filename){
        List<String> sourceCode = FileReader.readFile(filename);
        return analyse(filename, sourceCode);
    }

    public LOCStat analyse(String filename, List<String> sourceCode){
        LOCStat locStat = new LOCStat();
        locStat.setFileName(filename);

        long totalLines = 0;
        long emptyLines = 0;

        for (String line : sourceCode) {
            totalLines++;

            if(line.isEmpty() || line.startsWith(COMMENT) || line.replaceAll("REGEX","").length() == 0 ){
                emptyLines++;
            }
        }

        locStat.setLinesOfCode(totalLines - emptyLines);
        locStat.setTotalLines(totalLines);

        return locStat;
    }
}
