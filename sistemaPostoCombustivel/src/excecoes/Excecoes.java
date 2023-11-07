package excecoes;

import javax.swing.JOptionPane;

public class Excecoes {
	
	public static void preencherPreco() {
		JOptionPane.showMessageDialog(null, "Preencha todos os campos de preço com valores válidos!");
	}
	
	public static void preencherQuantidades() {
		JOptionPane.showMessageDialog(null, "Preencha as quantidades com valores válidos!");
	}
	
	public static void selecionarCombustivel() {
		JOptionPane.showMessageDialog(null, "Selecione o tipo de combustível!");
	}
	
	public void selecionarPagamento() {
		JOptionPane.showMessageDialog(null, "Selecione a forma de pagamento!");
	}
	
	public void diasPrazo() {
		JOptionPane.showMessageDialog(null, "Pagamentos a prazo 30 ou mais dias!");
	}

}
