
public class Main {
    public static void main(String[] args) {
        equationParameters equationParameters = new equationParameters();
        equationParameters.readFromConsole();
        
        Equation equation = new Equation(equationParameters);
        Solution solution = equation.solve();
        
        solution.show();
    }
}
