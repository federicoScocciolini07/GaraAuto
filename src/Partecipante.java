public class Partecipante implements Runnable {
    private String nome;
    private String password;
    private double velocita;
    private double distanzaPercorsa;

    public Partecipante(String nome, String password, double velocita) {
        this.nome = nome;
        this.password = password;
        this.velocita = velocita;
        this.distanzaPercorsa = 0;
    }

    @Override
    public void run() {
        muovi();
    }

    public void muovi() {
        distanzaPercorsa += velocita;
    }

    public String getNome() {
        return nome;
    }

    public double getDistanzaPercorsa() {
        return distanzaPercorsa;
    }
}
