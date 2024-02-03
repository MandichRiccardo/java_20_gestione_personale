public class Volontario extends Lavoratore{
    private int mesiDiEsperienza;

    public Volontario(String nome, String indirizzo, String telefono, int mesiDiEsperienza) {
        super(nome, indirizzo, telefono);
        this.mesiDiEsperienza = mesiDiEsperienza;
    }

    public Volontario(){
        super();
        System.out.println("quanti mesi di esperienza ha " + nome + "?");
        this.mesiDiEsperienza = getInt();
    }

    @Override
    public String toString() {
        String info = super.toString();
        info += "\tmesi di esperienza:\t" + mesiDiEsperienza + "\n";
        return info;
    }
}