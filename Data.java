/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp04;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author cavia
 */

 //Criação da Classe data
public class Data {
    
    static Scanner sc = new Scanner(System.in);
    private int dia;
    private int mes;
    private int ano;
 
    /*Construtor sem parametros
    O construtor Data(int d, int m, int a) deverá receber os valores de dia, mês e ano e com eles inicializar
    as propriedades da classe;
    */
    public Data(int d, int m , int a)
    {
        entraAno(a);
        entraMes(m);
        entraDia(d);
    }
    /*Setters
    Os métodos entraDia(int d), entraMes(int m) e entraAno(int a) devem receber um valor e atribuí-lo às
respectivas propriedades;
    */
    public void entraDia(int d)
    {
        int maxDia = VerificaMes(mes, ano);
        while(d > maxDia || d < 1)
        {
            System.out.println("Valor invalido para o dia digite um valor adequado:");
            d = sc.nextInt();
        }
        System.out.println("Sucesso");
        dia = d;
    }
    
    public void entraMes(int m)
    {
        while(m > 12 || m < 1)
        {
            System.out.println("Valor invalido para o mes");
            m = sc.nextInt();
        }
        mes = m;
    }
    
    public void entraAno(int a)
    {
        while(a > 2026 || a < 1)
        {
            System.out.println("Valor invalido para o ano");
            a = sc.nextInt();
        }
        ano = a;
    }
    /*Geters
    Os métodos retDia(), retMes() e retAno() devem nos devolver as respectivas propriedades;
    */
    public int retDia()
    {
        return dia;
    }
    
      public int retMes()
    {
        return mes;
    }
      
      public int retAno()
    {
        return ano;
    }
  /*Sobrecarga do construtor sem parametros
      O construtor Data() deverá permitir ao usuário digitar os valores de dia, mês e ano e com eles
inicializar os atributos da classe. Os valores digitados deverão ser consistidos e só aceitos se válidos,
caso contrário, redigitar;
      */
     public Data() 
    {
    entraAno();
    entraMes();
    entraDia();
    }
    //Sobrecarga dos setters
    public void entraAno(){

    int a;
    System.out.print("Digite o ano: ");
    a = sc.nextInt();

    while (a < 1 || a > 2026) {
        System.out.print("Ano invalido, digite um ano valido: ");
        a = sc.nextInt();
    } 

    ano = a;
    }
    
    public void entraMes() {

    int m;
    System.out.print("Digite o mês: ");
    m = sc.nextInt();

    while (m < 1 || m > 12) {
        System.out.print("Mes invalido, digite um mes valido: ");
        m = sc.nextInt();
    } 

    mes = m;
    }
    
    public void entraDia() {

    int d;
    int maxDia = VerificaMes(mes, ano);
    System.out.print("Digite o dia: ");
    d = sc.nextInt();

    while (d < 1 || d > maxDia)
    {
        System.out.println("dia invalido, digite um dia válido:");
        d = sc.nextInt();
    }

    dia = d;
    }
     // fução para Verificar a quantidade de dias no respectivo mês, além de verificar se o ano é bissexto
    public int VerificaMes(int mes, int ano) {

    switch (mes) {

        case 1:  // Janeiro
        case 3:  // Março
        case 5:  // Maio
        case 7:  // Julho
        case 8:  // Agosto
        case 10: // Outubro
        case 12: // Dezembro
            return 31;

        case 4:  // Abril
        case 6:  // Junho
        case 9:  // Setembro
        case 11: // Novembro
            return 30;

        case 2:  // Fevereiro
            if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0))
                return 29;
            else
                return 28;

        default:
            return -1; // mês inválido
        }
    }
      /*Método para mostrar a date em dd/mm/aa
        O método mostra1() deve nos devolver a data no formato: dd/mm/aaaa;
    */
    
    public String mostra1()
    {
        int d = retDia();
        int m = retMes();
        int a = retAno();
        
        String d1 = Integer.toString(d);
        String m1 = Integer.toString(m);
        String a1 = Integer.toString(a);
        
        String auxD = d1;
        String auxM = m1;
        
         if (d < 10) {

            String h0 = d1.substring(0, 0) + "0" + d1.substring(0);
            auxD = h0;

        }

        if (m < 10) {
            String m0 = m1.substring(0, 0) + "0" + m1.substring(0);
            auxM = m0;
        }
        
        String DataCompleta = auxD + "/" + auxM + "/" + a1;
        return DataCompleta;
    }
        /*Metodo para mostrar data em dd/nomeMes/aa
        O método mostra2() deve nos devolver a data no formato: dd/mesPorExtenso/ano;
    */
       public String mostra2()
    {
        int d = retDia();
        String m = MesNome(mes);
        int a = retAno();
        
        String d1 = Integer.toString(d);
        String a1 = Integer.toString(a);
        
        String auxD = d1;
        
         if (d < 10) {

            String h0 = d1.substring(0, 0) + "0" + d1.substring(0);
            auxD = h0;

        }
        
        String DataCompleta = auxD + "/" + m + "/" + a1;
        return DataCompleta;
    }
       /*metodo para mostrar se o ano é bissexto ou não
       O método bissexto() deve nos devolver um boolean informando se o ano é ou não bissexto;
       */
       public boolean bissexto()
       {
         if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
                System.out.println("e bissexto");
                return true;
         }
         else
         {
             System.out.println("Nao e bissexto");
             return false;
         }
       }
       
       /*
       Metodo para verificar os dias transcorridos
       utilizei o metodo para receber os dias que cada mês tem dentro de
       um loop para realizar a soma
       
       O método diasTranscorridos, deve retornar a quantidade de dias transcorridos no ano até a data
       digitada.
       */
       public int diasTranscorridos()
       {
       int dias = retDia();
       for(int i = 1; i < mes; i++)
       {
           int diaMes = VerificaMes(i, ano);
           dias = dias + diaMes;
       }
       return dias;
       }
    
       // Metodo para pegar o nome do mes por extenso
    public String MesNome(int mes) {

        switch (mes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Mês inválido";
        }

    }
    /* metodo estatico para devolver a data atual
    O método apresentaDataAtual() deve imprimir a data atual, utilizando as classes Date e DateFormat, o
DateFormat empregando o seguinte método: getDateInstance(DateFormat.FULL);
    */
    public static void apresentaDataAtual() {

     Date dataAtual = new Date();

    DateFormat formato =
        DateFormat.getDateInstance(DateFormat.FULL);

    System.out.println(formato.format(dataAtual));
    }
    
}
