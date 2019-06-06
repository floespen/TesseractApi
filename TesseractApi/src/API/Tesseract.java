package API;

import java.io.*;

public class Tesseract {

    private String outputFileName;
    private String outputFileType;

    public Tesseract(){
        outputFileName = "test";
        outputFileType = "PDF";
    }

    public void execute(String inputFile){
        StringBuffer output = new StringBuffer();
        Process p;
       String command = "tesseract " + "src/test/" + inputFile + " " + "src/test/" + outputFileName + " -l deu";
        try {
            System.out.println(command);
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = "";
            while ((line = reader.readLine())!= null) {
                output.append(line + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(output.toString());
    }
}
