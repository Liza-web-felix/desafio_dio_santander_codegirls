package dio_desafio_poo.dominio;


import java.time.LocalDate;




public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Dominando IDEs com Java");
		curso1.setDescricao("Aprenda a dominar as principais IDEs do mercado");
		curso1.setCargaHoraria(2);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript Essencial");
		curso2.setDescricao("Aprenda JavaScript do Básico ao Avançado");
		curso2.setCargaHoraria(2);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria - Como trabalhar na F1RT");
		mentoria1.setDescricao("Saiba tudo sobre o dia-a-dia DEV na F1RT");
        mentoria1.setData(LocalDate.now());	
        
        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria - Conhecendo as oportunidades do Santander");
        mentoria2.setDescricao("Saiba tudo sobre as oportunidades do Santander");
        mentoria2.setData(LocalDate.now());
      
        
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Santander Mobile Developer");
        bootcamp1.setDescricao("Torne-se um desenvolvedor mobile de sucesso");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria1);
      
        
        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp Santander Code Girls");
        bootcamp2.setDescricao("Torne-se uma DevGirl de sucesso");
        bootcamp2.getConteudos().add(curso1);
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoria1);
        bootcamp2.getConteudos().add(mentoria2);
        
        Dev devLuiza = new Dev();
        devLuiza.setNome("Luiza");
        devLuiza.inscreverBootcamp(bootcamp2);
        System.out.println("Conteudos Inscritos Luiza:" + devLuiza.getConteudosInscritos());  
        devLuiza.progredir();
        devLuiza.progredir();
        devLuiza.progredir();
        devLuiza.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Luiza:" + devLuiza.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Luiza:" + devLuiza.getConteudosConcluidos());
        System.out.println("XP:" + devLuiza.calcularTotalXp());
        
        System.out.println("-------");
        
        Dev devLiz = new Dev();
        devLiz.setNome("Liz");
        devLiz.inscreverBootcamp(bootcamp2);
        System.out.println("Conteudos Inscritos Liz:" + devLiz.getConteudosInscritos());
        devLiz.progredir();
        devLiz.progredir();
        devLiz.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Liz:" + devLiz.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Liz:" + devLiz.getConteudosConcluidos());
        System.out.println("XP:" + devLiz.calcularTotalXp());
        
        System.out.println("-------");
        
        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos Luiz:" + devLuiz.getConteudosInscritos());
        devLuiz.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Luiz:" + devLuiz.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Luiz:" + devLuiz.getConteudosConcluidos());
        System.out.println("XP:" + devLuiz.calcularTotalXp());
        
        System.out.println("-------");
        
        Dev devLuciano = new Dev();
        devLuciano.setNome("Luciano");
        devLuciano.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos Luciano:" + devLuciano.getConteudosInscritos());
        devLuciano.progredir();
        devLuciano.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Luciano:" + devLuciano.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Luciano:" + devLuciano.getConteudosConcluidos());
        
        System.out.println("-------");
        
        System.out.println("<Sem mais conteudos para mostrar, Santander Code Girls F1RST/>");
        		
        

	}

}
