import processing.core.PApplet;

public class Graph {
    PApplet p;
    DataBroker dB;
    int yConstrained =0;
int constrainMax = 0;
    Graph(PApplet p,DataBroker dB){
        this.p = p;
        this.dB= dB;

    }

    void displayGraph(String inputStringC,String inputStringY){
        String[] graphValues;
        if(dB.getAll(inputStringC)[0]!=null){


                    graphValues = dB.getAll(inputStringC);
constrainMax++;
                    for(int i =0;i<115;i++){

                        if(i==114||i==114-114/3||i==114-(114/3)*2||i==0)
                            p.text(2014-114+i+"",((i+2))*(float)8.20,920);
                        System.out.println(graphValues[i]);
                        p.fill(0);
                        if(graphValues[i].equals("-1") == false)
                            if(inputStringC!=null)
                            if(Integer.toString(2014-i).equals(inputStringY))
                                p.fill(255,0,0);
                            yConstrained = p.constrain(Integer.parseInt(graphValues[i]),0,constrainMax);
                            p.rect((((114-i)+2))*(float)8.50,900,10,(yConstrained)*-1);
                            p.fill(0);

                    }






    }else constrainMax = 1;
    }

}
