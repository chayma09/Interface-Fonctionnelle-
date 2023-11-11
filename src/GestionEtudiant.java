import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface GestionEtudiant {

    void afficherEtudiants(List<Etudiant> etudiants, Consumer<Etudiant> consumer);

    void afficherEtudiantSelonFiltre(List<Etudiant> etudiants, Predicate<Etudiant> predicate, Consumer<Etudiant> cons);

    String afficherNomEtudiant(List<Etudiant> etudiants, Function<Etudiant, String> f);

    Etudiant creeEtudiant(Supplier<Etudiant> supp);

    Stream<Etudiant> convertListStream(List<Etudiant> l);
}
