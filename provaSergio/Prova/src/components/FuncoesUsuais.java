package components;

import java.util.Scanner;


public class FuncoesUsuais {
    Scanner scan = new Scanner(System.in);

    String txtGenerico;

    FuncoesUsuais(String txt){
        this.txtGenerico = txt;
    }

    FuncoesUsuais(){
        this.txtGenerico = "Digite ";
    }




    int pegarInt() {

        int nume;

        String pergunta = this.txtGenerico + "um número: ";

        String txtNume;

        while(true) {
            try {
                System.out.println(pergunta);
                txtNume = scan.next();
                nume = Integer.parseInt(txtNume);
                return nume;
            } catch (Exception e) {
                System.out.println("O valor precisa ser inteiro.");
            }
        }
    }
    int pegarInt(String pergunta) {
        int nume;

        String txtNume;


        while(true) {
            try {
                System.out.println(pergunta);
                txtNume = scan.next();
                nume = Integer.parseInt(txtNume);

                return nume;
            } catch (Exception e) {
                System.out.println("O valor precisa ser inteiro.");
            }
        }
    }

    int pegarInt(boolean maiorQueZero) {

        int nume;

        String pergunta = this.txtGenerico + "um número: ";
        String txtNume;


        while(true) {
            try {
                System.out.println(pergunta);
                txtNume = scan.next();
                nume = Integer.parseInt(txtNume);

                if (nume < 0) {
                     System.out.printf("O número deve ser maior que [%d].", 0);
                     continue;
                }

                return nume;
            } catch (Exception e) {
                System.out.println("O valor precisa ser inteiro.");
            }
        }
    }
    int pegarInt(boolean maiorQueZero, String pergunta) {
        int nume;

        String txtNume;


        while(true) {
            try {
                System.out.println(pergunta);
                txtNume = scan.next();
                nume = Integer.parseInt(txtNume);

                if (nume < 0) {
                    System.out.printf("O número deve ser maior que [%d].", 0);
                    continue;
                }

                return nume;
            } catch (Exception e) {
                System.out.println("O valor precisa ser inteiro.");
            }
        }
    }
//    int pegarInt(int inicio, String pergunta) {
//        int fim=-1;
//        int nume;
//
//        String txtNume;
//
//        while(true) {
//            try {
//                System.out.println(pergunta);
//                txtNume = scan.next();
//                nume = Integer.parseInt(txtNume);
//
//                if (inicio > fim) {
//                    if (nume <= inicio) {
//                        System.out.printf("O número deve ser maior que [%d].", inicio);
//                        continue;
//                    }
//                } else if (inicio < fim) {
//                    if (!((inicio <= nume) && (nume <= fim))) {
//                        System.out.printf("O número deve ser maior ou igual que [%d], e menor ou igual que [%d].", inicio, fim);
//                        continue;
//                    }
//                }
//                return nume;
//            } catch (Exception e) {
//                System.out.println("O valor precisa ser inteiro.");
//            }
//        }
//    }
    int pegarInt(int inicio, int fim) {
        int nume;

        String pergunta=this.txtGenerico + "um número: ";
        String txtNume;

        while(true) {
            try {
                System.out.println(pergunta);
                txtNume = scan.next();
                nume = Integer.parseInt(txtNume);

                if (inicio > fim) {
                    if (nume <= inicio) {
                        System.out.printf("O número deve ser maior que [%d].", inicio);
                        continue;
                    }
                } else if (inicio < fim) {
                    if (!((inicio <= nume) && (nume <= fim))) {
                        System.out.printf("O número deve ser maior ou igual que [%d], e menor ou igual que [%d].", inicio, fim);
                        continue;
                    }
                }
                return nume;
            } catch (Exception e) {
                System.out.println("O valor precisa ser inteiro.");
            }
        }
    }

    int pegarInt(int inicio, int fim, String pergunta) {
        int nume;
        String txtNume;

        while(true) {
            try {
                System.out.println(pergunta);
                txtNume = scan.next();
                nume = Integer.parseInt(txtNume);

                if (inicio > fim) {
                    if (nume <= inicio) {
                        System.out.printf("O número deve ser maior que [%d].", inicio);
                        continue;
                    }
                } else if (inicio < fim) {
                    if (!((inicio <= nume) && (nume <= fim))) {
                        System.out.printf("O número deve ser maior ou igual que [%d], e menor ou igual que [%d].", inicio, fim);
                        continue;
                    }
                }
                return nume;
            } catch (Exception e) {
                System.out.println("O valor precisa ser inteiro.");
            }
        }
    }
//  ---------------------------------PEGAR FLOAT---------------------------------
    float pegarFloat() {
        float nume;

        String pergunta = this.txtGenerico + "um número: ";

        String txtNume;

        while(true) {
            try {
                System.out.println(pergunta);
                txtNume = scan.next().replace(",",".");
                nume = Float.parseFloat(txtNume);
                return nume;
            } catch (Exception e) {
                System.out.println("O valor precisa ser inteiro.");
            }
        }
    }

