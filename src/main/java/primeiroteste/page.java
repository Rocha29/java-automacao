package primeiroteste;

public class page
{
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
}
