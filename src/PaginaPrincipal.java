import Perfil.Usuario;

import java.util.Scanner;

public class PaginaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("Digite seu nome de usuário:");
        usuario.setNome(scanner.next());
        usuario.getNome();
        System.out.println("Digite sua senha para acessar seu perfil:");
        usuario.setSenha(scanner.next());
        usuario.getSenha();
        System.out.println("\n***********************************************");

        System.out.println("\nPerfil acessado!");
        System.out.println("Nome do usuário: "+ usuario.getNome());
        System.out.println("\n***********************************************");

        System.out.println(usuario.getNome());
        System.out.printf(String.format("Número de Amigos: %.0f" , usuario.getNumAmigos()));
        System.out.printf(String.format("\nNúmero de Animais: %.0f" ,usuario.getNumAnimais()));
        //criar perfi s para seus bichinhos, adicionar amigos, compartilhar fotos e interagir unscom os outros.
        System.out.println("O que deseja fazer na Peticos hoje?");
        System.out.println("1 - Criar perfil para seu pet");
        System.out.println("2 - Adicionar amigos");
        System.out.println("3 - Compartilhar fotos");
        System.out.println("4 - Apenas explorar e interagir");

        int resposta = scanner.nextInt();
        switch (resposta){
            case 1:
                System.out.println("Quantos animais deseja adicionar");

        }

    }



}
