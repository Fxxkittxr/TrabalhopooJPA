package com.poo.springjpademo;

import com.poo.springjpademo.entity.*;
import com.poo.springjpademo.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringjpademoApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringjpademoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringjpademoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(cursoRepository cursoRepository, 
								turmaRepository turmaRepository, 
								professorRepository professorRepository, 
								materiaRepository materiaRepository,
								horarioRepository horarioRepository,
								salaRepository salaRepository,
								planoaulaRepository planoaulaRepository,
								dataRepository dataRepository
								) {

		return (args) -> {
			log.info("Adicionando dados CURSO");
			cursoRepository.save(new Curso("Engenharia de Sorftware"));
			cursoRepository.save(new Curso("Sistemas da Informação"));
			var c1 = cursoRepository.findById(1L);
			var c2 = cursoRepository.findById(2L);

			log.info("Adicionando dados TURMA");
			turmaRepository.save(new Turma("1SEM", c1.get()));
			turmaRepository.save(new Turma("2SEM", c1.get()));
			turmaRepository.save(new Turma("3SEM", c1.get()));
			turmaRepository.save(new Turma("4SEM", c1.get()));
			var t1 = turmaRepository.findById(1L);
			var t2 = turmaRepository.findById(2L);
			var t3 = turmaRepository.findById(3L);
			var t4 = turmaRepository.findById(4L);
			
			log.info("Adicionando dados PROFESSOR");
			professorRepository.save(new Professor("Leanderson"));
			professorRepository.save(new Professor("Vanessa"));
			professorRepository.save(new Professor("Walter"));
			professorRepository.save(new Professor("Chaiene"));
			var p1 = professorRepository.findById(1L);
			var p2 = professorRepository.findById(2L);
			var p3 = professorRepository.findById(3L);
			var p4 = professorRepository.findById(4L);

			log.info("Adicionando dados MATERIA");
			materiaRepository.save(new Materia("POO", p1.get()));
			materiaRepository.save(new Materia("ETI", p2.get()));
			materiaRepository.save(new Materia("COM", p3.get()));
			materiaRepository.save(new Materia("REQ", p4.get()));
			var m1 = materiaRepository.findById(1L);
			var m2 = materiaRepository.findById(2L);
			var m3 = materiaRepository.findById(3L);
			var m4 = materiaRepository.findById(4L);

			log.info("Adicionando dados HORARIO");
			horarioRepository.save(new Horario("18:55", "20:35"));
			horarioRepository.save(new Horario("20:50", "22:30"));
			var h1 = horarioRepository.findByAula(1L);
			var h2 = horarioRepository.findByAula(2L);
			
			log.info("Adicionando dados SALA");
			salaRepository.save(new Sala("S01"));
			salaRepository.save(new Sala("S02"));
			salaRepository.save(new Sala("S03"));
			salaRepository.save(new Sala("S04"));
			var s1 = salaRepository.findBynomeSala("S01");
			var s2 = salaRepository.findBynomeSala("S02");
			var s3 = salaRepository.findBynomeSala("S03");
			var s4 = salaRepository.findBynomeSala("S04");

			log.info("Adicionando dados PLANO-AULA");
			//Software turma 1
			planoaulaRepository.save(new PlanoAula("PA1", s1.get(), h1.get(), m1.get(), t1.get()));
			planoaulaRepository.save(new PlanoAula("PA2", s2.get(), h2.get(), m2.get(), t1.get()));
			//Software turma 2
			planoaulaRepository.save(new PlanoAula("PA3", s2.get(), h1.get(), m2.get(), t2.get()));
			planoaulaRepository.save(new PlanoAula("PA4", s3.get(), h2.get(), m3.get(), t2.get()));
			//Sistemas turma 1 
			planoaulaRepository.save(new PlanoAula("PA5", s3.get(), h1.get(), m3.get(), t3.get()));
			planoaulaRepository.save(new PlanoAula("PA6", s4.get(), h2.get(), m4.get(), t3.get()));
			//Sistemas turma 2
			planoaulaRepository.save(new PlanoAula("PA7", s4.get(), h1.get(), m4.get(), t4.get()));
			planoaulaRepository.save(new PlanoAula("PA8", s1.get(), h2.get(), m1.get(), t4.get()));

			var pa1 = planoaulaRepository.findByPlanoAula("PA1");
			var pa2 = planoaulaRepository.findByPlanoAula("PA2");
			var pa3 = planoaulaRepository.findByPlanoAula("PA3");
			var pa4 = planoaulaRepository.findByPlanoAula("PA4");
			var pa5 = planoaulaRepository.findByPlanoAula("PA5");
			var pa6 = planoaulaRepository.findByPlanoAula("PA6");
			var pa7 = planoaulaRepository.findByPlanoAula("PA7");
			var pa8 = planoaulaRepository.findByPlanoAula("PA8");

			log.info("Adicionando dados DATA"); //tirar duvidas por que não funciona
			dataRepository.save(new Data("29-04-2024", pa1.get(), pa2.get(), pa3.get(), pa4.get(), pa5.get(), pa6.get(), pa7.get(), pa8.get()));
			var d1 = dataRepository.findById(1L);

			log.info(" Data"); //como printar os dados no console
			for(var d : dataRepository.findAll()){
				log.info(d.toString());
			}
			p3 = professorRepository.findById(3L);
			log.info("-------------------------------");
			log.info(" Materias  prof vanessa");
			for(var d : materiaRepository.findAllByProfessor(p2.get())){
				log.info(d.toString());
			}
		};
	}

}
