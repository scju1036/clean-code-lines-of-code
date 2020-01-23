package com.exxeta.domain;

import java.util.List;

public class FileAnalyser {

    private final static String COMMENT = "//";

    public static LOCStat analyseFile(String filename){
        List<String> sourceCode = FileReader.readFile(filename);
        return analyse(filename, sourceCode);
    }

    private static LOCStat analyse(String filename, List<String> sourceCode){
        LOCStat locStat = new LOCStat();
        locStat.setFileName(filename);

        long totalLines = sourceCode.size();
        locStat.setTotalLines(totalLines);

        long emptyLines = 0;
        for (String line : sourceCode) {
            if(line.startsWith(COMMENT) || line.isBlank()){
                emptyLines++;
            }
        }
        locStat.setLinesOfCode(locStat.getTotalLines() - emptyLines);

        return locStat;
    }
}
