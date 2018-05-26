package itssmt.taller.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import itssmt.taller.retrofit.AccountMSService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class GeneralConfig {
	
	@Value("${citat1.zuul.server.url}")
	String zuul;
	
		@Bean
	public Properties properties() {
		return new Properties();
	}
		
		@Bean
		// Trailing slash is needed
		public AccountMSService defaultMSConfig() {
			Retrofit retrofit = new Retrofit.Builder()
					.baseUrl(zuul)
					.addConverterFactory(GsonConverterFactory.create())
					.build();
			
			return retrofit.create(AccountMSService.class);
			
		}
		
}
