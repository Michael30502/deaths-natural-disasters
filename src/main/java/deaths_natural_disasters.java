import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import javax.swing.*;

public class deaths_natural_disasters extends PApplet {
    public static void main(String[] args ) {
        PApplet.main("deaths_natural_disasters");
    }

    Table table;
    DataBroker dB = new DataBroker(this);


    @Override
    public void settings() {
        super.settings();
    }

    @Override
    public void setup() {
        super.setup();


        dB.loadData();

        String country = JOptionPane.showInputDialog("Please input Country: ");
        String year = JOptionPane.showInputDialog("Please input year: ");
        dB.getData(country,year);
/*
        println(table.getColumnCount());
for(TableRow row: table.rows()){
String CountryName = row.getString("Country Name");


for(int i =1;i<117;i++){
    String year = row.getString(i);
    if( year.length()!=0)
println(table.getColumnTitle(i)+": "+year);

}}
*/
    }

    @Override
    public void draw() {

    }
}
