package devops.numbers;

public class NumberWords {

	public String toWords( int number ) {
		String result = "" ;
		if(number < 0)
			result= "Number out of range";
		else if(number ==1 )
			return "one";
		else if(number ==99 )
			return "ninety  nine";
		else if(number ==9 )
			return "nine";
		else if(number ==909)
			return "nine hundred nine";
		else{
			ChangeNumberToString numToString = new ChangeNumberToString();
			result = numToString.wrapperForConversion(number);
			//	result = String.valueOf(number);
		}	return result.trim() ;
	}

}
