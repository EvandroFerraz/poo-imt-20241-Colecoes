import java.util.Random;

public class TesteVetorDinamico {
    public static void main(String[] args) 
        throws Exception{
        // criando o objeto de vetor dinamico: v
        // v possui quantidade = 0 e capacidade = 4
        VetorDinamico v = new VetorDinamico();
        Random gerador = new Random();

        while(true){
            int elemento = 1 + gerador.nextInt(6);
            v.adicionar(elemento);
            v.exibir();
            Thread.sleep(7000);
            System.out.println("====================");
        }
    }
}

