import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		String operador = JOptionPane.showInputDialog("Escolha a operacao desejada: "
				+ "\n1 - Somar;"
				+ "\n2 - Subtração;"
				+ "\n0 - Sair;");
		
		int operacao;
		operacao = Integer.parseInt(operador);
		 
		if (operacao == 1) {
			
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
			int n2 = Integer.parseInt( JOptionPane.showInputDialog("Digite o segundo numero: "));
			
			int soma;
			soma = n1 + n2;
			
			JOptionPane.showMessageDialog(null, "Resultado: " + soma);
					    
			
		}
		if (operacao == 2) {
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
			int n2 = Integer.parseInt( JOptionPane.showInputDialog("Digite o segundo numero: "));
		
			int subtrair;
			subtrair = n1 - n2;
			
			JOptionPane.showMessageDialog(null, "Resultado: " + subtrair);
			
		}
		
		else {
			
			System.exit(0);
			}
	}
}