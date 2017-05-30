package Autos.Marcas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Autos.Marcas.converter.AutoConverter;

@Configuration
public class Configuracion {
	@Bean
	(name="normalConverter")
    public AutoConverter getNormalConverter(){
        return  new AutoConverter();

    }

    
}
