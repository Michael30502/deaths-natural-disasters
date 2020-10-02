import processing.core.PApplet;


public class InputField {

    String inputString ="";
    PApplet p;
    int x,y,w,h;
    String type;
    int checkInt;
    boolean check = true;
    boolean chosen = false;

    InputField(PApplet p,int x,int y,int w,int h,String type){

        this.p=p;

        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        this.type = type;
    }

   String input(boolean check,char key) {

       if (check) {

           if (key != '\b' && key != p.CODED) {
               if((type.equals("Country")&&inputString.length()<29)||(type.equals("Year")&&inputString.length()<4)) {
                   inputString += key;

                   inputString = inputString.replaceAll("[^\\p{javaWhitespace}\\p{Alnum}(-)]", "");
                 //  inputString = inputString.toUpperCase();

               }
           } else if(key == '\b') {
               if (inputString.length() >= 1)
                   inputString = inputString.substring(0, inputString.length() - 1);

           }
       }
       return inputString;
   }
       boolean mouseCollision ( int mX, int mY){
//Check om mouseX og mouseY, er på inputfeltet
           if (((mX < x + w ) && ( mX > x)))
               if(((mY < y + h ) && ( mY > y))) {
                chosen = true;
                   return true;
               }
           {
               chosen = false;
               return false;
           }
       }


       void display () {
           String displayString = "";

                   String displayString1 = inputString+'|';
        String displayString0 =inputString;
            p.fill(255);
            p.rect(x,y,w,h);
            p.fill(0,255,0);

            if(check&&chosen){
displayString = displayString1;
                if(checkInt%60 ==0)
check = false;
            }else{
                displayString = displayString0;
                if(checkInt%60 ==0)
                check = true;
            }

            p.text(displayString, x+5, y+h/2+7);
            if(type.equals("Country"))
            p.text("Country",x-100,y+h/2+7);
           if(type.equals("Year"))
               p.text("Year",x-100,y+h/2+7);
            p.fill(0);
            checkInt++;
       }

   }
