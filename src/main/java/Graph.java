import processing.core.PApplet;

public class Graph {
    PApplet p;
    DataBroker dB;

    Graph(PApplet p,DataBroker dB){
        this.p = p;
        this.dB= dB;

    }

    void displayGraph(String inputStringC,String inputStringY){
        String[] graphValues;
        if(dB.getAll(inputStringC)[0]!=null){
            if(inputStringY!=null)
                if(inputStringY.equals("ALL")||true) {
                    graphValues = dB.getAll(inputStringC);

                    for(int i =0;i<115;i++){

                        if(i==114||i==114-114/3||i==114-(114/3)*2||i==0)
                            p.text(2014-114+i+"",((i+2))*(float)8.20,920);
                        System.out.println(graphValues[i]);
                        p.fill(0);
                        if(graphValues[i].equals("-1") == false)
                            if(inputStringC!=null)
                            if(Integer.toString(2014-i).equals(inputStringY))
                                p.fill(255,0,0);
                            p.rect((((114-i)+2))*(float)8.50,900,10,(Integer.parseInt(graphValues[i]))*-1);
                            p.fill(0);

                    }}



        }


    }

}
