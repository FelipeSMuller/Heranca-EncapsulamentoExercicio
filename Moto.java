package treinandoOOP;

import javax.swing.JOptionPane;

public class Moto extends Veiculo {

	private int capacidadeMotor;

	private String tipoTransmissao;

	public Moto(String marca, String modelo, int anoFabricacao, Double preco, int capacidadeMotor,
			String tipoTransmissao) {

		super(marca, modelo, anoFabricacao, preco);

		this.capacidadeMotor = capacidadeMotor;

		this.tipoTransmissao = tipoTransmissao;

	}

	public int getCapacidadeMotor() {

		return capacidadeMotor;
	}

	public void setCapacidadeMotor(int capacidadeMotor) {

		tratarErroValores(capacidadeMotor);

		this.capacidadeMotor = capacidadeMotor;
	}

	public String getTipoTransmissao() {

		return tipoTransmissao;
	}

	public void setTipoTransmissao(String tipoTransmissao) {

		tratarErroString(tipoTransmissao);

		this.tipoTransmissao = tipoTransmissao;
	}

	// Métodos com override
	public void mostrarDados() {

		String precoFormatado = formatarPreco(preco);

		JOptionPane.showMessageDialog(null,

				"DADOS DA MOTO" + "\nMarca:  " + marca + "\nModelo:  " + modelo + "\nAno de fabricação:  "
						+ anoFabricacao + "\nPreço:  " + precoFormatado + "\nTipo de transmissão:  " + tipoTransmissao
						+ "\nCapacidade do motor:  " + capacidadeMotor);
	}

}
