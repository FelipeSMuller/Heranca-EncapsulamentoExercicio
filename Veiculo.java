package treinandoOOP;

import java.time.LocalDate;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Veiculo {

	// Atributos do veiculo
	protected String marca;

	// Visiblidade protected permite que as subclasses possam acessar os atributos
	protected String modelo;

	protected int anoFabricacao;

	protected Double preco;

	// Método para formatação do preço!
	public String formatarPreco(Double preco) {

		DecimalFormat df = new DecimalFormat("R$ ####.##");

		// Recebe o preço inserido e atribui em uma variavel.
		String precoFormatado = df.format(preco);

		return precoFormatado;
	}

	// Método para verificação de erros, proporcionando modularidade no programa
	public void tratarErroString(String frase) {

		// Se o campo estiver vazio, gera um erro
		if (frase.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Você deixou o campo sem nenhuma informação, tente novamente!!!");
		}

		else {

			// Caso contrário transforma a frase em letras maiusculas e retorna;
			frase = frase.toUpperCase();

			// Remove os espaços iniciais e finais de uma frase.
			frase = frase.trim();

		}
	}

	// Método para tratamento de valores numéricos
	public void tratarErroValores(int numeroPortas) {

		if (numeroPortas <= 0) {

			JOptionPane.showMessageDialog(null,
					"Não é possível inserir um valor negativo ou igual a zero, tente novamente!!");
		}

	}

	// Método que mostra os dados do veiculo
	public void mostrarDados() {

		JOptionPane.showMessageDialog(null, "DADOS DO VEICULO" + "\nMarca:  " + marca + "\nModelo:  " + modelo
				+ "\nAno de fabricação:  " + anoFabricacao + "\nPreço:  " + formatarPreco(preco));

	}

	// Método construtor
	public Veiculo(String marca, String modelo, int anoFabricacao, Double preco) {

		this.marca = marca;

		this.modelo = modelo;

		this.anoFabricacao = anoFabricacao;

		this.preco = preco;
	}

	// -------------Getters e setters do veiculo
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {

		tratarErroString(marca);

		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {

		tratarErroString(modelo);

		this.modelo = modelo;
	}

	public int getFabricacao() {

		return anoFabricacao;
	}

	public void setFabricacao(int anoFabricacao) {

		LocalDate dataAtual = LocalDate.now();

		// Se o ano da fabricação for maior que o ano atual, ou for um número negativo
		// ou igual a zero gera um erro, afinal isso
		// não é possível

		if (anoFabricacao > dataAtual.getYear() || anoFabricacao <= 0) {

			JOptionPane.showMessageDialog(null,
					"Não é possível inserir o dado fornecido, pois ele é um número negativo ou contém uma data inválida!!!");

		}

		else {

			this.anoFabricacao = anoFabricacao;

		}
	}

	public Double getPreco() {

		return preco;
	}

	public void setPreco(Double preco) {

		if (preco <= 0) {

			JOptionPane.showMessageDialog(null, "Não é possível inserir um valor negativo ou igual a zero!!");
		}

		else {

			this.preco = preco;

		}
	}

}
