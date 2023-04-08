import java.util.HashSet;
public class HashSetZ {
    public static void main(String[] args) {
        // It adds only the unique values in the sets
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("BMW");
        System.out.println(cars);
       boolean c= cars.contains("Mazda");
       System.out.println(c);
        System.out.println("\nIterated value:");
       for (String i : cars) {
        System.out.println(i);
      }

    }
}
