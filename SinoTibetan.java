public class SinoTibetan extends Linguagem{
 
    public SinoTibetan(String nome, int numFalantes){
        super(nome, numFalantes, "Asia", "sujeito-objeto-verbo");
    

    if(nome == "chinês" || nome == "Mandarim"){
        ordemDasPalavras = "sujeito-verbo-objeto";
        }
    }
}
