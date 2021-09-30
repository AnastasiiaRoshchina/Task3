/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20task3anastasiiaroshchina;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV20Task3AnastasiiaRoshchina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ваше Имя и Фамилия: ");
        String name = in.nextLine();
       
        System.out.println("Год рождения");
        int year = in.nextInt();
       
        System.out.println("Месяц:");
        int month = in.nextInt();
        
        System.out.println("День:");
        int day = in.nextInt();
        
        String month1="";
        switch (month){
            case 1: month1="Январь";
                break;
            case 2: month1="Февраль";
                break;
            case 3: month1="Март";
                break;
            case 4: month1="Апрель";
                break;
            case 5: month1="Май";
                break;
            case 6: month1="Июнь";
                break;
            case 7: month1="Июль";
                break;
            case 8: month1="Август";
                break;
            case 9: month1="Сентябрь";
                break;
            case 10: month1="Окрябрь";
                break;
            case 11: month1="Ноябрь";
                break;
            case 12: month1="Декабрь";
                break;
                
        
        }
        System.out.println("Вас зовут "+name+" Ваша дата рождения: "+ day+" "+month1+" "+year);
        }
           
    }
    
    
