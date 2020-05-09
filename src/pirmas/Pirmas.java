/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pirmas;

import java.util.Scanner;

public class Pirmas {
    
    public static void main(String[] args) { 
         
        
        Scanner sc = new Scanner (System.in);
        System.out.println("0 - pabaiga");
        System.out.println("1 - akmuo");
        System.out.println("2 - popierius");
        System.out.println("3 - zirkles");
        int pasirinkimas = sc.nextInt();  
        
        //int kp = ((int) Math.random()*3)+1;
    } 
        
   
       
    
     public static void main1(String[] args) { 
        /*double a = 1;
        double b = -22;
        double c = 3;
       
        double d = b*b - 4*a*c;
        double saknis = Math.sqrt(d);
        double x1 = (-b + saknis)/2*a;
        double x2 = (-b - saknis)/2*a;
        
        if(d>0){
           System.out.println("grazina dvi reiksmes " + "x1=" + x1+ " " +"x2=" +x2);
           System.out.println(x1);
           System.out.println(x2);
        }
        else if (d == 0){
            double x = -b/2*a;
            System.out.println("grazina viena reiksme");
            System.out.println(x);
        }
        
        else {
            System.out.println("sprendmo nera");
        }
        
        System.out.println(d);*/
        
        /*int a = 3;
        switch(a){
            case 1:
                System.out.println("vienas");
            case 3:
                System.out.println("vienas");
        }
        
        int a = 0;
        int sum = 0;
        while(a<10){
            a++;
           
            sum += a*a;
            
        System.out.println(sum);
 
        }
        
        for(int i = 2; i<=10; i+=2){
            System.out.println(i);
        }
          
        int amount = 0;
        for(int i = 5, j=13; i<=9; i++, j--)
        {
            double as = Math.random();
            amount += i*j;
            System.out.println( Math.random());
        } 
       int vienas = 0;
       int du = 0;
       int trys = 0;
       int keturi = 0; 
       int penki = 0;
       int sesi = 0;

        for (int i = 0; i < 10000; i++) { 
            int rand = (int)(Math.random() * 6)+1; 
         
            if (rand == 1){
            vienas ++;
            }
            if (rand == 2){
            du ++;
            }
            if (rand == 3){
            trys ++;
            }
            if (rand == 4){
            keturi ++;
            }
            if (rand == 5){
            penki ++;
            }
             if (rand == 6){
            sesi ++;
            }
            
        }
            System.out.println("vienas ismestas " + vienas + " kartus");
            System.out.println("du ismestas "+du+" kartus"); 
            System.out.println("trys ismestas "+trys+" kartus"); 
            System.out.println("keturi ismestas "+keturi+" kartus");
            System.out.println("penki ismestas "+penki+" kartus");
            System.out.println("sesi ismestas "+sesi+" kartus");*/
        
       /*int vienas = 0;
       int du = 0;
       int trys = 0;
       int keturi = 0; 
       int penki = 0;
       int sesi = 0;

        for (int i = 0; i < 10; i++) { 
            int rand = (int)(Math.random() * 6)+1; 
            System.out.println(rand);
            switch(rand){
                case 1:
                    vienas++;
                    break;
                case 2:
                    du++;
                    break;
                case 3:
                    trys++;
                    break;
                case 4:
                    keturi++;
                    break;
                case 5:
                    penki++;
                    break;
                case 6:
                    sesi++;
                    break; 
            }  
        }
        
          System.out.println("vienas ismestas " + vienas + " kartus");
            System.out.println("du ismestas "+du+" kartus"); 
            System.out.println("trys ismestas "+trys+" kartus"); 
            System.out.println("keturi ismestas "+keturi+" kartus");
            System.out.println("penki ismestas "+penki+" kartus");
            System.out.println("sesi ismestas "+sesi+" kartus");
       
       int[] kauliukas = new int[6];
       kauliukas = new int[4];
       kauliukas[0] = 5;
       kauliukas[3] = 10;
       
        System.out.println(kauliukas[3]);
       System.out.println(kauliukas.length);
       
       for(int i = 0; i<kauliukas.length; i++){
           int reiksme = kauliukas[i];
           reiksme = 7;
           System.out.println(reiksme);
       }
      
       for(int j=0; j < kauliukas.length; j++){
      
    }
       int[]  temp = new int[kauliukas.length + 1];
       
       System.out.println("pabaiga");
       
       Scanner sc = new Scanner (System.in);
       System.out.println("ivesk kiek elementu");
       int ilgis = sc.nextInt();
       int[]m = new int[ilgis];
       
       for(int i = 0; i<m.length;i++){
           System.out.println("elementas");
           System.out.print(i);
            System.out.print(":");
            m[i] = sc.nextInt();
       }
       int elsuma = 0;
       int elVid = 0;
       for(int i = 0; i<m.length; i++){
           elsuma +=m[i];
           elVid = elsuma/m.length;
       }
       
        System.out.println(elsuma);
        System.out.println(elVid);*/
       
        int dydis = 20;
        int iteracijuKiekis = 50;
        char[][] laukas = new char[dydis][dydis];
        
       
        System.out.print(laukas);
        // Sugeneruojam pradini lauka
        for (int i = 0; i < laukas.length; i++) {
            for (int j = 0; j < laukas[i].length; j++) {
                if (Math.random() < 0.22) {
                    laukas[i][j] = 'X';
                } else {
                    laukas[i][j] = '.';
                }
            }
        }
        // Spausdinam esama lauka
        for (int i = 0; i < laukas.length; i++) {
            for (int j = 0; j < laukas[i].length; j++) {
                System.out.print(laukas[i][j]);
            }
            System.out.println();
        }
        char [][][] istorija = new char[iteracijuKiekis][dydis][dydis];
        for (int gc = 0; gc < iteracijuKiekis; gc++) {   
            //padedame esama iteracija i istorija
            istorija[gc] = laukas;
            
            char[][] laukas2 = new char[dydis][dydis];
            for (int i = 0; i < laukas.length; i++) {
                for (int j = 0; j < laukas[i].length; j++) {
                    
                            int count=0;
                            if(i > 0 && laukas[i-1][j] =='X'){
                                count++;
                            }
                            if  (i<laukas.length-1 && laukas[i+1][j] =='X'){
                                count++;
                            }
                            if(j > 0 && laukas[i][j-1] =='X'){
                                count++;
                            }
                              if(j<laukas[i].length-1 && laukas[i][j+1] =='X'){
                                count++;
                            }
                                if(i > 0 && j>0 && laukas[i-1][j-1] =='X'){
                                count++;
                            }
                                if(i >0 && j< laukas[i].length-1 && laukas[i-1][j+1] =='X'){
                                count++;
                            }
                                 if(i<laukas.length-1 && j > 0 && laukas[i+1][j-1] =='X'){
                                count++;
                            }
                                if(i<laukas.length-1 && j< laukas[i].length-1 && laukas[i+1][j+1] =='X'){
                                count++;
                            }
                        
                           if (laukas[i][j] == 'X'){
                            
                            if(count==2 || count==3){
                            laukas2[i][j] = 'X';
                            }
                            else {
                            laukas2[i][j] = '.';
                            }
                        }
                       
                       if (laukas[i][j] == '.'){
                          
                            if(count == 3){
                            laukas2[i][j] = 'X';
                            }
                            else{
                            laukas2[i][j] = '.';
                            } 
                        }                 
                }
                
            }
            
            //turim uzpildyta nauja iteracija
             //tikriname ar nauja iteracija vienoda su pries tai buvusia iteracija
        /*boolean vienodi = true;
        for (int i = 0; vienodi && i<laukas.length; i++){
            for (int j = 0; vienodi && j < laukas[i].length; j++){
                if (laukas[i][j] != laukas2[i][j]){
                    vienodi = false;
                } 
            }
        }
        
       
       if(vienodi){
            System.out.println("Interacija kartojasi");
            break;
        }*/
        
         int x = gc;
         for(; x >=0; x--){
             boolean vienodi = true;
            for (int i = 0; vienodi && i<laukas.length; i++){
                for (int j = 0; vienodi && j < laukas[i].length; j++){
                    if (istorija[x][i][j] != laukas2[i][j]){
                        vienodi = false;
                    } 
                }
            }
              if(vienodi){ 
                break;
            }
        }
        
         if(x>=0){
             System.out.println("Iteracija pasikartojo "+x);
             break;
         }
       
        
        
      
       System.out.println (gc + "//////////////");
         
        for (int i = 0; i < laukas2.length; i++) {
                for (int j = 0; j < laukas2[i].length; j++) {
                    System.out.print(laukas2[i][j]);           
            }  
                  System.out.println();
        }
                    
        laukas = laukas2;
                
        }
            
    }
}
