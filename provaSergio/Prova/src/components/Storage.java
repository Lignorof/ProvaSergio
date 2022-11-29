package components;

public class Storage {
    float[] armazenados = {0, 0, 0, 0, 0, 0};
    Storage(){
    }

    FuncoesUsuais f = new FuncoesUsuais();
    void setArmazem(float result){
        if (f.simNao("Deseja armazenar o valor?")){
            int a = f.pegarInt(0,5,
                    "Deseja Guardar em qual Slot?\n" +
                            "[0] - SlotZ\n" +
                            "[1] - SlotX\n" +
                            "[2] - SlotC\n" +
                            "[3] - SlotV\n" +
                            "[4] - SlotB\n" +
                            "[5] - SlotN\n"
            );
            armazenados[a] = result;
        }
    }
    float getArmazem(String conta){
        String[] zxcvbn = {
                String.valueOf(armazenados[0]), String.valueOf(armazenados[1]), String.valueOf(armazenados[2]),
                String.valueOf(armazenados[3]), String.valueOf(armazenados[4]), String.valueOf(armazenados[5])};
        String[] ZXCVBN = {"Z", "X", "C", "V", "B", "N"};
        conta = conta.toUpperCase();
        for (int i = 0; i < ZXCVBN.length; i++) {
            conta = conta.replace(ZXCVBN[i], zxcvbn[i]);
        }
        return Float.parseFloat(conta);
    }
}
