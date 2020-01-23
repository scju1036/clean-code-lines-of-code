package com.exxeta.ui;

import com.exxeta.domain.LOCStat;

import java.util.List;

public class UserInterface {

    public static void  printLocCount(List<LOCStat> locStats){
        long total = 0;
        long linesOfCode = 0;

        for (LOCStat locStat : locStats) {
            System.out.println(locStat.getFileName() + " " + locStat.getTotalLines() + " " + locStat.getLinesOfCode());
            total += locStat.getTotalLines();
            linesOfCode += locStat.getLinesOfCode();
        }

        System.out.println("Total: " + total);
        System.out.println("Total Lines of Code: " + linesOfCode);
    }
}
