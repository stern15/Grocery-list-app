package list;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();


    public void addArrayListItem(String item){
        groceryList.add(item);

    }

    public void printArrayListItem(){
        System.out.println("you have "+groceryList.size()+" items in your grocery list");
        System.out.println();
       for (int i=0;i<groceryList.size();i++){
           System.out.println((i+1)+". is "+groceryList.get(i));
       }
    }
    public void changeArrayListItem(int position,String newItem){
        groceryList.set(position,newItem);
    }
    public void removeArrayListItem(int position){
        groceryList.remove(position);
    }

    public String searchArrayListItem(String searchItem){
        int position = groceryList.indexOf(searchItem);
        if(position>=0){
            return groceryList.get(position);
        }
        return null;
    }

}
