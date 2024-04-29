public class VetorDinamico{
    private int [] elementos;
    private int quantidade;
    private int capacidade;

    public VetorDinamico(){
        this.capacidade = 4;
        this.elementos = new int[capacidade];
        // 1 posicao do vetor = elementos[0]
        // 2 posicao do vetor = elementos[1]
        // 3 posicao do vetor = elementos[2]
        // 4 posicao do vetor = elementos[3]
        // vetor possuí um índice i, 
        // onde i = 0 até capacidade-1
    }

    public boolean estaCheio(){
        return quantidade == capacidade;
    }

    public boolean estaVazio(){
        return quantidade == 0;
    }

    public void adicionar(int elemento){
        if(estaCheio()){
            aumentarCapacidade();
        }else{
            elementos[quantidade] = elemento;
            quantidade++;
        }
    }

    public void aumentarCapacidade(){
        int[] aux = new int[capacidade*2];
        // elementos = 0:|2| > 1:|4| > 2:|6| > 3:|| > 4:||
        // quantidade = 3
        for(int i = 0; i < quantidade; i++){
            aux[i] = elementos[i];
            // 1 iteração (i = 0): aux[0] = elementos[0]; |2|
            // 2 iteração (i = 1): aux[1] = elementos[1]; |4|
            // 3 iteração (i = 2): aux[2] = elementos[2]; |6|
            // 3 iterção (i = 3): condição é falsa,
            // pois i = quantidade, então o laço termina
        }
        elementos = aux; // atualizando o atributo 
        // elementos, atribuindo um vetor com os mesmos
        // valores porém com a capacidade dobrada
        capacidade *= 2;
    }

    public void exibir(){
        System.out.printf("Qtd: %d, Cap: %d\n",
        quantidade, capacidade);
        for(int i = 0; i < quantidade; i++){
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}