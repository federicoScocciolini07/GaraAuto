import java.util.List;

public class FileManager {
    private String nomeFile;

    public FileManager(String nomeFile) {
        this.nomeFile = nomeFile;
    }

    public List<Partecipante> leggiPartecipanti() {
        return null;
    }

    public void salvaRisultati(List<Partecipante> lista) {
    }

    public void visualizzaClassifica(List<Partecipante> lista) {
        for (Partecipante p : lista) {
            System.out.println(p.getNome());
        }
    }
}
