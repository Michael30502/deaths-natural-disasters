public class Displayer {

    InputField iFYear;
    InputField iFCountry;
    DataBroker dB;





    Displayer(InputField iFCountry,InputField iFYear,DataBroker dB){

        this.iFCountry=iFCountry;
        this.iFYear=iFYear;
        this.dB = dB;
    }


    void display(String inputStringC,String inputStringY){

        iFCountry.display();
        iFYear.display();
        dB.display(inputStringC,inputStringY);
        dB.displayGraph(inputStringC,inputStringY);
    }



}
