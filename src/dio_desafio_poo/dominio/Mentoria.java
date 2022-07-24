package dio_desafio_poo.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Mentoria extends Conteudo {
	
	
	private LocalDate data;
	
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
	public Mentoria() {
		
	}


	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data.format(formatter) + "]";
	}
	
     
	}


	
		
	

	
		
	
	
	
	
	
	


