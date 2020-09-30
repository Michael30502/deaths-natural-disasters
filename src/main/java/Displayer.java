public class Displayer {

    InputField iFYear;
    InputField iFCountry;
    DataBroker dB;
    Graph graph;





    Displayer(InputField iFCountry,InputField iFYear,DataBroker dB,Graph graph){

        this.iFCountry=iFCountry;
        this.iFYear=iFYear;
        this.dB = dB;
        this.graph = graph;
    }


    void display(String inputStringC,String inputStringY){



        graph.displayGraph(inputStringC,inputStringY);
        dB.display(inputStringC,inputStringY);
        iFCountry.display();
        iFYear.display();
    }



}
