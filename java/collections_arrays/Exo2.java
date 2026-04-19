package exo2;

import java.util.*;

public class Exo2 {
    public static void main(String[] args) {
        
        // --- 1. Declare and Initialise Collections ---
        
        // Liste de chaînes
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "apple", "banana"));
        
        // Set 
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30, 10, 20));
        
        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // --- 2. Manipulate Collections ---
        
        // Ajouter "date" à la liste
        list.add("date");
        
        // Essayer d'ajouter un doublon (30) au set
        set.add(30); // Ne fera rien car 30 existe déjà
        
        // Ajouter une nouvelle paire à la map
        map.put("date", 4);

        // --- 3. Traverse Collections ---
        
        System.out.println("--- Traversing List ---");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("\n--- Traversing Set (using Iterator) ---");
        Iterator<Integer> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

        System.out.println("\n--- Traversing Map ---");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // --- 4. Perform Operations on Collections ---
        
        // Trier la liste alphabétiquement
        Collections.sort(list);
        System.out.println("\nSorted List: " + list);

        // Calculer la somme des éléments du Set
        int sum = 0;
        for (int num : set) {
            sum += num;
        }
        System.out.println("Sum of Set elements: " + sum);

        // Vérifier si la map contient la clé "cherry"
        if (map.containsKey("cherry")) {
            System.out.println("Value for 'cherry': " + map.get("cherry"));
        }
    }
}