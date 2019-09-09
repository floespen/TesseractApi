package API;

import java.io.*;

public class Tesseract {

    private String outputFileName;
    private String outputFileType;

    public Tesseract(){
        outputFileName = "test";
        outputFileType = "PDF";
    }

    public void translateImage(String inputFile){
        StringBuffer output = new StringBuffer();
        Process p;
       String command = "tesseract " + "src/test/" + inputFile + " " + "src/test/" + outputFileName + " -l deu";
        try {
            System.out.println(command);
            p = Runtime.getRuntime().exec(command);
            p.waitFor();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
