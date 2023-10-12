package treinandoOOP;

import javax.swing.JOptionPane;

public class Bicicleta extends Veiculo {

	private String tipo;

	private int numeroMarchas;

	// Método construtor, herda da superclasse os métodos e atributos
	public Bicicleta(String marca, String modelo, int anoFabricacao, Double preco, int numeroMarchas, String tipo) {
		super(marca, modelo, anoFabricacao, preco);

		this.numeroMarchas = numeroMarchas;

		this.tipo = tipo;

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {

		// Método que trata os erros de uma variavel do tipo String
		tratarErroString(tipo);

		this.tipo = tipo;
	}

	public int getNumeroMarchas() {
		return numeroMarchas;
	}

	public void setNumeroMarchas(int numeroMarchas) {

		// Método que trata os erros de uma variavel do tipo int

		tratarErroValores(numeroMarchas);

		this.numeroMarchas = numeroMarchas;
	}

	// Método override, imprime no prompt os dados da Bicicleta
	public void mostrarDados() {

		String precoFormatado = formatarPreco(preco);

		JOptionPane.showMessageDialog(null,

				"DADOS DA MOTO" + "\nMarca:  " + marca + "\nModelo:  " + modelo + "\nAno de fabricação:  "
						+ anoFabricacao + "\nPreço:  " + precoFormatado + "\nTipo da bicicleta:  " + tipo
						+ "\nNúmero de marchas:  " + numeroMarchas);
	}

}
