import java.util.InputMismatchException;

public class Dipendente extends Lavoratore{
    protected String codiceFiscale;
    protected double retribuzioneDiBase;

    public Dipendente(String nome, String indirizzo, String telefono, String codiceFiscale, int retribuzioneDiBase) {
        super(nome, indirizzo, telefono);
        this.codiceFiscale = codiceFiscale;
        this.retribuzioneDiBase = retribuzioneDiBase;
    }

    public Dipendente() {
        super();
        System.out.println("inserisci il codice fiscale di " + nome);
        this.codiceFiscale = new java.util.Scanner(System.in).nextLine();
        System.out.println("inserisci la retribuzione di base di " + nome);
        this.retribuzioneDiBase = getRetribuzione();
    }

    private double getRetribuzione(){
        try{
            return new java.util.Scanner(System.in).nextDouble();
        }catch (InputMismatchException e){
            System.out.println("devi inserire un numero");
            return getRetribuzione();
        }
    }

    @Override
    public double calcolaPaga() {
        return retribuzioneDiBase;
    }

    @Override
    public String toString() {
        String info = super.toString();
        info += "\tcodice fiscale:\t" + codiceFiscale + "\n";
        info += "\tretribuzione:\t\t" + retribuzioneDiBase + "\n";
        return info;
    }
}