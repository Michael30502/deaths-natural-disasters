import processing.core.PApplet;

import static processing.core.PConstants.BACKSPACE;
import static processing.core.PConstants.CODED;


public class InputField {
    String countryString="";
PApplet p;
    InputField(PApplet p){
this.p=p;

    }

   void input(boolean check,char key){
if(check){

    if(key!= '\b'&& key !=p.CODED) {
        countryString += key;
       countryString = countryString.replaceAll("[^\\p{IsAlphabetic}]","");
       countryString =countryString.toUpperCase();
    }
else {
    if(countryString.length()>=1)
      countryString=  countryString.substring(0, countryString.length() - 1);

    }


}

    }
    void display(){

        p.text(countryString,200,200);

    }

}
