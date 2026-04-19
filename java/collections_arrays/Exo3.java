package exo3;
import java.util.*; 

public class Exo3 {
    public static void main(String[] args) {


        // declarer un ensemble d'entiers et initialiser avec des valeurs
        Set<Integer> intSet = new HashSet<>(Arrays.asList(10, 50,  30, 10, 20));
   
        // declarer un ensemble de chaînes et initialiser avec des valeurs
        Set<String> stringSet = new TreeSet<>(Arrays.asList( "banana","apple", "cherry", "apple", "banana"));

        // essayer d'ajouter des doublons
        boolean isAddedInt = intSet.add(20); // Déjà présent
        boolean isAddedString = stringSet.add("banana"); // Déjà présent
        
        System.out.println("Ajout de 20 (doublon) : " + isAddedInt);
        System.out.println("Ajout de 'banana' (doublon) : " + isAddedString);

        // supprimer des éléments spécifiques
        intSet.remove(10);
        stringSet.remove("cherry");

        // parcourir les ensembles avec un itérateur
        System.out.println("\n--- Traversing Integer HashSet (using Iterator) ---");
        Iterator<Integer> intIterator = intSet.iterator();
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        System.out.println("\n--- Traversing String TreeSet (using Iterator) ---");
        Iterator<String> stringIterator = stringSet.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        // observer les différences d'ordre et les méthodes spécifiques
        System.out.println("\n--- Observations & Specific Methods ---");
        
        // Différence d'ordre
        System.out.println("Contenu du HashSet (Entiers) : " + intSet); 
        // Note : L'ordre peut paraître logique pour des petits entiers, mais il n'est pas garanti.
        
        System.out.println("Contenu du TreeSet (Strings) : " + stringSet);
        // Note : Le TreeSet est toujours trié par ordre alphabétique.

        // Méthodes spécifiques au TreeSet (first() et last())
        // On doit utiliser le type TreeSet (pas Set) pour y accéder
        System.out.println("TreeSet First: " + ((TreeSet<String>)stringSet).first());
        System.out.println("TreeSet Last: " + ((TreeSet<String>)stringSet).last());
   
   
   
   
   
    }
}
