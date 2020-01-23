package com.exxeta;


import com.exxeta.domain.*;
import com.exxeta.ui.UserInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Consumer<String> fileNameConsumer = fileName -> {
            LOCStat locStat = FileAnalyser.analyseFile(fileName);
            total.incrementLinesOfCode(locStat.getLinesOfCode());
            total.incrementLines(locStat.getTotalLines());
            UserInterface.printLocCount(locStat);
        };
        LOCStart.start(args, fileNameConsumer);
    }

    public Class FilenameConsumer 
}
