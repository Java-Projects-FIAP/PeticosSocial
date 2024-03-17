package Perfil;

import java.util.Random;

//email, senha, foto de perfi l, lista de amigos, lista de animais de estimação.
public class Usuario {
    private String nome;
    private String senha;
    private String fotoDePerfil;
    private int numAmigos = new Random().nextInt(1000);
    private String listaAmigos;
    private int numAnimais = new Random().nextInt(10);

    private String listaAnimais;



//GETS
    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
    public String getFotoDePerfil() {
        return fotoDePerfil;
    }

    public double getNumAmigos() {
        return numAmigos;
    }

    public double getNumAnimais() {
        return numAnimais;
    }

    //SETS
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }
}
