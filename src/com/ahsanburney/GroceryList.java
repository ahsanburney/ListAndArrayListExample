package com.ahsanburney;

import java.util.ArrayList;

/**
 * Created by Kulsum on 6/1/2017.
 */
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addgroceryItem(String item){
        groceryList.add(item);
    }

    public void printGrocery(){
        System.out.println("You have "+ groceryList.size() + " items in your grocery list");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+ "." +groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem,String newItem){
       int position = findItem(currentItem);
       if(position >= 0){
           modigyGroceryitem(position,newItem);
       }
    }

    private void modigyGroceryitem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item" + (position +1) + " has been modified." );
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(item );
        }

    }

    private void removeGroceryItem(int positiion){
        String theItem = groceryList.get(positiion);
        groceryList.remove(positiion);
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >=0){
            return true;
        }
        return false;
    }


}
