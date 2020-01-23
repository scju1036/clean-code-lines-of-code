package com.exxeta;


import com.exxeta.domain.ArgumentReader;
import com.exxeta.domain.FileAnalyser;
import com.exxeta.domain.FolderExplorer;
import com.exxeta.domain.LOCStat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String path = ArgumentReader.getPath(args);
        List<String> fileNames = FolderExplorer.findFileNames(path);
        List<LOCStat> locStats = new ArrayList<>();
        for (String fileName : fileNames) {
            locStats.add(FileAnalyser.analyseFile(fileName));
        }
    }
}
