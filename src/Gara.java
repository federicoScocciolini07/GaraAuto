import java.awt.desktop.SystemEventListener;
import java.util.List;
import java.util.Scanner;

public class Gara {
    private List<Partecipante> partecipanti;
    private Percorso percorso;
    private Giudice giudice;
    private FileManager fileManager;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il numero dei partecipanti");
        int nPartecipanti = Integer.parseInt(scanner.nextLine());
        for (int = 0, i < 0)
        Gara g = new Gara()
    }

    public Gara(List<Partecipante> partecipanti, Percorso percorso, Giudice giudice, FileManager fileManager) {
        this.partecipanti = partecipanti;
        this.percorso = percorso;
        this.giudice = giudice;
        this.fileManager = fileManager;
    }

    public void avviaGara() {
        for (Partecipante p : partecipanti) {
            new Thread(p).start();
        }
    }
}
.