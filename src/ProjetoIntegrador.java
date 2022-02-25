import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class ProjetoIntegrador {

	public static void main(String[] args) {
		
		JLabel label = new JLabel("<html><center><b>Seja bem-vindo!</b>");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		javax.swing.JOptionPane.showMessageDialog(null, label, "Supermercado Bem Barato", javax.swing.JOptionPane.PLAIN_MESSAGE);
		
		String login = javax.swing.JOptionPane.showInputDialog(null, "", "Digite seu login", javax.swing.JOptionPane.PLAIN_MESSAGE);
		
		JPasswordField pass = new JPasswordField();
		int boxPass = JOptionPane.showInternalConfirmDialog(null, pass, "Digite sua senha", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE);
		String senha = new String(pass.getPassword());
		
		if(login.equals("matricula") && senha.equals("123456")) {
			JLabel label1 = new JLabel("<html><center>Acesso liberado!");
			label1.setHorizontalAlignment(SwingConstants.CENTER);
			javax.swing.JOptionPane.showMessageDialog(null, label1, "Controle de Acesso", javax.swing.JOptionPane.PLAIN_MESSAGE);
		}else {
			JLabel label2 = new JLabel("<html><center>Acesso Negado!!");
			label2.setHorizontalAlignment(SwingConstants.CENTER);
			javax.swing.JOptionPane.showMessageDialog(null, label2, "Controle de Acesso", javax.swing.JOptionPane.PLAIN_MESSAGE);
		}
		
		while(true) {
			double Valor_Total = 0;
			JLabel label4 = new JLabel("<html><center>Digite o valor das compras");
			label4.setHorizontalAlignment(SwingConstants.CENTER);
			double Valor_Compras = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null, label4, "Carrinho de Compras", javax.swing.JOptionPane.PLAIN_MESSAGE));
			
			String [] opcoes = {"PIX", "CRÉDITO", "DÉBITO", "SAIR"};
			int opcao = JOptionPane.showOptionDialog(null, "Qual forma de pagamento?", "Tela Pagamento", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
				if (opcao == 0) {
					Valor_Total = Valor_Compras - (Valor_Compras * 5/100);
					JOptionPane.showMessageDialog(null,"O valor da sua compra é de: R$ " + Valor_Total, "Tela Final", JOptionPane.PLAIN_MESSAGE);
					JLabel label6 = new JLabel("<html><center><b>Volte Sempre!</b>");
					label6.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(null, label6, "Supermercado Bem Barato", JOptionPane.PLAIN_MESSAGE);
				}else if(opcao == 1){
					Valor_Total = Valor_Compras;
					JOptionPane.showMessageDialog(null, "O Valor final da sua compra é de: R$ " + Valor_Total, "Tela Final", JOptionPane.PLAIN_MESSAGE);
					JLabel label7 = new JLabel("<html><center><b>Volte Sempre!</b>");
					label7.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(null, label7, "Supermercado Bem Barato", JOptionPane.PLAIN_MESSAGE);
				}else if(opcao == 2){
					Valor_Total = Valor_Compras - (Valor_Compras * 2.5/100);
					JOptionPane.showMessageDialog(null, "O Valor final da sua compra é de: R$ " + Valor_Total, "Tela Final", JOptionPane.PLAIN_MESSAGE);
					JLabel label8 = new JLabel("<html><center><b>Volte Sempre!</b>");
					label8.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(null, label8, "Supermercado Bem Barato", JOptionPane.PLAIN_MESSAGE);
				}else if (opcao == 3) {
				JLabel label5 = new JLabel("<html><center><b>Volte Sempre!</b>");
				label5.setHorizontalAlignment(SwingConstants.CENTER);
				JOptionPane.showMessageDialog(null, label5, "Supermercado Bem Barato", JOptionPane.PLAIN_MESSAGE);	
				break;
			}
		}
	}		
}