    float pegarFloat(String pergunta) {
        float nume;

        String txtNume;


        while(true) {
            try {
                System.out.println(pergunta);
                txtNume = scan.next().replace(",",".");
                nume = Float.parseFloat(txtNume);
                return nume;
            } catch (Exception e) {
                System.out.println("O valor precisa ser inteiro.");
            }
        }
    }

    float pegarfloat(boolean maiorQueZero) {

        float nume;

        String pergunta = this.txtGenerico + "um número: ";
        String txtNume;


        while(true) {
            try {
                System.out.println(pergunta);
                txtNume = scan.next().replace(",",".");
                nume = Float.parseFloat(txtNume);
                if (nume < 0) {
                    System.out.printf("O número deve ser maior que [%d].", 0);
                    continue;
                }

                return nume;
            } catch (Exception e) {
                System.out.println("O valor precisa ser inteiro.");
            }
        }
    }
    float pegarfloat(boolean maiorQueZero, String pergunta) {
        float nume;

        String txtNume;


        while(true) {
            try {
                System.out.println(pergunta);
                txtNume = scan.next().replace(",",".");
                nume = Float.parseFloat(txtNume);

                if (nume < 0) {
                    System.out.printf("O número deve ser maior que [%d].", 0);
                    continue;
                }

                return nume;
            } catch (Exception e) {
                System.out.println("O valor precisa ser inteiro.");
            }
        }
    }

    float pegarfloat(float inicio, float fim) {
        float nume;

        String pergunta=this.txtGenerico + "um número: ";
        String txtNume;

        while(true) {
            try {
                System.out.println(pergunta);
                txtNume = scan.next().replace(",",".");
                nume = Float.parseFloat(txtNume);
                if (inicio < fim) {
                    if (!((inicio <= nume) && (nume <= fim))) {
                        System.out.printf("O número deve ser maior ou igual que [%.2f], e menor ou igual que [%.2f].", inicio, fim);
                        continue;
                    }
                }
                return nume;
            } catch (Exception e) {
                System.out.println("O valor precisa ser inteiro.");
            }
        }
    }

    float pegarFloat(float inicio, float fim, String pergunta) {
        float nume;
        String txtNume;

        while(true) {
            try {
                System.out.println(pergunta);
                txtNume = scan.next().replace(",",".");
                nume = Float.parseFloat(txtNume);
                if (inicio < fim) {
                    if (!((inicio <= nume) && (nume <= fim))) {
                        System.out.printf("O número deve ser maior ou igual que [%.2f], e menor ou igual que [%.2f].", inicio, fim);
                        continue;
                    }
                }
                return nume;
            } catch (Exception e) {
                System.out.println("O valor precisa ser inteiro.");
            }
        }
    }

    boolean simNao() {
        String pergunta = "Aceita?";
        String sn;
        while (true) {
            System.out.println(pergunta + "\n[S] - Sim\n[N] - Não");
            sn = this.strComLimite(1, "");
            if (sn.equalsIgnoreCase("S")) {
                return true;
            } else if (sn.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("A resposta deve ser 'S' ou 'N'");
            }
        }
    }boolean simNao(String pergunta) {
        String sn;
        while (true) {
            System.out.println(pergunta + "\n[S] - Sim\n[N] - Não");
            sn = this.strComLimite(1, "");
            if (sn.equalsIgnoreCase("S")) {
                return true;
            } else if (sn.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("A resposta deve ser 'S' ou 'N'");
            }
        }
    }
    String pegarStr() {
        String pergunta = this.txtGenerico + "algo: ";
        System.out.println(pergunta);
        return scan.next();
    }
    String pegarStr(String pergunta) {
        System.out.println(pergunta);
        return scan.next();
    }

    String strComLimite(int lim) {
        String pergunta = this.txtGenerico + "algo: ";
        while (true) {
            System.out.println(pergunta);
            String resposta = scan.next();
            if (lim < resposta.length()) {
                System.out.printf("Você escreveu mais do que [%d] caracteres",lim);
                continue;
            }
            return resposta;
        }
    }
    String strComLimite(int lim, String pergunta) {
        while (true) {
            System.out.println(pergunta);
            String resposta = scan.next();
            if (lim < resposta.length()) {
                System.out.printf("Você escreveu mais do que [%d] caracteres",lim);
                continue;
            }
            return resposta;
        }
    }
}
