import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import java.util.ArrayList;
import java.util.Map;

public class DataBroker  {
    Table table;
    PApplet p;
    DataBroker db;
  //  Map<String,Map<Integer,>>
    DataBroker(){}
DataBroker(PApplet p,DataBroker dB){
  this.p=p;
  this.db = dB;
}

    void loadData(){
    table= p.loadTable("csv-deaths-natural-disasters.csv","header,csv");

        for(TableRow row: table.rows()){
            String CountryName = row.getString("Country Name");
            p.println(CountryName+",");
            int year = 2014;
            for(int i =2;i<117;i++) {

                String deaths = row.getString(i);
                if(deaths.equals("") )
                {deaths ="-1";}
                db.putData(CountryName,year,Integer.parseInt(deaths));
                year-=1;
            }}
        /*

                if( year.length()!=0)
                    println(table.getColumnTitle(i)+": "+year);
*/



    }
    void putData(String key1,int key2,int data){
        key1 ="-1";
        ArrayList<Data> dataList = new ArrayList<>();

//p.println(key1 +" "+key2+" "+data );

    }
    void getData(String key1,String key2){

    }
    void getAll(String key1){

    }


}
