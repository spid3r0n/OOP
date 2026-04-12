package TP7;

import java.util.Arrays;

public class exo1 {
    public static void main(String[] args) {    
    int[] tab = new int[10];  

    for (int i = 0 ; i < tab.length ; i++){
        tab[i] = (int) (Math.random() * 100); 
    }

    traversal(tab);
    System.out.println("\nthe copy : ");
    int[] copy = copy(tab);
    traversal(copy);
    System.out.println("\nthe sorted copy : ");
    int[] sorted = sort(tab);
    traversal(sorted);
    System.out.println();
    search(sorted   , 39);           


}

    public static void traversal(int[] tab) {
        for (int i = 0 ; i < tab.length ; i++){
            System.out.print(tab[i] + "-" );
        }
    }
    public static int[] copy(int[] tab){
        int[] copy = new int[tab.length];
        System.arraycopy(tab, 0, copy, 0, tab.length);
        return copy;
    }
    public static int[] sort(int[] tab){
        Arrays.sort(tab);
        return tab;
                }
            
         public static void search(int[] tab, int value){
        int index = Arrays.binarySearch(tab, value);
        if (index >= 0){
            System.out.println("value found at index : " + index);
        } else {
            System.out.println("value not found");
        }
    }

}
