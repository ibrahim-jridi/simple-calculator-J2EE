package metier;

public class calculImp implements calculMetier {

	@Override
	public int calc(int op1, int op2, String operator) {
		int res = 0;
		if(operator.equals("addition")){
			res = op1 + op2;
		}
		if(operator.equals("substraction")){
			res = op1 - op2;
		}
		if(operator.equals("multiplication")){
			res = op1 * op2;
		}
		if(operator.equals("division")){
			
			 try {
				 res = op1 / op2; // throw Exception
		        }
		        catch (ArithmeticException e) {
		            // Exception handler
		            System.out.println(
		                "Divided by zero operation cannot possible");
		        }
		}
		return res;
	}

}
