public class Staff{
    private Lavoratore[] team;

    public Staff(int numeroMembri) {
        this.team = new Lavoratore[numeroMembri];
    }

    public Staff() {
        System.out.println("inserisci il numero dei membri di questo team");
        team = new Lavoratore[new java.util.Scanner(System.in).nextInt()];
    }

    public boolean add(Lavoratore l){
        if(contains(l)) return false;
        int i=0;
        while(i<team.length && team[i] != null) i++;
        if(i<team.length) team[i] = l;
        return i<team.length;
    }

    public boolean remove(Lavoratore l){
        if(!contains(l)) return false;
        int i=0;
        while(i<team.length && team[i] != l) i++;
        team[i] = null;
        return true;
    }

    public boolean contains(Lavoratore o){
        for(Lavoratore l:team){
            if(l==o) return true;
        }
        return false;
    }

    public double getPaga(int i) {
        return team[i].calcolaPaga();
    }

    public double getPagaTotale(){
        double paga = 0;
        for(int i=0;i< team.length;i++){
            try {
                paga += getPaga(i);
            }
            catch (NullPointerException e){
                paga += 0;
            }
        }
        return paga;
    }

    public String toString(){
        String info = "";
        for(int i=0;i<team.length;i++){
            info = info.concat("lavoratore " + (i+1) + ":\n" + team[i] + "\n");
        }
        info += "\nmembri:\t\t\t" + team.length;
        return info;
    }
}