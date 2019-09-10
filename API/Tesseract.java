package API;

import java.io.*;

public class Tesseract {
    private String outputFileType;

    public Tesseract() {
        outputFileType = "pdf";
    }

    public Tesseract(String outputFileType) {
        this.outputFileType = outputFileType;
    }

    public void translateImage(String inputFile) {
        String InputFileNameWithoutFileExtension = Helpers.removeFileExtension(inputFile);
        StringBuffer output = new StringBuffer();
        Process p;
        String command = "tesseract " + "src/test/" + inputFile + " " + "src/test/" + InputFileNameWithoutFileExtension + "_ocr" + " -l deu" + " " + this.outputFileType;
        try {
            System.out.println(command);
            p = Runtime.getRuntime().exec(command);
            p.waitFor();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
