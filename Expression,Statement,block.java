//Example and explain what are expression statement and block.
class learnjava{
	public static void main (String[] args){
		int number = 0 ;//This is expression
		int[] anArray = {0,1,2} ;//This is expression
		System.out.println("This output is  expression");
		int result = 1+2; //this is expression
		int value1 = 0 ,value2 = 0;//This is also
		if (value1 == value2) 
			System.out.println("value1 == value2 is expression");
		// expression contructed by variable operator method condition
		
		int a = 1*2*3;// expression with return value type with same type with declared
		int b = 5+10/100; // and expression also have Operator Order of Precedence like * do befor / + - and in () do first
		int c = (5+10)/100; // example of Operator Order of Precedence do it do in () first no like before line
		
		//Statement  
		int avalue = 1000; // this is statement
		int bval=0;
		bval++; // this is statement too 
		System.out.println("all of this line is statement ");
		// also create object is statement 


		//block 
		boolean condition = true;
        	  if (condition) { // begin block 1
              		 System.out.println("Condition is true.");
         	 } // end block one
         	 else { // begin block 2
              		 System.out.println("Condition is false.");
         	 } // end block 2
     }
}
