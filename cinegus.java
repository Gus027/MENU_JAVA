package cinegus;
import java.util.Scanner;

public class cinegus {


    public static void main(String[] args){
        Scanner tcl = new Scanner(System.in);
        //Variaveis
        int entrada=0;
        int sim=0;
        int nao=0;
        int sim_nao=0;
        int choise=0;
        int buy=0;
        int cred =0;
        int debt =0;
        while(entrada<100) {
            System.out.println("BEM VINDO AO CINEGUS, GOSTARIA DE VÊ OS FILMES DA SEMANA?");
            System.out.println("Insira 1 para [SIM] e 0 para [NÃO]: ");
            sim_nao = tcl.nextInt();
            if(sim_nao !=1 && sim_nao !=0){
                System.out.println("ERROR NA VALIDAÇÃO DE DADOS- DIGITE SOMENTE 1 OU 0");
                break;
            }
            else if(sim_nao == 1){
                sim +=1;
                System.out.println("OTIMO, ESSES SÃO OS FILMES DO MÊS:\\n1 -Club da lut\\n2 - A era do gelo 3\\n3 - American Psycho\\n4 - Dragon ball Super: Broly ");
            }
            else if(sim_nao == 0){
                System.out.println("OBRIGADO POR VIM");
                break;
            }
            System.out.println("INSIRA A NUMERAÇÃO DO FILME QUE IRÁ ASSISTIR: ");
            choise = tcl.nextInt();
            if(choise < 1 || choise > 5){
                System.out.println("ERROR: Somente 1 a 4");
                break;
            }
             else{
                if(choise == 1){
                    System.out.println("VOCE ESCOLHEU: CLUB DA LUTA");
                }
                else if(choise == 2){
                    System.out.println("VOCE ESCOLHEU: A ERA DO GELO 3");
                }
                else if(choise == 3){
                    System.out.println("VOCE ESCOLHEU: AMERICAN PSYCHO");
                }
                else{
                    System.out.println("VVOCE ESCOLHEU: DRAGON BALL SUPER: BROLY");
                }
            }
            System.out.println("Formas de pagamento.\\n1 - Cartão de Credito.\\n2 - Cartão de Debito.\\n3 - PIX.\\n4 - Dinheiro.");
            System.out.println("Insira a forma de pagamento: ");
            buy = tcl.nextInt();
            if(buy < 1 || buy > 4){
                System.out.println("ERROR NA VALIDAÇÃO DE PAGAMENTO.");
            }
             else{
                if(buy == 1){
                    System.out.println("CARTÃO DE CREDITO selecionado");
                    System.out.println("DIGITE A SENHA: ");
                    cred = tcl.nextInt();
                    if(cred<1000){
                        System.out.println("SENHA invalida.");
                    }
                    else{
                        System.out.println("PAGAMENTO EFETUADO COM SUCESSO.\nBOM FIME =D");
                        break;
                    }
                }
                else if(buy == 2){
                    System.out.println("CARTAO DE DEBITO selecioando.");
                    System.out.println("DIGITE A SENHA: ");
                    debt = tcl.nextInt();
                    if(debt<1000){
                        System.out.println("ERRO NA DIGITAÇÃO DA SENHA.");
                    }
                    else{
                        System.out.println("PAGAMENTO EFETUADO COM SUCESSO.\\nBOM FILME =D");
                        break;
                    }
                }
                else if(buy == 3){
                    System.out.println("PIX selecionado.\\nGerando CNPJ: 23.124.531/0001-90");
                }
                else if(buy == 4){
                    System.out.println("DINHEIRO.\nPAGUE NO CAIXA.");
                }
            }
        }
    }
}
