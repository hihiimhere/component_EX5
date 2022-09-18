/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoreEvent;

/**
 *
 * @author athap
 */
public class ScoreReceiver implements ScoreListener{

    @Override
    public void scoreChange(MyEvent e) {
        System.out.println("live result: "+e.getMyValue());
    }
}
