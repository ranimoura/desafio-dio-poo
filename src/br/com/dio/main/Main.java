package br.com.dio.main;

import java.time.LocalDate;

import br.com.dio.domain.Bootcamp;
import br.com.dio.domain.Course;
import br.com.dio.domain.Dev;
import br.com.dio.domain.Mentoring;

public class Main {

	public static void main(String[] args) {
		
		// CURSOS:
		
		Course c1 = new Course();
		c1.setTitle("Curso Java");
		c1.setDescription("Exemplo de descrição do curso Java");
		c1.setWorkload(8);

		Course c2 = new Course();
		c1.setTitle("Curso JavaScript");
		c1.setDescription("Exemplo de descrição do curso JavaScript");
		c1.setWorkload(4);

		// MENTORIA:

		Mentoring mentoring = new Mentoring();
		mentoring.setTitle("Mentoria de Java");
		mentoring.setDescription("Exemplo de descrição da mentoria de Java");
		mentoring.setDate(LocalDate.now());

		// BOOTCAMP:
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setBootcampName("Bootcamp Java Developer");
		bootcamp.setDescription("Exemplo de descrição do Bootcamp Java Developer");
		bootcamp.getContents().add(c1);
		bootcamp.getContents().add(c2);
		bootcamp.getContents().add(mentoring);

		// DEV:
		
		Dev dev = new Dev();
		dev.setDevName("Raniere");
		dev.registerBootcamp(bootcamp);
		
		// EXEMPLO DE EXECUÇÃO:
		
		System.out.println("Conteúdos Inscritos - Raniere: " + dev.getSubscribedContent());
		dev.progress();
		dev.progress();

		System.out.println("----------");
		System.out.println("Conteúdos Inscritos - Raniere: " + dev.getSubscribedContent());
		System.out.println("Conteúdos Concluídos - Raniere: " + dev.getCompletedContent());
		System.out.println("XP: " + dev.calculateTotalXp());

		System.out.println("----------");

	}
}
