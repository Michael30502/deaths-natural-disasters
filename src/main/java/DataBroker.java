import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import java.util.*;

public class DataBroker  {
    Table table;
    PApplet p;

  HashMap<String,Data> map = new HashMap<>();


    DataBroker(){}
DataBroker(PApplet p){
  this.p=p;

}

    void loadData(){
    table= p.loadTable("csv-deaths-natural-disasters.csv","header,csv");

        for(TableRow row: table.rows()){
            String CountryName = row.getString("Country Name");

            int year = 2014;
            for(int i =2;i<117;i++) {

                String deaths = row.getString(i);
                if(deaths.equals("") )
                {deaths ="-1";}
                putData(CountryName,year,Integer.parseInt(deaths));
                year-=1;
            }}







    }
    void putData(String key1,int key2,int data){
        String key = key1+key2;
        map.put(key,new Data(key1,key2,data));
    //    System.out.println(map.get(key));

//p.println(key);
    }
    void getData(String key1,int key2){
        String key = key1+key2;
          Data result =map.get(key);
        System.out.println(result.Country);
          System.out.println(result.year);
          System.out.println(result.deaths);
    }
    void getAll(String key1){

    }


}
