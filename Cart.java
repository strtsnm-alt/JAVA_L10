import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cart {

    private String name;
    
    List<List<Object>> l = new ArrayList<>();

    Cart(String name){
        this.name = name;
    }

    void addItem(String item, int price){
        for (List<Object> subList : l){
            if (subList.contains(item)){
                int currentQty = (Integer) subList.get(2);
                subList.set(2, currentQty + 1); 
                return;
            }
        }
        this.l.add(new ArrayList<>(Arrays.asList(item, price, 1)));
    }

    void addItem(String item){
        for (List<Object> subList : l){
            if (subList.contains(item)){
                int currentQty = (Integer) subList.get(2);
                subList.set(2, currentQty + 1); 
                return;
            }
        }
        System.out.println("Item " + item +" not present, add new entry with price");
    }

    void display(){
        System.out.println(name + ": ");
        for(int i=0; i< l.size(); i++){
            System.out.println("Item: " + l.get(i).get(0) + ", $" + l.get(i).get(1) + " (Qty: " + l.get(i).get(2) + ")");
        }
    }

    void sort(){
        l.sort((list1, list2) -> Integer.compare((Integer) list1.get(1), (Integer) list2.get(1)));
    }
}
