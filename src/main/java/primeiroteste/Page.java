package primeiroteste;

public class Page
{
	// Cadasto de Usuários
	
	public String botao1 = "(//*[@class=\"btn waves-light orange\"])[1]";
	public String formulario = "//*[contains(text(),\"Formulário\")]";
	public String usuario = "//*[contains(text(),\"Criar Usuários\")]";
	public String name = "//*[@id=\"user_name\"]";
	public String lastname = "//*[@id=\"user_lastname\"]";
	public String email = "//*[@id=\"user_email\"]";
	public String endereco = "//*[@id=\"user_address\"]";
	public String universidade = "//*[@id=\"user_university\"]";	
	public String profissao = "//*[@id=\"user_profile\"]";
	public String genero = "//*[@id=\"user_gender\"]";
	public String idade = "//*[@id=\"user_age\"]";
	public String criar = "//*[@value=\"Criar\"]";
	public String validacao = "//*[contains(text(), \"Usuário Criado com sucesso\")]";
	
	// Mapeamento de botoes
	
	public String btnbuscadeelementos = "//*[contains(text(), \"Busca de elementos\")]";
	public String btnbotoes = "//*[contains(text(), \"Botões\")]";
	public String btnRaised = "//*[@onclick=\"ativaedesativa1()\"]";
	public String btnFloating = "//*[@onclick=\"ativaedesativa2()\"]";
	public String btnFlat ="//*[@onclick=\"ativaedesativa3()\"]";
	public String btnSubmit = "//*[@onclick=\"ativaedesativa4()\"]";
	public String btnDisable ="(//*[contains(text(), \"Button\")])[2]";
	
	
	
	
	
			
}
