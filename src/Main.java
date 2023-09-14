import java.util.Scanner;

public class Main { public static void main(String[] args) {
    System.out.println("=====Bem Vindo ao Sistema de veiculos=====\r\n" +
            "digite os dados do veiculo para começar:\r\n" +
            "1. Cadastrar veiculos\r\n");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Primeiro, digite o nome do veiculo:");
    var nome = scanner.nextLine();
    System.out.println("Agora, digite a marca do veiculo: ");
    var marca = scanner.nextLine();
    System.out.println("Digite o modelo do veiculo: ");
    var modelo = scanner.nextLine();
    System.out.println("Agora, digite o ano de fabricaçao:");
    var fabricacao = scanner.nextInt();

    var cadastrado = true;
    System.out.println(" Nome: "+ nome + "\r\n, Marca:" + marca + "\r\n,Modelo: " + modelo +  "\r\n,Ano de fabricaçao: " + fabricacao + "\r\n,Ele esta cadastrado: " + cadastrado);
}
}