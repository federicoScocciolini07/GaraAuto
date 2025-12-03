import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Gara {
    private List<Partecipante> partecipanti;
    private Percorso percorso;
    private Giudice giudice;
    private GestoreFile gestoreFile;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero dei partecipanti:");
        int nPartecipanti = Integer.parseInt(scanner.nextLine());

        List<Partecipante> partecipanti = new ArrayList<>();
        for (int i = 0; i < nPartecipanti; i++) {
            System.out.println("Inserisci il nome del partecipante " + (i + 1) + ":");
            String nome = scanner.nextLine();
            partecipanti.add(new Partecipante(nome));
        }

        
    
        Percorso percorso = new Percorso();
        Giudice giudice = new Giudice();
        GestoreFile gestoreFile = new GestoreFile();

        Gara gara = new Gara(partecipanti, percorso, giudice, gestoreFile);
        gara.avviaGara();
    }

    public Gara(List<Partecipante> partecipanti, Percorso percorso, Giudice giudice, GestoreFile gestoreFile) {
        this.partecipanti = partecipanti;
        this.percorso = percorso;
        this.giudice = giudice;
        this.gestoreFile = gestoreFile;
    }

    public void avviaGara() {
        for (Partecipante p : partecipanti) {
            new Thread(p).start();
        }
    }
}
