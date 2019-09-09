package test;

import API.Tesseract;

public class main {
    public static void main( String args[]){
        Tesseract test = new Tesseract();
        test.translateImage( "index.jpeg");
    }
}
