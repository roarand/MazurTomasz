package Program;

public class Kalkulator {
	
	String wyrazenieONP;
	double pomoc,pomoc2;
	Stos<String> stos = new Stos<>();
	
	public Kalkulator(String wyrazenieONP){
		
		this.wyrazenieONP=wyrazenieONP;
		
	
	}
	
	public double oblicz() throws NumberFormatException, Exception{
		
		String character="";
		for (int i = 0; i < wyrazenieONP.length(); i++) 
			{
			character=Character.toString(wyrazenieONP.charAt(i));
			if(wyrazenieONP.charAt(i)>='0'&& wyrazenieONP.charAt(i)<='9')
			while(wyrazenieONP.charAt(i+1)!=' ' && wyrazenieONP.charAt(i)!=' '){
				i++;
				character +=Character.toString(wyrazenieONP.charAt(i)); 
			}
			switch(character){
				case" ":
					break;
				case"+":
					dodawanie();
					break;
				case"-":
					odejmowanie();
					break;
				case"*":
				case"x":
					mnozenie();
					break;
				case"/":
					dzielenie();
					break;
				case"%":
					modulo();
					break;
				case"^":
					potegowanie();
					break;
				case"v":
					pierwiastkowanie();
					break;	
				case"!":
					silnia();
					break;
		default:
			 stos.push(character);
		}
		
	}      
	       return Double.parseDouble(stos.pop());
	}

	protected void dodawanie() throws NumberFormatException, Exception{	
		pomoc = Double.parseDouble(stos.pop());
		pomoc2 = pomoc+Double.parseDouble(stos.pop());
		stos.push(Double.toString(pomoc2));	 
	}

	protected void odejmowanie() throws NumberFormatException, Exception{
		pomoc = Double.parseDouble(stos.pop());
		pomoc2 = Double.parseDouble(stos.pop())-pomoc;
		stos.push(Double.toString(pomoc2));
	}
	protected void mnozenie() throws NumberFormatException, Exception{
		pomoc = Double.parseDouble(stos.pop());
		pomoc2 = pomoc*Double.parseDouble(stos.pop());
		stos.push(Double.toString(pomoc2));
	}
	protected void dzielenie() throws NumberFormatException, Exception{
		pomoc = Double.parseDouble(stos.pop());
		pomoc2 = Double.parseDouble(stos.pop())/pomoc;
		if(pomoc == 0)
			stos.push("Blad, dzielenie przez 0");
		stos.push(Double.toString(pomoc2));
	}
	protected void modulo() throws NumberFormatException, Exception{
		pomoc = Double.parseDouble(stos.pop());
		pomoc2 = Double.parseDouble(stos.pop())%pomoc;
		stos.push(Double.toString(pomoc2));
	}
	protected void potegowanie() throws NumberFormatException, Exception{
		pomoc = Double.parseDouble(stos.pop());
		pomoc2 = Math.pow(Double.parseDouble(stos.pop()),pomoc);
		stos.push(Double.toString(pomoc2));
	}
	protected void pierwiastkowanie() throws NumberFormatException, Exception{
		pomoc = Double.parseDouble(stos.pop());
		pomoc2 = Math.sqrt(pomoc);
		stos.push(Double.toString(pomoc2));
	}
	protected void silnia() throws NumberFormatException, Exception{
		pomoc=Double.parseDouble(stos.pop());
		pomoc2=1;
		if(pomoc==0 || pomoc==1)
			pomoc2=1;
		else {
			for(int i=(int)pomoc; i>0; i--){
				pomoc2+=pomoc2*(pomoc-i);
			}
		}
		pomoc2=pomoc*(pomoc-1);
		stos.push(Double.toString(pomoc2));
		
	}
}
