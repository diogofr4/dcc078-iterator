import java.util.Iterator;

public class Censo {
    public static Integer contarResidentesComCovidCasa(Casa casa){
        int qtd = 0;
        for (Residente residente : casa) {
            if (residente.contraiuCovid()) {
                qtd++;
            }
        }

        return qtd;
    }

    public static Integer contarTotalResidentesCasa(Casa casa) {
        int qtd = 0;
        for (Iterator a = casa.iterator(); a.hasNext(); ) {
            qtd++;
            a.next();
        }

        return qtd;
    }
}
