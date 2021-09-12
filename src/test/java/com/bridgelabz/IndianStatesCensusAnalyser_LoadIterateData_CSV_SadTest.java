package com.bridgelabz;
import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;

import com.opencsv.CSVReader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IndianStatesCensusAnalyser_LoadIterateData_CSV_SadTest {
    String csvFile = "CensusAnalyser.csv";
    CSVReader csvReader = null;

    @Test
    public void toCheck_Match_CSVData_SadTest() {
        try {
            String csvFile = "CensusAnalyser.csv";
            CSVReader csvReader = null;
            String[] value;
            while ((value = csvReader.readNext()) == null) {
                System.out.println("Error Occurred");

            }
        } catch (UncheckedIOException | IOException e) {
            System.out.println("Data are not matched");
            System.out.println("Sad Test" + e);
        }
    }
}
}