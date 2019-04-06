package br.com.digitalhouse;

public class Dono {

    private String nome;
    public String sexo;

    //construtor especifico, pq ele recebe parametros
    public Dono(String novoNome){
        nome = novoNome;
    }

    //construtores padrão
    public Dono(){

    }

    //metodo alimentar
    public void alimentar(Cachorro novoCachorro) {
        System.out.println("Ola!" + novoCachorro.nome);
    }

    //Get
    public String getNome() {
        return nome;
    }

    //Set
    public void setNome(String novoNome) {
        nome = novoNome;
    }


}
