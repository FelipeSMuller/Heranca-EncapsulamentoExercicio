package treinandoOOP;

import javax.swing.JOptionPane;

public class Carro extends Veiculo {

	private int numeroPortas;

	private String tipoCombustivel;

	public Carro(String marca, String modelo, int anoFabricacao, Double preco, int numeroPortas, String tipoCombustivel) {

		super(marca, modelo, anoFabricacao, preco);

		this.numeroPortas = numeroPortas ;

		this.tipoCombustivel = tipoCombustivel;
	}

	public int getNumeroPortas() {

		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {

		tratarErroValores(numeroPortas);

		this.numeroPortas = numeroPortas;
	}

	public String getTipoCombustivel() {

		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {

		tratarErroString(tipoCombustivel);

		this.tipoCombustivel = tipoCombustivel;
	}

	// Método com override
	public void mostrarDados() {

		String precoFormatado = formatarPreco(preco);

		JOptionPane.showMessageDialog(null,
				"DADOS DO CARRO" + "\nMarca:  " + marca + "\nModelo:  " + modelo + "\nAno de fabricação:  "
						+ anoFabricacao + "\nPreço:  " + precoFormatado + "\nNúmero de portas:  " + numeroPortas
						+ "\nTipo de combustível:  " + tipoCombustivel);
	}

}
