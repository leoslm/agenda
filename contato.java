package agenda;

public class Contato {
    
	private String nome;
	private String telefone;

	public Contato(String nome){
    	
	this.nome = nome;
	
	}

	public void setNome(String nome){
	   this.nome = nome;

        }

	public String getNome(){
		return nome;
        }

       
	public void setTelefone(String telefone){
	   this.telefone = telefone;

	}

	public String getTelefone(){
		return telefone;
	}

}