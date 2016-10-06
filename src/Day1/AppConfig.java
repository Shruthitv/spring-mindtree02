package Day1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
//	@Bean(name="bata1")
//	public Bata getBataShoe(){
//		return new Bata();
//	}
//	
//	@Bean(name="bata2")
//	public Bata getnewBataShoe(){
//		return new Bata();
//	}
//	
//	@Bean(name="puma1")
//	@Scope("prototype")
//	public Puma getNewPuma(){
//		return new Puma();
//	}
	
	
	//DI
	@Bean
	@Scope("prototype")
	public Bata getBataShoe(){
		return new Bata();
	}
	
	@Bean
	@Scope("prototype")
	public ShoeShowRoom getNewShoeShowRoom(){
		return new ShoeShowRoom();
	}
	
	@Bean(name="multishowroom")
	Shoe[] getNew(){
		Shoe s[] = new Bata[10];
		for(int i = 0; i < s.length; i++){
			s[i] = new Bata();
		}
		return s;
	}
	
	@Bean
	MutiShowRoom getmsr(){
		return new MutiShowRoom();
	}

}
