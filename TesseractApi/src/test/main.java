package test;

import API.Tesseract;

import java.awt.desktop.ScreenSleepEvent;

public class main {
    public static void main( String args[]){
        Tesseract test = new Tesseract();
        test.execute( "index.jpeg");
    }
}
