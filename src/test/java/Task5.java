import java.util.ArrayList;
import java.util.Iterator;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        for (String fruit:fruits){
            System.out.println(fruit);

            for (int i = 0; i< fruits.size(); i++){
                System.out.println(fruits.get(i));

                Iterator<String>iterator = fruits.iterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
             //5.   fruits.forEach(fruit1 -> System.out.println(fruit));
                fruits.forEach(System.out::println);
            }
        }
    }
}
