
import processing.core.PApplet;
import processing.core.PFont;
import processing.data.Table;
import processing.data.TableRow;

import javax.swing.*;

public class deaths_natural_disasters extends PApplet {
    public static void main(String[] args) {
        PApplet.main("deaths_natural_disasters");
    }

    int width = 1000;
    int height = 1000;
    int baseInputWidth = 400;
    int baseInputHeight = 50;
    String inputStringC;
    String inputStringY;

    DataBroker dB = new DataBroker(this);
    Graph graph = new Graph(this,dB);
    InputField iFCountry = new InputField(this, width /4, 50, baseInputWidth, baseInputHeight,"Country");
    InputField iFYear = new InputField(this, width/4, 110, baseInputWidth, baseInputHeight,"Year");
    PFont font;
    Displayer displayer = new Displayer(iFCountry, iFYear,dB,graph);
    boolean iCountryCheck, iYearCheck;

    @Override
    public void settings() {
        super.settings();
        size(width, height);
    }


    @Override
    public void setup() {
        super.setup();

        font = createFont("Comic Sans", 20);
        dB.loadData();
    }


    @Override
    public void draw() {
        background(255);
        textFont(font);
        displayer.display(inputStringC,inputStringY);

    }public void mousePressed(){
        iYearCheck = false;
        iCountryCheck = false;
        iCountryCheck =iFCountry.mouseCollision(mouseX,mouseY);
        iYearCheck= iFYear.mouseCollision(mouseX,mouseY);

        }


    @Override
    public void keyTyped(){

        if(iCountryCheck == true)
        inputStringC= iFCountry.input(true,key);
        if(iYearCheck == true)
        inputStringY = iFYear.input(true,key);

    }
    public void keyReleased(){

        if(iCountryCheck == true)
        iFCountry.input(false,key);
        if(iYearCheck == true)
        iFYear.input(false,key);

    }
}
