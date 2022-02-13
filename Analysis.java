import java.util.ArrayList;
import java.util.Arrays;

public class Analysis {

    public static void main(String[] args) {
        GetData dt = new GetData("ingredients v1.csv");
        System.out.println(dt);

        //TODO create a reference to the stations (get from db)
        ArrayList<Ingredients> ingredients = dt.getIngredients();

        //TODO determine and print how many stations exist for each network
        // Underground, Overground, DLR, Tfl Rail, Tramlink
        // Note: To make this easier, you can just print out the number 
        // of stations for one of the five networks.
        /*
        ArrayList<String> unique_names = new ArrayList<String>();
        for (Station s : stations)
        {
            if (!unique_names.contains(s.getNetwork()))
            {
               unique_names.add(s.getNetwork());
            }
        }
        System.out.println("Total # unique names = " + unique_names.size());
        System.out.println("Unique network names = " + unique_names);
        
        // Although we could have 5 separate variables keeping count of each
        // of the unique lines, let's just use one array of ints.
        // Each index of that array will correspond to the index of a 
        // network name in unique_names.
        int[] counts = new int[unique_names.size()]; 
        for (Station s: stations)
        {
          int i = 0;
          while (!s.getNetwork().equals(unique_names.get(i)))
          {
             i++;
          }
          counts[i]++;
        }
        for (int i = 0; i < unique_names.size(); i++)
        {
           System.out.println ("# of " + unique_names.get(i) + " stations = " + counts[i]);
        }

        //TODO build a list of stations associated with the Jubilee line
        ArrayList<String> jubilee = new ArrayList<String>();
        for (Station s : stations)
        {
            // Of course you could use the indexOf() we wrote
            // for arrays instead here.
            if ((Arrays.asList(s.getLines()).contains("Jubilee")))
            {
               // System.out.println(s.getName());
               jubilee.add(s.getName());               
            }
        }
        System.out.println("\nJubilee stations = " + jubilee);

        //TODO build a list of stations that are part of the DLR network
        // etc.
*/
        /***
         * Trivia Hunt
         *
         * Build, sort, merge, filter and query lists of stations to determine these and similar questions:
         *
         * How many stations consist of a single word?  (ie. Temple)
         * What is the easternmost station on the Underground network?  The southernmost?
         * Which is more popular as part of a station name -- Green or Park? (ie. Golders Green, Regent's Park)
         * Which is more popular, Road or Street? (ie. Finchley Road, Baker Street)
         * Which cardinal direction occurs most frequently in station names -- North, South, East or West?
         * How many stations "own" things?  (ie. St John's Wood)
         * List the stations that have ampersands. (ie. Finchley Road & Frognal)
         * Where is the "center" of the network?  (half the stations lie to the north/south, half to the east/west)
         * Additional questions that interest you
         */

    }

}
