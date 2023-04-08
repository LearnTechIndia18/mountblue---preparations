

import java.util.HashMap;

public class CityCapitals {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    String c=capitalCities.remove("England");
    System.out.println(capitalCities);
    String c2=capitalCities.get("Germany");
    int result=capitalCities.size();
    System.out.println(c2);
    System.out.println(c);
    System.out.println(result);
    for(String i:capitalCities.values())
    {
        System.out.println(i);
    }
    for(String i: capitalCities.keySet()){
        System.out.println("Key:"+i+" value:"+ capitalCities.get(i));
    }

  }
}

