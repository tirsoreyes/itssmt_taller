package itssmt.taller.retrofit;


import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

import itssmt.taller.modelo.Alumno;
import itssmt.taller.modelo.GenericResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface AccountMSService {
	
	
	// service-user 
	@POST("service-user/login")
	Call<GenericResponse<String>> login( @Body Alumno alumno);
	
	
	
	
	

	
}
