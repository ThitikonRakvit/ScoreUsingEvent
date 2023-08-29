/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreevent;

import java.util.ArrayList;

/**
 *
 * @author thiti
 */
public class ScoreSource {
       ArrayList<MyObserver> observers;

    public ScoreSource() {
        observers = new ArrayList<>();
    }

    public void addObserver(MyObserver obj) {
        observers.add(obj);
    }

    public void setScoreLine(String value) {
        fireScoreEvent(new ScoreEvent(this ,value));
    }

    public void fireScoreEvent(ScoreEvent evt) {
        for (MyObserver observer : observers){
            observer.scoreChange(evt);
        }
    } 
}
