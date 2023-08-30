public class Turista {
    //atributos
    private String nome;
    private String cpf;

    //metodos
    public String viajar(){
        return "Viajando...";
    }
     // construtor padrao
    Turista(){


    }
    //sobrecarga do construtor personalizado
    Turista(String _nome){
       this.nome = _nome;
    }
    //encapsulamento - getterns e setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
