package br.com.fiap.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cartao;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Mercado;
import br.com.fiap.beans.Ong;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.Pix;

public class TesteFeedBack {

//=============== MÉTODOS STATIC ===============
	
	// String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	// int
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
		
	// double
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	
//=============== SAÍDAS E JOPTIONPANE ===============
	public static void main(String[] args) {
		
		// Saudação/explicação para o usuário
		String Saudacao = ("Olá, bem-vindo(a) ao projeto FeedBack! Uma nova forma de ajudar no problema da fome mundial." + 
						   "\nAo se cadastrar em nossa plataforma, você se tornará nosso parceiro e poderá tanto ajudar" +
						   "\npessoas que precisam, quanto se cadastrar como uma pessoa que necessita de ajuda." +
						   "\n                                                                         Vamos lá?");
		JOptionPane.showMessageDialog(null, Saudacao);;
		
		
// ================	SCANNER (para a escolha de cadastro do usuário de acordo com a opção escolhida)  ================
		Scanner teclado = new Scanner(System.in);
		int resposta = 0;
		
		System.out.println("==============================" +
				   "\nComo deseja se cadastrar?" +
				   "\n------------------------------" +
				   "\n1 - PESSOA FÍSCA / FAMÍLIA" +
				   "\n2 - ONG PARCEIRA" +
				   "\n3 - EMPRESA PARCEIRA" +
				   "\n4 - MERCADO PARCEIRO" +
				   "\n==============================" );
		resposta = teclado.nextInt();
	
		
// ================	MATCHCASE/SWITCH (o usuário vai preencher os dados de acordo com sua escolha de cadastro)  ================

	
		switch(resposta) {
			case 1:
				PessoaFisica objPessoaFisica = new PessoaFisica(texto("Nome*: "), 
						texto("Emailᵒ: "),
						texto("Telefone celularᵒ: "),
						texto("CPF*: "),
						texto("RG*: "),
						decimal("Renda mensal familiar*: "));

				System.out.println("\n========= DADOS PESSOA FÍSICA / FAMÍLIA =========" +
						   "\nNome: " + objPessoaFisica.getNome() +
						   "\nEmail: " + objPessoaFisica.getEmail() +
						   "\nTelefone celular: " + objPessoaFisica.getTelefone() +
						   "\nCPF: " + objPessoaFisica.getCpf() +
						   "\nRG: " + objPessoaFisica.getRg() +
						   "\nRenda mensal familiar: " + objPessoaFisica.getRendaMensalFamiliar() +
						   "\nCadastrado como: " + objPessoaFisica.identificacao());
				break;
			case 2: 
				Ong objOng = new Ong(texto("Nome da ONG*: "), 
					     texto("Email da ONG*: "),
					     texto("Telefone da ONG*: "),
					     texto("CNPJ da ONG*: "),
					     texto("Razão social da ONG*: "));
				
				System.out.println("\n========= DADOS DA ONG PARCEIRA =========" +
						   "\nNome da ONG: " + objOng.getNome() +
						   "\nEmail da ONG: " + objOng.getEmail() +
						   "\nTelefone  da ONG: " + objOng.getTelefone() +
						   "\nCNPJ da ONG: " + objOng.getCnpjOng() +
						   "\nRazão social da ONG: " + objOng.getRazaoSocialOng() +
						   "\nCadastrado como: " + objOng.identificacao());
				break;
			case 3: 
				Empresa objEmpresa = new Empresa(texto("Nome da empresa*: "), 
					     texto("Email da empresa*: "),
					     texto("Telefone da empresa*: "),
					     texto("CNPJ da empresa*: "),
					     texto("Razão social da empresa*: "),
					     decimal("Renda mensal da empresa*: "));
				
				System.out.println("\n========= DADOS DA EMPRESA PARCEIRA =========" +
						   "\nNome da Empresa: " + objEmpresa.getNome() +
						   "\nEmail da Empresa: " + objEmpresa.getEmail() +
						   "\nTelefone  da Empresa: " + objEmpresa.getTelefone() +
						   "\nCNPJ da Empresa: " + objEmpresa.getCnpjEmpresa() +
						   "\nRazão social da Empresa: " + objEmpresa.getRazaoSocialEmpresa() +
						   "\nRenda mensal da Empresa: " + objEmpresa.getRendaMensalEmpresa() +
						   "\nCadastrado como: " + objEmpresa.identificacao());
				break;
			case 4:
				Mercado objMercado = new Mercado(texto("Nome do mercado*: "), 
					     texto("Email do mercado*: "),
					     texto("Telefone do mercado*: "),
					     texto("CNPJ do mercado*: "),
					     texto("Razão social do mercado*: "),
					     decimal("Renda mensal do mercado*: "));
				
				System.out.println("\n========= DADOS DO MERCADO PARCEIRO =========" +
						   "\nNome do Mercado: " + objMercado.getNome() +
						   "\nEmail do Mercado: " + objMercado.getEmail() +
						   "\nTelefone do Mercado: " + objMercado.getTelefone() +
						   "\nCNPJ do Mercado: " + objMercado.getCnpjMercado() +
						   "\nRazão social do Mercado: " + objMercado.getRazaoSocialMercado() +
						   "\nRenda mensal do Mercado: " + objMercado.getRendaMensalMercado() +
						   "\nCadastrado como: " + objMercado.identificacao());
				break;
			default: 
				System.out.println("Ops, opção inválida!");
				break;
		}
// ======================= IF (para fazer com que o endereço não apareça caso o usuário digite uma opção inválida) ========================
		if(resposta == 1){
			Endereco objEndereco = new Endereco(texto("Logradouro*: "),
					texto("Complementoᵒ: "),
	                inteiro("Número*: "),
	                texto("CEP*: "),
	                texto("Bairro*: "),
	                texto("Município*: "),
	                texto("Estado*: "),
	                texto("Nacionalidade*: "));
			System.out.println("==================== ENDEREÇO ====================" +
					   "\nLogradouro: " + objEndereco.getLogradouro() +
					   "\nComplemento: " + objEndereco.getComplemento() +
					   "\nNúmero: " + objEndereco.getNumero() +
					   "\nCEP: " + objEndereco.getCep() +
					   "\nBairro: " + objEndereco.getBairro() +
					   "\nMunicípio: " + objEndereco.getMunicipio() +
					   "\nEstado: " + objEndereco.getEstado() +
					   "\nNacionalidade: " + objEndereco.getNacionalidade());
		}
		if(resposta == 2){
			Endereco objEndereco = new Endereco(texto("Logradouro*: "),
					texto("Complementoᵒ: "),
	                inteiro("Número*: "),
	                texto("CEP*: "),
	                texto("Bairro*: "),
	                texto("Município*: "),
	                texto("Estado*: "),
	                texto("Nacionalidade*: "));
			System.out.println("==================== ENDEREÇO ====================" +
					   "\nLogradouro: " + objEndereco.getLogradouro() +
					   "\nComplemento: " + objEndereco.getComplemento() +
					   "\nNúmero: " + objEndereco.getNumero() +
					   "\nCEP: " + objEndereco.getCep() +
					   "\nBairro: " + objEndereco.getBairro() +
					   "\nMunicípio: " + objEndereco.getMunicipio() +
					   "\nEstado: " + objEndereco.getEstado() +
					   "\nNacionalidade: " + objEndereco.getNacionalidade());
		}
		if(resposta == 3){
			Endereco objEndereco = new Endereco(texto("Logradouro*: "),
					texto("Complementoᵒ: "),
	                inteiro("Número*: "),
	                texto("CEP*: "),
	                texto("Bairro*: "),
	                texto("Município*: "),
	                texto("Estado*: "),
	                texto("Nacionalidade*: "));
			System.out.println("==================== ENDEREÇO ====================" +
					   "\nLogradouro: " + objEndereco.getLogradouro() +
					   "\nComplemento: " + objEndereco.getComplemento() +
					   "\nNúmero: " + objEndereco.getNumero() +
					   "\nCEP: " + objEndereco.getCep() +
					   "\nBairro: " + objEndereco.getBairro() +
					   "\nMunicípio: " + objEndereco.getMunicipio() +
					   "\nEstado: " + objEndereco.getEstado() +
					   "\nNacionalidade: " + objEndereco.getNacionalidade());
		}
		if(resposta == 4){
			Endereco objEndereco = new Endereco(texto("Logradouro*: "),
					texto("Complementoᵒ: "),
	                inteiro("Número*: "),
	                texto("CEP*: "),
	                texto("Bairro*: "),
	                texto("Município*: "),
	                texto("Estado*: "),
	                texto("Nacionalidade*: "));
			System.out.println("==================== ENDEREÇO ====================" +
					   "\nLogradouro: " + objEndereco.getLogradouro() +
					   "\nComplemento: " + objEndereco.getComplemento() +
					   "\nNúmero: " + objEndereco.getNumero() +
					   "\nCEP: " + objEndereco.getCep() +
					   "\nBairro: " + objEndereco.getBairro() +
					   "\nMunicípio: " + objEndereco.getMunicipio() +
					   "\nEstado: " + objEndereco.getEstado() +
					   "\nNacionalidade: " + objEndereco.getNacionalidade());
		}
		
		
// ======== CASE DÚVIDAS/ DOAÇÃO (resposta para possíveis dúvidas dos usuários, e caso queriam doar alguma quantia) =================
		  int respostaAcao = 0;
		  int respostaDuvida = 0;
		  int respostaPagamento = 0;
			System.out.println("\n\n==============================" +
					   "\nComo deseja prosseguir?" +
					   "\n------------------------------" +
					   "\n1 - REALIZAR DOAÇÃO" +
					   "\n2 - DÚVIDAS" +
					   "\n0 - FECHAR PROGRAMA" +
					   "\n==============================" );
		 respostaAcao = teclado.nextInt();		
		switch (respostaAcao) {
		case 0: 
			break;
		case 1:
			System.out.println("\n\n==============================" +
					   "\nQual a forma de pagamento?" +
					   "\n------------------------------" +
					   "\n1 - PIX" +
					   "\n2 - CARTÃO" +
					   "\n0 - FECHAR PROGRAMA" +
					   "\n==============================" );
		 respostaPagamento = teclado.nextInt();		
		 switch (respostaPagamento) {
		case 0:
			break;
		case 1: 
			Pix objPix = new Pix(decimal("Valor da doação: "),
								 texto("Data do pagamento: "),
								 texto("Tipo de chave: "),
								 texto("Código da chave: "));
			
			System.out.println("\n========= PAGAMENTO VIA PIX =========" + 
							"\nValor da doação: " + objPix.getValorPagamento() +
							"\nData do pagamento: " + objPix.getDataPagamento() +
							"\nTipo de chave PIX: " + objPix.getTipoChave() +
							"\nCódigo da chave PIX: " + objPix.getCodigoChave());
			break;
		case 2:
			Cartao objCartao = new Cartao(decimal("Valor da doação: "),
										 texto("Data do pagamento: "),
										 texto("Número do Cartão: "),
										 texto("Bandeira: "),
										 texto("Data de vencimento: "),
										 texto("Tipo de cartão [DÉBITO/CRÉDITO]: "));
			
			System.out.println("\n========= PAGAMENTO VIA PIX =========" + 
					"\nValor da doação: " + objCartao.getValorPagamento() +
					"\nData do pagamento: " + objCartao.getDataPagamento() +
					"\nNúmero do cartão: " + objCartao.getNumeroCartao() +
					"\nBandeira do cartão: " + objCartao.getBandeiraCartao() +
					"\nData de vencimento: " + objCartao.getDataVencimentoCartao() + 
					"\nTipo de cartão: " + objCartao.getTipoCartao());
			break;
		default:
			System.out.println("Ops, opção inválida!");
		}
		 System.out.println("\n===================================================" +
				 "\nSua ajuda é de suma importância! Obrigado pela colaboração.");
			break;
		case 2:
			System.out.println("\n\n==============================" +
					   "\nDÚVIDAS COMUNS" +
					   "\n------------------------------" +
					   "\n1 - Como posso fazer uma doação para o programa?" +
					   "\n2 - Existe um valor mínimo ou máximo para as doações?" +
					   "\n3 - Posso fazer uma doação em nome de outra pessoa?" +
					   "\n4 - Quais são os métodos de pagamento aceitos para as doações?" +
					   "\n==============================" );
			respostaDuvida = teclado.nextInt();
			switch(respostaDuvida) {
					case 1:
						JOptionPane.showMessageDialog(null, "Você pode fazer uma doação para o programa por meio do nosso website oficial, \npreenchendo o formulário de doação online.");
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Não há um valor mínimo estabelecido para as doações.\nAceitamos qualquer contribuição, desde pequenas até grandes doações.\nQuanto ao valor máximo, não há restrições, e você pode doar a quantia que desejar.");
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Sim, você pode fazer uma doação em nome de outra pessoa.\nAo preencher o formulário de doação, você terá a opção de especificar o nome do doador.");
						break;
					case 4:
						JOptionPane.showMessageDialog(null, "Aceitamos diversos métodos de pagamento, incluindo cartões de crédito, débito,\nboleto e serviços de pagamento online, como Pix.");
						break;
					default: 
						JOptionPane.showMessageDialog(null, ("Ops, opção inválida!"));
					}
			break;
		default:
			JOptionPane.showMessageDialog(null, ("Ops, opção inválida!"));
		}
 System.out.println("\nPrograma finalizado. Volte sempre!");		
	}
}