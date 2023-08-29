/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scoreevent;

import java.util.Scanner;

/**
 *
 * @author thiti
 */
public class ScoreUsingEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource source = new ScoreSource();
        Subscriber1 sub1 = new Subscriber1();
        Subscriber2 sub2 = new Subscriber2();
        source.addObserver(sub1);
        source.addObserver(sub2);
        
        String data = "s";
        while (!data.equals("")) {
            Scanner kb = new Scanner(System.in);
            data = kb.nextLine();
            if (!data.equals("")) {
                source.setScoreLine(data);
            }
        }
    }

}
