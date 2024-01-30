public class Giornaliero extends Dipendente{
    private int giorni;

    public Giornaliero(String nome, String indirizzo, String telefono, String codiceFiscale, int retribuzioneDiBase, int giorni) {
        super(nome, indirizzo, telefono, codiceFiscale, retribuzioneDiBase);
        this.giorni = giorni;
    }

    public Giornaliero() {
        super();
        System.out.println("inserisci i giorni lavorativi di " + nome);
        this.giorni = new java.util.Scanner(System.in).nextInt();
    }

    @Override
    public double calcolaPaga() {
        return retribuzioneDiBase*giorni;
    }

    @Override
    public String toString() {
        String info = super.toString();
        info += "\tgiorni lavorativi:\t" + giorni + "\n";
        return info;
    }
}