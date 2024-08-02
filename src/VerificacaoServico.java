import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = "fixa"; //scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = "BOB,movel,tv"; //scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        for (int index = 0; index < partes.length; index++) {
            if(partes[index].equals("movel")){
              contratado = true;
            }
        }
        if (contratado) {
          System.out.println("Sim");
        }else{
          System.out.println("Nao");
        }

        scanner.close();
    }

}