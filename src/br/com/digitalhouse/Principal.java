package br.com.digitalhouse;

public class Principal {

    public static void main(String[] args) {

        //instancia de um objeto, construtor padrão exemplo: Dono() e construtor especifico tem parametro(é obrigatorio
        //declarar como especifico na classe que chamou o metodo construtor
        Dono tairo = new Dono("Tairo");

        //construtor padrão
        Dono jessica = new Dono();

        tairo.getNome();
        System.out.println(tairo.getNome());

        tairo.setNome("João");
        System.out.println(tairo.getNome());

        tairo.sexo = "Masculino";
        System.out.println(tairo.sexo);

        Cachorro bidu = new Cachorro();
        bidu.nome = "Bidu";

        tairo.alimentar(bidu);


    }
}
