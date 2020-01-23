package com.exxeta.domain;

import java.util.ArrayList;
import java.util.List;

public class LOCStart {

    public static List<LOCStat> start(String[] args) {
        String path = ArgumentReader.getPath(args);
        List<String> fileNames = FolderExplorer.findFileNames(path);
        List<LOCStat> locStats = new ArrayList<>();
        for (String fileName : fileNames) {
            locStats.add(FileAnalyser.analyseFile(fileName));
        }
        return locStats;
    }
}
