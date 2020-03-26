package app;


public class App 
{
    
    public static void main( String[] args )
    {
        Pessoa joao = new Pessoa(); 
        joao.cpf = "158.521.555-05";
        joao.rg = "56.224.102.02";
        joao.nome = "Valdez";
        joao.idade = 25;
        joao.endereco = "Bauru";
        joao.peso = 60.2;
        joao.altura = 1.8;

        System.out.println("-----------------------------------------");

        System.out.println("NOME: " + joao.nome);

        System.out.println("CIDADE: "           + joao.cidade());
        
        System.out.println("DIAS DE VIDA: "     + joao.dias_De_vida());

        System.out.println("IDADE:"             + joao.idade);

        System.out.println("IMC: "              + joao.valorImc());
        
        System.out.println("SITUAÇÃO: "         + joao.Resultado());
        
        System.out.println("-----------------------------------------");

    }
}