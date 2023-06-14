import com.sun.jdi.IntegerValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {

void parseDishata() throws IOException{
    BufferedReader dishReader = Files.newBufferedReader(Paths.get("C:\Users\amitk\IdeaProjects\shardaSwiggy\data\dish.csv"));
    String line;

    for( int dishCntr =0;(line= dishReader.readLine()) !=null; dishCntr++){
        String[] dishData = line.split(",");
        dishList.add(dishCntr, new Dish(dishData[0],dishData[1],dishData[2], Integer.valueOf(dishData[3])));
    }
}
}
