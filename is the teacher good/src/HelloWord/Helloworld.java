package HelloWord;

public class Helloworld {
    public static void main(String[] args) {
        // Variables des notes
        int[] notes_élèves = {15, 16, 30, 18, 17,};
        
        // Calcul de la somme des notes
        int somme_notes_élèves = 0;
        for (int valeur : notes_élèves) {
            somme_notes_élèves += valeur;
        }
        
        //calcul de la moyenne des notes
        int moyenne_des_notes = somme_notes_élèves / notes_élèves.length;

        // Affichage de la moyenne des notes
        System.out.println("Mean of notes = " + moyenne_des_notes);

        // Conseil si la moyenne des notes est bonne ou pas
        if (moyenne_des_notes > 15) {
            System.out.println("You have well teached the matter to your students.");
        } else if (moyenne_des_notes == 15) {
            System.out.println("You could have teached better, but it's still O.K.");
        } else {
            System.out.println("You haven't teached successfully enough the matter to your students.");
        }
    }
}

 