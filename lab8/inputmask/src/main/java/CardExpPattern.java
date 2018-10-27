
public class CardExpPattern extends CardExpDecorator implements IKeyEventHandler, IDisplayComponent{
	CreditCardExp cardexp;	//holds a reference to the class its wrapping
	private IKeyEventHandler nextHandler ;

	CardExpPattern(CreditCardExp exp) {
		this.cardexp = exp;
	}
	
	public void setNext( IKeyEventHandler next) {
	    	this.nextHandler = next ;
	}	

	
	public String display() {
		StringBuffer expPattern = new StringBuffer();
		String expDate;		
		expDate = cardexp.display();
		
		for(int i=0;i<expDate.length();i++) {
			if(i==3)
				if (expDate.charAt(i) != '/')
                expPattern.append("/" + expDate.charAt(i));
				else
                expPattern.append(expDate.charAt(i));

			else
            expPattern.append(expDate.charAt(i));
		}
		
		return expPattern.toString();
	
	}
	
	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  )
            cardexp.key(ch, cnt);
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}
	
	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
}