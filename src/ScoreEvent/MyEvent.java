package ScoreEvent;
import java.util.*;
public class MyEvent extends EventObject {
	private String myValue;
	public MyEvent(Object source, String val) {
		super(source);
		myValue = val;
	}
	public String getMyValue() {
		return myValue;
	}
}
