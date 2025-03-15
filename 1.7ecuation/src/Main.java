
public class Main 
{

	public static void main(String[] args) {
		//cream parametrii ecuatiei
		EquationParameters equationParameters = new EquationParameters();
		equationParameters.readFromConsole();
		
		Equation equation = new Equation(equationParameters);
		
		Solution solution = equation.solve();
		
		solution.show();

	}

}
