import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GetData {

    private ArrayList<Ingredients> ingredients;
    private String dataSource;

    /**
     * Just a common getter method to access the list of stations
     *
     * @return
     */
    public ArrayList<Ingredients> getIngredients() {
        return ingredients; // IRL problematic but okay for CSA exam
    }

    /**
     * Transforms the contents of a text file into an arraylist of strings.
     *
     * @param fileName the file to read from
     * @return the resulting arraylist; null, if encounter errors
     */
    private ArrayList<String> readFromFile(String fileName) {
        ArrayList<String> data = null;
        try {
            data = (ArrayList<String>) Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            System.out.println("The file " + fileName + " could not be opened.");
            e.printStackTrace();
        }
        return data;
    }

    /**
     * Splits a string on commas but keeps intact any commas that have been directly quoted.
     * Ex. "1, 2, 3, "4, 5, 6", 7, 8" (contains internal pair of quotes)
     * Splits into ["1", "2", "3", "4, 5, 6", "7", "8"] (does not split at quoted commas)
     *
     * @return array of strings where quoted commas are intact
     */
    private String[] splitRespectingQuotes(String hasCommasWithinQuotes) {
        return hasCommasWithinQuotes.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
    }

    @Override
    public String toString() {
        return "Database built from source " + dataSource;
    }

    public GetData(String dataSource) {
        this.dataSource = dataSource;
        // TODO initialize the field stations to an empty arraylist
        ingredients = new ArrayList<Ingredients>();
        // TODO use the helper method readFromFile to create a list of all rows in the .csv
        ArrayList<String> data = readFromFile(dataSource);
        // TODO for each string in the list of strings (except the first)
        boolean skipFirst = true;
        
        // You could also have just used a regular for loop and
        // started it at index 1.
        for (String s : data)
        {
              if (skipFirst)
              {
                  skipFirst = false;
              }
              else
              {
                 // TODO use the string to create a new Station
                 // TODO add the newly constructed station to stations
                 ingredients.add(new Ingredients(s));
              }                
        }
    }
    
}
