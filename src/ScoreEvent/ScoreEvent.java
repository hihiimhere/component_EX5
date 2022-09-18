/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoreEvent;
import java.util.*;

/**
 *
 * @author athap
 */
public class ScoreEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ScoreSource score = new ScoreSource();
        ScoreReceiver r1 = new ScoreReceiver();
        ScoreReceiver r2 = new ScoreReceiver();
        score.addMyListener((ScoreListener) r1);
        score.addMyListener((ScoreListener) r2);
        
        String result = sc.nextLine();
        System.out.println("Enter Score "+result);
        score.setScoreLine(result);
        
    }

   
    
}
