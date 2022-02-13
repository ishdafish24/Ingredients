import java.util.Arrays;

public class Ingredients {
	
	private String id;
	private String asins;
   private String[] categories;
   private String dateAdded;
   private String dataUpdated;
   private String ean;
   private String key;
   private String[] ingredients;
   private int manufacturerNumber;
   private String manufactuerName;
   private String name;
   private String size;
   private String upc;
   private String weight;

	
   private static String[] splitRespectingQuotes(String hasCommasWithinQuotes) {
        return hasCommasWithinQuotes.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
   }

	/** 
	 * Constructs a Station from formatted data
	 * 
	 * @param s comma delimited string holding the information
	 */
	public Ingredients(String s) {
		//TODO implement the constructor
      // Data format
      // FID,OBJECTID,NAME,EASTING,NORTHING,LINES,NETWORK,Zone,x,y
      // id, asins, brand, categories, dateUpdated, ean, type, ingredients, manufactuer, name, sizes, upc, weight
      String[] information = splitRespectingQuotes(s);
      name = information[10];
      weight = information[12];
      // The lines could be formatted as:
      // "District, Circle"
      // or just
      // District
      String ingredientsInfo = information[10];
      // Remove double quotes if there are any. Assume it's well formed
      // and there's one at the beginning and one at the end.
      if (ingredientsInfo.indexOf("\"") == 0)
      {
         ingredientsInfo = ingredientsInfo.substring(1, ingredientsInfo.length() - 1);                     
      }
      ingredients = Ingredients.splitRespectingQuotes(ingredientsInfo);
      // zone = Integer.parseInt(info[7]);
      // lat = Double.parseDouble(info[8]);
      // lon = Double.parseDouble(info[9]);
   }


	public String toString() {
		return name + ", " + weight;
	}
	
	// nothing to do below -- just common getters
	
	public String getName() {
		return name;
	}
	public String[] getIngredients() {
		return ingredients;
	}
	public String getWeight() {
		return weight;
	}
   /*
	public int getZone() {
		return zone;
	}
	public double getLat() {
		return lat;
	}
	public double getLon() {
		return lon;
	}
	*/
    public static void main(String[] args) 
    {
      // Little tester main just for the Station class
      Ingredients s = new Ingredients("AVpgPmxs1cnluZ0-ypMt, B004SIB1YY,B00DM2SGBI, Simply Asia, Grocery & Gourmet Food,Grocery, 2014-02-18T01:53:26Z,2017-07-20T22:20:10Z,8.54285E+11,Ingredients, Noodles: wheat flour,water,wheat gluten,modified tapioca starch,salt,sodium alginate,lactic acid. Sauce packet: sugar,water,soy sauce (water, soybean, wheat, salt),plum sauce (plum juice, sugar, plum, water, licorice extract, citric acid, sodium citrate, salt, xanthan gum, caramel color),rice vinegar,pineapple juice concentrate,salt,hydrolyzed soy protein,tomato paste,modified corn starch,orange juice concentrate,onion,yeast extract,red chili pepper. Vegetable packet: ...,Simply Asia,900034971,Simply Asia Noodle Bowl Mandarin Orange -- 8.5 oz,,8.54285E+11,3.4 pounds");
      System.out.println(Arrays.toString(s.getIngredients()));
    }

}
	
	
	