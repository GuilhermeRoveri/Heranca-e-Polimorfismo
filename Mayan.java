public class Mayan extends Linguagem {

    public Mayan(String nome, int numFalantes) {
        super(nome, numFalantes, "América Central", "verbo-objeto-sujeito");
        /*Ámerica Central e verbo-objeto-sujeito se referem a regioes faladas e ordem
        das palavras, não foi necessário instânciá-las de novo, são fixas, o super
        chama o construtor da classe pai, e caso não quera alterar uma variável,
        fazer como na linha acima*/
    }
@Override
//Vamos subescrever o que está escrito , de forma a não atrapalhar o método que já existia antes
/*A sobrescrita é um recurso em programação orientada a objetos onde uma 
subclasse fornece uma implementação específica de um método que já é fornecido
por sua superclasse. Para sobrescrever um método, a subclasse deve declarar um
método com o mesmo nome, tipo de retorno e parâmetros.
*/

public void getInfo(){
    System.out.println(nome + " é falado por " + numFalantes + " pessoas principalmente em " + regioesFaladas + " A linguagem segue a ordem das palavras: " + ordemDasPalavras + " Fato interessante: " + nome + " é uma língua ergativa.");
}

}