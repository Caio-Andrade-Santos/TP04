/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp04;
import java.text.DateFormat;

/**
 * CBTLRP1 - TP04
 * Nomes dos altores: Alexandre Zampieri, Caio Andrade.
 * 
 */
public class TP04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Exercício 02
        Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no
        exercício anterior.
        */
        //Testando o metodo construtor com parametros
        Data dt = new Data(31,4,2024);
        System.out.println(dt.mostra1());
        System.out.println(dt.mostra2());
        System.out.println(dt.bissexto());
        System.out.println(dt.diasTranscorridos());
        Data.apresentaDataAtual();

              
    }
    
}
