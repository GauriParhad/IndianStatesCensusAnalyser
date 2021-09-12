package com.bridgelabz;
import com.opencsv.*;
import java.io.FileReader;
import java.io.IOException;

public class IndianStatesCensusAnalyser {
    public static void main(String[] args){
        System.out.println("Welocme to Indian states census analyser");
        String csvFile="CensusAnalyser.csv";
        CSVReader csvReader=null;
        try{
            csvReader=new CSVReader(new FileReader(csvFile));
            String[] value;
            while((value= csvReader.readNext() !=null){
                System.out.println(value[0]+ " "+ value[1]+ " "+ value[2]+ " "+ value[3]+ " "+ value[4]+ " "+ value[5]+ " "+ value[6]+ " "+ value[7]);
            }
        } catch(IOException e){
            System.out.println(e);
        }
        //Ability for anaylyser to load from CDV file using Iterator
        CSVReader reader=new CSVReader(new FileReader("C://CensusAnalyser.csv"));
        StringBuffer buffer =new StringBuffer();
        String line[];
        while((line= reader.readNext()) !=null){
            for(int i =0; i<line.length;i++) {
                System.out.print(line[i]+" ");
            }
            System.out.println(" ");
        }
    }
}
