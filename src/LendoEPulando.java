import java.util.Scanner;
/**
 *Desafio
 * Faça um programa com as características abaixo:
 *<br/><br/>
 * Leia 10 nomes, sem espaço em branco;<br/>
 * Imprima o terceiro nome da lista;<br/>
 * Imprima o sétimo nome da lista;<br/>
 * Imprima o nono nome da lista.<br/>
 * <br/><br/>
 * Entrada
 * A entrada consiste vários arquivos de teste, cada um com dez linhas e em cada
 * linha tem um nome de no até 30 caracteres e sem espaço em branco. Conforme
 * mostrado no exemplo de entrada a seguir.
 *<br/><br/>
 * Saída
 * Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no
 * Desafio, gere três linhas conforme os procedimentos 2, 3 e 4. Use o exemplo
 * abaixo para clarear o que está sendo pedido.
 * **/
public class LendoEPulando {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
        String[] nomes = new String[10];

        for(int i=0; i<10; i++) {
            nomes[i] = sc.nextLine();
        }
        System.out.println(nomes[2]);
        System.out.println(nomes[6]);
        System.out.println(nomes[8]);
    }
}
