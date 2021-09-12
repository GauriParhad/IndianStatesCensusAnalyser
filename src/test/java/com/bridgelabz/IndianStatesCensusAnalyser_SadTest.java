package com.bridgelabz;
import java.io.FileReader;
import java.io.UncheckedIOException;

import com.opencsv.CSVReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class IndianStatesCensusAnalyser_SadTest {
    String csvFile = "CensusAnalyser.csv";
    CSVReader csvReader = null;

    @Test
    public void toCheck_Match_CSVData_Sadtest() {
        try {
            String csvFile = "CensusAnalyser.csv";
            CSVReader csvReader = null;
            String[] value;
            while ((value = csvReader.readNext()) == null) {
                System.out.println("Error Occurred");

            }
        } catch (UncheckedIOException e) {
            System.out.println("Data are not matched");
            System.out.println("Sad Test" + e);
        }
    }
}