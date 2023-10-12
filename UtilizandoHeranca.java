package treinandoOOP;

import javax.swing.JOptionPane;

public class UtilizandoHeranca {

	public static void main(String[] args) {

		// Instanciando um novo objeto
		Carro carro1 = new Carro(null, null, 0, null, 0, null);

		// Convenção em Java , seguindo os parametros da Classe.
		Moto moto1 = new Moto(null, null, 0, null, 0, null);

		Bicicleta bicicleta1 = new Bicicleta(null, null, 0, null, 0, null);

		// Variavel que armazena a entrada do usuário
		int opcao = 0;

		try {

			// Verificando a entrada do usuário
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
					"ESCOLHA UMA OPÇÃO \n1-Inserir dados do carro \n2-Inserir dados da moto \n3-Inserir dados da bicicleta"));

			// Se o programa for fechado incorretamente ou dados invalidos sejam fornecidos
		} catch (NumberFormatException | NullPointerException erro) {

			JOptionPane.showMessageDialog(null,
					"Dados não numéricos foram inseridos ou o programa foi fechado incorretamente!!");

		}

		switch (opcao) {

		// Entrada de dados e imprimindo no prompt
		case 1:

			// Os setters vão atuar como um mediador entre o atributo e o parametro,
			// atribuindo caso esteja dentro de um valor pré estabelecido
			carro1.setMarca("Fiat");

			carro1.setModelo("Cronos");

			carro1.setNumeroPortas(3);

			carro1.setPreco(2345.2042);

			carro1.setTipoCombustivel("Diesel");

			carro1.setFabricacao(2004);

			carro1.mostrarDados();

			break;

		case 2:

			// Os setters vão atuar como um mediador entre o atributo e o parametro,
			// atribuindo caso esteja dentro de um valor pré estabelecido
			moto1.setMarca("Honda");

			moto1.setModelo("Titan 2023");

			moto1.setPreco(4567.8);

			moto1.setFabricacao(2013);

			moto1.setCapacidadeMotor(100);

			moto1.setTipoTransmissao("Via Corrente");

			moto1.mostrarDados();

			break;

		case 3:

			// Os setters vão atuar como um mediador entre o atributo e o parametro,
			// atribuindo caso esteja dentro de um valor pré estabelecido

			bicicleta1.setMarca("CALOI");

			bicicleta1.setModelo("Velox");

			bicicleta1.setPreco(3456.8);

			bicicleta1.setFabricacao(2013);

			bicicleta1.setTipo("Mountain Bike");

			bicicleta1.setNumeroMarchas(2);

			bicicleta1.mostrarDados();

			break;

		default:

			JOptionPane.showMessageDialog(null,
					"Nenhuma opção foi selecionada, portanto a aplicação foi finalizada!!!");

			break;
		}

	}

}
