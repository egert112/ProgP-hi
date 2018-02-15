package klassid;

public class Proov {
    public static void main(String[] arg){
        Pall p1=new Pall(3, 5, 1);
        Pall p2=new Pall(4, 6, 2);
        System.out.println(p1 + "Kaugus algkohast: "+p1.kaugusNullist());
        System.out.println(p2);
        System.out.println("Omavaheline kaugus: "+p1.kaugusPallist(p2));
    }
}
//kui kaugusPallist+... kui keskpunktide summa on väiksem, kui raadisute summa, siis puutuvad kokku