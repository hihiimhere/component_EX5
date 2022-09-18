/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoreEvent;

import java.util.ArrayList;

/**
 *
 * @author athap
 */
public class ScoreSource {
    private String source;
	private ArrayList<ScoreListener> listeners;
	public ScoreSource() {
		listeners = new ArrayList<>();
	}
	public void setScoreLine(String val) {
		source = val;
		fireMyEvent(new MyEvent(this, source));
	}
	public String getSource() {
		return source;
	}
	public void addMyListener(ScoreListener l) {
                //System.out.println("Enter Score "+ScoreListener1);
		listeners.add(l);
	}
	public void removeMyListener(ScoreListener l) {
		listeners.remove(l);
	}
	public void fireMyEvent(MyEvent e) {
            for(int i = 0; i < listeners.size(); i++) {
                //userInput u = 
		ScoreListener l = listeners.get(i);
		l.scoreChange(e);
                        
		}
	}
        
}
