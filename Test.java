public class Test{
    public static void main(String[] args) {
        Staff s = new Staff();
        Lavoratore l1 = creaLavoratore(), l2 = creaLavoratore(), l3 = creaLavoratore(), l4 = creaLavoratore(), l5 = creaLavoratore();
        System.out.println(s);
        s.add(l1);
        s.add(l2);
        s.add(l3);
        s.add(l4);
        s.add(l5);
        System.out.println(s);
        System.out.println("inserisci il numero relativo al lavoratore di cui vuoi conoscere la paga");
        try {
            System.out.println("la paga è " + s.getPaga(new java.util.Scanner(System.in).nextInt() - 1));
        }catch (NullPointerException | ArrayIndexOutOfBoundsException e){
            System.out.println("questo lavoratore non esiste");
        }
        System.out.println("la paga totale di questo staff è " + s.getPagaTotale());
    }
    public static Lavoratore creaLavoratore(){
        Lavoratore l = null;
        System.out.println(
                """
                    che tipo di lavoratore vuoi creare?
                        premere 0 per un lavoratore qualsiasi
                        premere 1 per un volontario
                        premere 2 per un dipendente
                        premere 3 per un dipendente giornaliero
                        premere 4 per un impiegato
                        """
        );
        switch (new java.util.Scanner(System.in).nextInt()) {
            case 0 -> l = new Lavoratore();
            case 1 -> l = new Volontario();
            case 2 -> l = new Dipendente();
            case 3 -> l = new Giornaliero();
            case 4 -> l = new Impiegato();
        }
        if(l != null) return l;
        else return creaLavoratore();
    }
}