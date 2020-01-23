package com.exxeta.domain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FolderExplorer {

    public static List<String> findFileNames(String path) {
        List<String> fileNames = new ArrayList<>();
        try (Stream<Path> walk = Files.walk(Paths.get(path))) {

            fileNames = walk.map(Object::toString).filter(f -> f.endsWith(".java")).collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileNames;
    }
}
