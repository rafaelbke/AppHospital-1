
public class Consulta {
	
	
    private String data;
    private int codConsulta;
    
    public void addConsulta(String data, int codConsulta){
    	
    	this.data=data;
    	this.codConsulta=codConsulta;
    	
    	
    }

	public String getData() {
	return data;
	}

	public int getCodigo() {
		return codConsulta;
	}
  
}
