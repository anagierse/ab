package receitas;
//Ana Clara Gierse Raymundo 10428453
//Luana Domingo Branco 10428459
//Victor Luiz de Sá Alves 10426310
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Classe principal que inicia a aplicação Spring Boot.
 * 
 * A anotação @SpringBootApplication configura automaticamente os componentes do Spring, 
 * e o método main é responsável por inicializar a aplicação.
 * 
 * @author Ana Clara Gierse Raymundo 10428453
 * @author Luana Domingo Branco 10428459
 * @author Victor Luiz de Sá Alves 10426310
 */
@SpringBootApplication
public class ReceitasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReceitasApplication.class, args);
	}

}
