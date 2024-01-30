public class Impiegato extends Dipendente{
    private int bonus;

    public Impiegato(String nome, String indirizzo, String telefono, String codiceFiscale, int retribuzioneDiBase, int bonus) {
        super(nome, indirizzo, telefono, codiceFiscale, retribuzioneDiBase);
        this.bonus = bonus;
    }

    public Impiegato() {
        super();
        System.out.println("inserisci il bonus maturato di " + nome);
        this.bonus = new java.util.Scanner(System.in).nextInt();
    }

    @Override
    public double calcolaPaga() {
        return retribuzioneDiBase + bonus;
    }

    @Override
    public String toString() {
        String info = super.toString();
        info += "\tbonus maturati:\t" + bonus + "\n";
        return info;
    }
}