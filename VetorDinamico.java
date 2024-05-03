public class VetorDinamico <Tipo>{
    private Tipo [] elementos;
    private int quantidade;
    private int capacidade;

    public VetorDinamico(){
        this.capacidade = 4;
        this.elementos = (Tipo[]) new Object[capacidade];
    }

    public boolean estaCheio(){
        return quantidade == capacidade;
    }

    public boolean estaVazio(){
        return quantidade == 0;
    }

    public void adicionar(Tipo elemento){
        if(estaCheio()){
            aumentarCapacidade();
        }
        elementos[quantidade] = elemento;
        quantidade++;
        
    }

    public void remover(){
      if(!estaVazio())
        quantidade--;
      
      if(capacidade > 4 && quantidade == capacidade / 4){
        reduzirCapacidade();
      }
    }

    public void reduzirCapacidade(){
      //1. Cortar a capacidade pela metade
      capacidade = capacidade / 2;
      //2. Alocar um vetor auxiliar de inteiros com tamanho igual à capacidade nova
        var aux = (Tipo[]) new Object[capacidade];
      //3. Copiar todo mundo de elementos para o vetor auxiliar
      for(int i = 0; i < quantidade; i++){
        aux[i] = elementos[i];
      }
      //4. Fazer com que elementos referencie o mesmo vetor referenciado por aux
      elementos = aux;
    }

    public void aumentarCapacidade(){
        Tipo[] aux = (Tipo[]) new Object[capacidade*2];
        for(int i = 0; i < quantidade; i++){
            aux[i] = elementos[i];
            
        }
        elementos = aux; // atualizando o atributo 
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