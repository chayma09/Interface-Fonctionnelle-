import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ListEtudiant implements GestionEtudiant {

    @Override
    public void afficherEtudiants(List<Etudiant> etudiants, Consumer<Etudiant> consumer) {
        etudiants.forEach(consumer);
    }

    @Override
    public void afficherEtudiantSelonFiltre(List<Etudiant> etudiants, Predicate<Etudiant> predicate, Consumer<Etudiant> cons) {
        etudiants.stream().filter(predicate).forEach(cons);
    }

    @Override
    public String afficherNomEtudiant(List<Etudiant> etudiants, Function<Etudiant, String> f) {
        StringBuilder result = new StringBuilder();
        etudiants.forEach(etudiant -> result.append(f.apply(etudiant)).append(", "));
        return result.toString();
    }

    @Override
    public Etudiant creeEtudiant(Supplier<Etudiant> supp) {
        return supp.get();
    }

    @Override
    public Stream<Etudiant> convertListStream(List<Etudiant> l) {
        return l.stream();
    }
}
