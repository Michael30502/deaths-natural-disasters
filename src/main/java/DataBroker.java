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
                if(deaths.equals(""))
                {deaths ="-1";}
                putData(CountryName,year,Integer.parseInt(deaths));
                year-=1;
            }}

    }
    void putData(String key1,int key2,int data){
        String key = key1+key2;
        map.put(key,new Data(key1,key2,data));
        //system.out.println(map.get(key));

//p.println(key);
    }
    String[] getData(String key1,String key2){
        String ans1 ="Invalid",ans2 = "Invalid",ans3="Invalid";
        String key = key1+key2;
          Data result =map.get(key);
        if(result!=null){
            ans1 = result.Country;
            ans2 = Integer.toString(result.year);
            if(result.deaths != -1)
            ans3 = Integer.toString(result.deaths);

        }
return new String[]{ans1,ans2,ans3};
    }

    String [] getAll(String key1){


        String[] allForCountry = new String[115];
        if(key1!=null)
        key1= key1.toUpperCase();
        if(map.get(key1+2012)!=null){
        int year = 2014;
        for(int i =0;i<115;i++) {
            String key = key1+year;
            Data result = map.get(key);
            {
                if (result != null) {


                allForCountry[i] = Integer.toString(result.deaths);
year--;
            }}}}

        return allForCountry;
    }

    void display(String inputStringC,String inputStringY){
        String[] cYDList;
        cYDList = getData(inputStringC,inputStringY);
        p.fill(0,255,0);
        p.text("Country : "+ cYDList[0],700,100-20);
        p.text("Year : "+ cYDList[1],700,150-20);
        p.text("Deaths : "+ cYDList[2],700,200-20);
        p.fill(0);
    }



}
