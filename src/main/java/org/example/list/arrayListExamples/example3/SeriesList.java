package org.example.list.arrayListExamples.example3;

import java.util.ArrayList;
import java.util.List;

public class SeriesList {
    List<String> series = new ArrayList<>();

    public List<String> getSeries(){
        series.add("Breaking Bad");
        series.add("Los Soprano");
        series.add("The Wire");
        series.add("Better call Saul");
        series.add("Two and a half men");

        return series;

    }
}
