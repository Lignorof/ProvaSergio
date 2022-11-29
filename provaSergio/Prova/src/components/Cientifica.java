package components;

public class Cientifica extends Calculadora {
    // Calc científica é raiz quadrada x raiz y, x elevado y, sen, cos, tan, cotan, log,
    // fazer polimorfismo na raiz

     protected float potenciacao (float BasePot,float Expoente) {  //X elevado a Y
        double ValorPotenciacao = Math.pow(BasePot, Expoente);
         if (Expoente == 0)
             ValorPotenciacao = 1;
         System.out.println("Todo valor elevado a zero o resultado e 1\n");
         return (float) ValorPotenciacao;
    }

    protected float raiz (float radicando,float indice) {    // X raiz Y
        return (float) radicando * (1 / indice);
    }
    protected float raiz (float radicando) {    //tentativa mal sucedida de polimorfismo
         return (float) radicando * (1 / 2);    //TODO: fazer funcionar isso
    }
    protected float Seno (float graus) {        //  valor em graus
         double radianos = Math.toRadians(graus);    //converter para radianos
         double ValorSeno = Math.sin(radianos);      //math.sin so funciona em radianos
         return (float) ValorSeno;      // devolve valor do seno
    }
    protected float Cosseno (float graus) { //TODO: while para diminuir ate um numero menor que 360 e dai calcular
        double radianos = Math.toRadians(graus);
        double ValorCosseno = Math.cos(radianos);
        return (float) ValorCosseno;
    }
    protected float Tangente (float graus) {   //TODO: fazer um "if" para retornar quando o valor for 90 ou 270
        double radianos = Math.toRadians(graus);
        double ValorTangente = Math.tan(radianos);
        return (float) ValorTangente;
    }
    protected float Cotangente (float graus){
        double radianos = Math.toRadians(graus);
        double ValorCotangente = Math.pow(Math.tan(radianos), -1);
        return (float) ValorCotangente;
    }

    protected float Logaritmo (double logaritmando) {
        double ResultadoLog = Math.log10(logaritmando);
        return (float) ResultadoLog;
    }
}
