import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		String operador = JOptionPane.showInputDialog("Escolha a operacao desejada: "
				+ "\n1 - Somar;"
				+ "\n2 - Subtração;"
				+ "\n3 - Mutiplicação;"
				+ "\n4 - Dividir;"
				+ "\n0 - Sair;");
		
		int operacao;
		operacao = Integer.parseInt(operador);
		
		// 
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
		if (operacao == 3) {
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
			int n2 = Integer.parseInt( JOptionPane.showInputDialog("Digite o segundo numero: "));
		
			int multiplicar;
			multiplicar = n1 * n2;
			
			JOptionPane.showMessageDialog(null, "Resultado: " + multiplicar);
			
		}
		if (operacao == 4) {
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
			int n2 = Integer.parseInt( JOptionPane.showInputDialog("Digite o segundo numero: "));
		
			int dividir;
			dividir = n1/n2;
			
			JOptionPane.showMessageDialog(null, "Resultado: " + dividir);
			
		}
		else {
			
			System.exit(0);
			}
	}
}