package testtt.test;


import java.io.*;
import java.util.*;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Exam3 {



        public static void main(String[] args) throws CsvException, IOException {
            CSVReader csvReader = new CSVReader(new FileReader("DataFile.csv"));
            List<String[]> lines = csvReader.readAll();

            List<String[]> text =new ArrayList<>() ;
            int sum =0;
            text.add(lines.get(0));
            for (int i = 1; i < lines.size(); i++) {
                for (int a = 0; a < text.size(); a++) {
                    if (lines.get(i)==text.get(a)){
                        sum = sum+1;
                    }else{
                        text.add(lines.get(i));
                    }
                }
            }

            

            





        }}