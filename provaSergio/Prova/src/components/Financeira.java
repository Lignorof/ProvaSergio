package components;

public class Financeira extends Calculadora {
//      A financeira será pedido juros simples, juros composto, valor referente, bônus: log para achar os juros.
//      JUROS SIMPLES:      jurosSimples    = capitalInicial * taxaJuros * tempo
//      JUROS COMPOSTOS:    jurosCompostos  = montante - capitalInicial
//                                            montante: (capitalInicial*(1+taxaDeJurosComposto)^n)
//    logJuros: n = log(Montante / capitalInicial) / log(1+taxaDeJurosComposto)
    float jurosSimples(float capitalInicial, float taxaDeJuros, float tempo){
        return capitalInicial * (taxaDeJuros/100) * tempo;
    }
    private float montante(float capitalInicial, float taxaDeJuros, float tempo){
        return (float) (capitalInicial*(Math.pow(1+(taxaDeJuros/100),tempo)));
    }
    float jurosCompostos(float capitalInicial, float taxaDeJuros, float tempo){
        return capitalInicial + montante(capitalInicial, taxaDeJuros, tempo);
    }
    float logJuros(float capitalInicial, float taxaDeJuros, float montante){
        return (float) (Math.log(montante/capitalInicial) / Math.log(1+taxaDeJuros));
    }
}
