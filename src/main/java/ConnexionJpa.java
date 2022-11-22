import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import dto.FilmDto;



public class ConnexionJpa {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("moovie_database");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		ObjectMapper mapper= new ObjectMapper();
		List<FilmDto> film= mapper.readValue(new File("C:\\work-space-java-2\\MovieDataBase\\src\\main\\java\\films.json"), new TypeReference<List<FilmDto>>() {}); 
		
//		for (FilmDto fil2 : film) {
			System.out.println(film.get(0));
//		}

	}

}
