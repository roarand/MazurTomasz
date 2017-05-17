package Program;
import java.util.LinkedList;

public class Stos <T>{
	
	LinkedList <T> tablica;
	int sp=-1;
	
	public Stos(){
		tablica = new LinkedList<>();
	}
	
	public void push(T el){
		
		tablica.addLast(el);
	}
	
	public T pop() throws Exception{
		
		if(tablica.isEmpty())
			throw new Exception("Pusty Stos");
		else
			return tablica.removeLast();
	}
	
	public T peek() throws Exception{
		
		if(tablica.isEmpty())
			throw new Exception("Pusty Stos");
		return tablica.getLast();
	}
	
	public boolean czyPusty(){
		
		return tablica.isEmpty();
	}
	
	public int rozmiar(){
		
		return tablica.size();
	}
}
