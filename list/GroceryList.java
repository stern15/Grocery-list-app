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
    public void changeArrayListItem(String currentItem,String newItem){
        int positionCurrItem = searchArrayListItem(currentItem);
        if(positionCurrItem>=0){
            changeArrayListItem(positionCurrItem,newItem);
        }
    }
    private void changeArrayListItem(int position,String newItem){
        groceryList.set(position,newItem);
    }
    public void removeArrayListItem(String item){
        int position = searchArrayListItem(item);
        if(position>=0){
            removeArrayListItem(position);
        }
    }
    private void removeArrayListItem(int position){
        groceryList.remove(position);
    }
    public boolean searchItem(String searchItem){
        int positionItem = searchArrayListItem(searchItem);
        if (positionItem>=0){
            return true;
        }
        else return false;
    }

    private int searchArrayListItem(String searchItem){
        int positionItem = groceryList.indexOf(searchItem);
        return positionItem;

    }

}
