public class CardNumPattern extends CardNumberDecorator implements IDisplayComponent,IKeyEventHandler {
	CreditCardNum cardnum;	//holds a reference to the class its wrapping
	private IKeyEventHandler nextHandler ;

	CardNumPattern(CreditCardNum cc) {
		this.cardnum = cc;
		
	}
	
    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	
    
	public String display() {
		String numPattern = "";
		String digit;	
		digit = cardnum.display();
	
			for(int i=0;i<digit.length();i++) {

                switch(i) {
					case 5:
						if (digit.length() > 8)
						numPattern = numPattern + " " + digit.charAt(i);
						
						else

						numPattern = numPattern +  digit.charAt(i);
						
						break;
					
					case 9: 
						if (digit.length() > 12)
						numPattern = numPattern + " " + digit.charAt(i);
						else
						numPattern = numPattern +  digit.charAt(i);
	
						break;
					
					case 13:
						if (digit.length() > 16)
						numPattern = numPattern + " " + digit.charAt(i);
						else
						numPattern = numPattern +  digit.charAt(i);
	
						break;
					
					default:
					numPattern = numPattern +  digit.charAt(i);
						break;
				
					}
			
			}
		return numPattern;		
	}
	
	public void key(String ch, int cnt) {
		if ( cnt <= 16 ) {
			cardnum.key(ch, cnt);
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}

	
	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}


}