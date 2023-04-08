
import java.util.HashMap;

public class People {
    public static void main(String[] args){
        // KeyPair values of different data
        HashMap<String, Integer> people=new HashMap<String, Integer>();
        people.put("Raja",23);
        people.put("Vamsi",24);
        people.put("Manikandan", 25);

        for(String i: people.keySet())
        {
            System.out.println("Key:"+i+" value: "+people.get(i));
        }
    }
}
