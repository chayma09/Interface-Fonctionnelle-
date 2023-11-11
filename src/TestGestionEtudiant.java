import java.util.ArrayList;
import java.util.List;

public class TestGestionEtudiant {

    public static void main(String[] args) {
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant(1, "Alicia", 20));
        etudiants.add(new Etudiant(2, "Bobo", 22));
        etudiants.add(new Etudiant(3, "Chaima", 21));

        GestionEtudiant gestionEtudiant = new ListEtudiant();


        gestionEtudiant.afficherEtudiants(etudiants, System.out::println);

        System.out.println("\nEtudiants selon le filtre d'âge :");
        gestionEtudiant.afficherEtudiantSelonFiltre(etudiants, etudiant -> etudiant.getAge() > 20, System.out::println);

        String noms = gestionEtudiant.afficherNomEtudiant(etudiants, Etudiant::getNom);
        System.out.println("\nNoms des étudiants : " + noms);

        Etudiant nouvelEtudiant = gestionEtudiant.creeEtudiant(() -> new Etudiant(4, "David", 23));
        System.out.println("\nNouvel étudiant créé : " + nouvelEtudiant);

        System.out.println("\nConversion de la liste en flux :");
        gestionEtudiant.convertListStream(etudiants).forEach(System.out::println);
    }
}
