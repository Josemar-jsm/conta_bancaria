import  java.util.Scanner;
public class ContaBancaria {


    public static  void main(String[] args) {
        int operacaoDesejada=0;
        double saldoInicial = 3000.00;
        Scanner  leitura = new Scanner(System.in);
        System.out.println(getDadosIniciais());
        System.out.println(getOperacoesDesejadas());

        while(operacaoDesejada !=4){

            operacaoDesejada = leitura.nextInt();

            if(operacaoDesejada ==1){
                System.out.println("Seu saldo da Conta Corrente: "+saldoInicial);
                System.out.println(getOperacoesDesejadas());

            }
            if(operacaoDesejada ==2){
                System.out.println("Informe o valor recebido ?");
                operacaoDesejada = leitura.nextInt();
                saldoInicial += operacaoDesejada;
                System.out.println(getOperacoesDesejadas());
            }
            if(operacaoDesejada ==3){
                System.out.println("Informe o valor da transferência ?");
                operacaoDesejada = leitura.nextInt();
                saldoInicial -= operacaoDesejada;
                System.out.println(getOperacoesDesejadas());

            }



        }
    }

    private static String getDadosIniciais(){
        return "Dados iniciais do cliente:\n" +
                "\n" +
                "Nome: Pedro Silva\n" +
                "Tipo conta: Corrente\n" +
                "Saldo inicial: R$ 2500,00";

    }
    private static String getOperacoesDesejadas(){
        return "Operações\n" +
                "1- Consultar saldos\n" +
                "2- Receber valor\n" +
                "3- Transferir valor\n" +
                "4- Sair\n" +
                "\n" +
                "Digite a opção desejada:";


    }

}
