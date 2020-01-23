package com.exxeta;


import com.exxeta.domain.*;
import com.exxeta.ui.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<LOCStat> stats = LOCStart.start(args);
        UserInterface.printLocCount(stats);
    }
}
