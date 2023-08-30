public class Main {
    public static void main(String[] args) {
        //classe objeto   construtor
        Turista mochileiro = new Turista();
       //definir formato do objeto
        mochileiro.setNome("lindsay");
        mochileiro.setCpf(Validaçao.cpf("123"));
        Turista mochileiro = new Turista("mariana");
        //definir comportamento
        String retorno = mochileiro.viajar();
        System.out.println(retorno);

    }
}