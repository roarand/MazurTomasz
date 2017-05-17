package Program;

public class ONP {
	
	protected int OperatorsPriority(char character){
		switch(character){
		case'+':
		case'-':
			return 1;
		case'*':
		case'/':
		case'%':
			return 2;
		case'^':
		case'v':
			return 3;
		case'!':
			return 4;
		case'(':
			return 0;
		default:
			System.out.println("Blad, '" + character +" nie jest operatorem matematycznym.");
		return 0;
		}
	}
	
	public  String tworzONP(String wejscie) throws Exception{
		
		char znak;
		String liczba= new String();
		String wyjscie = new String();
		Stos<String> stos = new Stos();
		
	
			for (int j = 0; j < wejscie.length(); j++){
			znak =wejscie.charAt(j);
			if(znak=='=')
			{
				while(stos.czyPusty()==false)
				{
					wyjscie+= stos.pop();
				}
			}
			else if(znak>='0' && znak <='9'){
				liczba=Character.toString(znak);
				
				while(wejscie.charAt(j+1)>='0' && wejscie.charAt(j+1) <='9'){
					j++;
					znak=wejscie.charAt(j);
					liczba+=Character.toString(znak);
					}
				if(wejscie.charAt(j+1)=='.'){
					j++;
					liczba+=".";
					while(wejscie.charAt(j+1)>='0' && wejscie.charAt(j+1) <='9'){
						j++;
						znak=wejscie.charAt(j);
						liczba+=Character.toString(znak);
						}
				}
				wyjscie+= liczba + " ";	
			}else{
				switch(znak)
				{
				case'(':	
					stos.push(Character.toString(znak));
					break;
				case')':
					while(stos.peek().equals("(")==false)
					{
						wyjscie+= stos.pop() + " ";
					}
					stos.pop();
					break;
				case'+': 
				case'*': 
				case'-': 
				case'/': 
				case'^':
				case'v':
				case'%':
				case'!':
					while(stos.czyPusty()==false)
					{
						if(OperatorsPriority(znak)==3 || (OperatorsPriority(znak)>(OperatorsPriority((stos.peek().charAt(0))))))
								{
									break;
								}
						wyjscie+= stos.pop() + " ";
					}
					stos.push(Character.toString(znak));
					break;
				default:
					System.out.println("Niepoprawny znak w równaniu");
					System.out.println(znak);
				}
			}
			
		}
		
		return wyjscie;
		
	}
		}


