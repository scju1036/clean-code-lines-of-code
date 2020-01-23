package com.exxeta;


import com.exxeta.domain.ArgumentReader;
import com.exxeta.domain.FolderExplorer;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String path = ArgumentReader.getPath(args);
        List<String> fileNames = FolderExplorer.findFileNames(path);
    }
}
