import java.util.ArrayList;
import java.util.List;

public class Giudice {
    private List<Partecipante> classifica = new ArrayList<>();

    public void aggiornaClassifica(Partecipante p) {
        classifica.add(p);
    }

    public void visualizzaClassifica() {
        for (Partecipante p : classifica) {
            System.out.println(p.getNome() + " " + p.getDistanzaPercorsa());
        }
    }

    public List<Partecipante> getClassifica() {
        return classifica;
    }
}
