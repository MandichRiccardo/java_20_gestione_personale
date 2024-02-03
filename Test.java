import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Staff s = esecuzione(new Staff(), new Lavoratore[1]);
        System.out.println("lo stato finale dello staff è questo:\n" + s);
    }
    public static Lavoratore creaLavoratore(){
        Lavoratore l = null;
        System.out.println(
                """
                    che tipo di lavoratore vuoi creare?
                        premere 1 per un volontario
                        premere 2 per un dipendente
                        premere 3 per un dipendente giornaliero
                        premere 4 per un impiegato
                        """
        );
        switch (new Scanner(System.in).next()) {
            case "1" -> l = new Volontario();
            case "2" -> l = new Dipendente();
            case "3" -> l = new Giornaliero();
            case "4" -> l = new Impiegato();
            default -> System.out.println("inserire una delle opzioni richieste");

        }
        if(l != null) return l;
        else return creaLavoratore();
    }

    public static Staff esecuzione(Staff s, Lavoratore[] l){
        System.out.println("""
                cosa vuoi fare?
                    0)\tterminare il programma
                    1)\tcreare un nuovo lavoratore
                    2)\taggiungere un lavoratore allo staff
                    3)\trimuovere un lavoratore dallo staff
                    4)\tottenere una descrizione dello staff
                    5)\tcalcolare la paga di un membro dello staff
                    6)\tcalcolare la paga totale dello staff""");
        switch (new java.util.Scanner(System.in).nextInt()) {
            default -> {
                return s;
            }
            case 1 -> {
                int i=0;
                while (l[i]!=null){
                    if(i+1==l.length) l = incLength(l);
                    i++;
                }
                l[i] = creaLavoratore();
            }
            case 2 -> {
                for(Lavoratore i:l) System.out.println(i + "\n");
                System.out.println("quale di questi lavoratori vuoi inserire?\t(inizia a contare da 0)");
                try{
                    s.add(l[new java.util.Scanner(System.in).nextInt()]);
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("questo lavoratore non esiste");
                }
            }
            case 3 -> {
                for(Lavoratore i:l) System.out.println(i + "\n");
                System.out.println("quale di questi lavoratori vuoi inserire?\t(inizia a contare da 0)");
                try{
                    s.remove(l[new java.util.Scanner(System.in).nextInt()]);
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("questo lavoratore non esiste");
                }
            }
            case 4 -> System.out.println(s + "\n");
            case 5 -> {
                System.out.println(s);
                System.out.println("di che lavoratore vuoi la paga?\t(conta iniziando da 0)");
                try{
                    System.out.println("la paga è:\t" + s.getPaga(new java.util.Scanner(System.in).nextInt()));
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("questo lavoratore non esiste");
                }
            }
            case 6 -> System.out.println("la paga totale dello staff è:\t" + s.getPagaTotale());
        }
        return esecuzione(s, l);
    }
    public static Lavoratore[] incLength(Lavoratore[] oldArray){
        Lavoratore[] newArray = new Lavoratore[oldArray.length+1];
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        return newArray;
    }
}