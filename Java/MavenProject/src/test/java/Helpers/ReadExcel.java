package Helpers;

import org.junit.Test;

import java.io.*;

public class ReadExcel {
    @Test
    public void readExcel(){

        String csvFile = "data.csv";
        String line = "";
        String csvSplitBy = ",";
        File tempFile = new File(csvFile);
        try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
            //processing code here
            while((line = br.readLine()) != null){
                String[] country = line.split(csvSplitBy);
                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }

        } catch (FileNotFoundException e) {
            System.out.println("*****FileNotFoundException*****");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("*****IOException*****");
            e.printStackTrace();
        }

    }
}
