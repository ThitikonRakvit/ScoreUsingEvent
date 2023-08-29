/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreevent;

import java.util.EventObject;

/**
 *
 * @author thiti
 */
public class ScoreEvent extends EventObject{
    
    private String someData;
    public String getScore(){
        return someData;
    }
    public ScoreEvent(Object source , String value) {
        super(source);
        someData = value;
    }
    
}
