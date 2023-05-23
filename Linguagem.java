public class Linguagem{

protected String nome;
protected int numFalantes;
protected String regioesFaladas;
protected String ordemDasPalavras;

public Linguagem(String nome, int numFalantes, String regioesFaladas,String ordemDasPalavras){
this.nome = nome;
this.numFalantes = numFalantes;
this.regioesFaladas = regioesFaladas;
this.ordemDasPalavras = ordemDasPalavras;
}

public void getInfo(){
    System.out.println(nome + " é falado por " + numFalantes + " pessoas principalmente em " + regioesFaladas + " A linguagem segue a ordem das palavras: " + ordemDasPalavras + ".");
}




public static void main(String[] args){

Linguagem portugues = new Linguagem("Português", 10000, "América", "sujeito-verbo-objeto");
portugues.getInfo();

Mayan kiche = new Mayan("Ki'che", 600);
kiche.getInfo();

SinoTibetan mandarim = new SinoTibetan("Mandarim", 35000);
mandarim.getInfo();

SinoTibetan birmanês = new SinoTibetan("Birmanês", 5000);
birmanês.getInfo();
    }
}