public class Lavoratore{
    protected String nome;
    protected String indirizzo;
    protected String telefono;

    public Lavoratore(String nome, String indirizzo, String telefono) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
    }

    public Lavoratore() {
        System.out.println("inserisci il nome di questo lavoratore");
        this.nome = new java.util.Scanner(System.in).nextLine();
        System.out.println("inserisci l'indirizzo di " + nome);
        this.indirizzo = new java.util.Scanner(System.in).nextLine();
        System.out.println("inserisci il numero di telefono di " + nome);
        this.telefono = new java.util.Scanner(System.in).nextLine();
    }

    public double calcolaPaga(){
        return 0;
    }

    public String toString(){
        String info = "";
        info += "\tnome:\t\t\t\t" + nome + "\n";
        info += "\tindirizzo:\t\t\t" + indirizzo + "\n";
        info += "\ttelefono:\t\t\t" + telefono + "\n";
        return info;
    }
}