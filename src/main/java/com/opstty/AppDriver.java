package com.opstty;

import com.opstty.job.CountKinds;
import com.opstty.job.DistrictMost;
import com.opstty.job.DistrictOldest;
import com.opstty.job.ListDistrics;
import com.opstty.job.ListKinds;
import com.opstty.job.SortHeight;
import com.opstty.job.TallestKinds;
import com.opstty.job.WordCount;
import org.apache.hadoop.util.ProgramDriver;

public class AppDriver {
    public static void main(String argv[]) {
        int exitCode = -1;
        ProgramDriver programDriver = new ProgramDriver();

        try {
            programDriver.addClass("wordcount", WordCount.class,
                    "A map/reduce program that counts the words in the input files.");
            programDriver.addClass("listdistricts", ListDistrics.class,
                    "A map/reduce program that displays the list of districts containing trees in the input files.");
            programDriver.addClass("listkinds", ListKinds.class,
                    "A map/reduce program that displays the list of tree kinds in the input files.");
            programDriver.addClass("countkinds", CountKinds.class,
                    "A map/reduce program that counts the number of trees of each kind in the input files.");
            programDriver.addClass("tallestkinds", TallestKinds.class,
                    "A map/reduce program that calculates the height of the tallest tree of each kind in the input files.");
            programDriver.addClass("sortheight", SortHeight.class,
                    "A map/reduce program that sorts the trees height from smallest to largest in the input files.");
            programDriver.addClass("districtoldest", DistrictOldest.class,
                    "A map/reduce program that displays the district where the oldest tree is in the input files.");
            programDriver.addClass("districtmost", DistrictMost.class,
                    "A map/reduce program that displays the district that contains the most trees in the input files.");

            exitCode = programDriver.run(argv);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.exit(exitCode);
    }
}
