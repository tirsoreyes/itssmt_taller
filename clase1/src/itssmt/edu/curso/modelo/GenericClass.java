package itssmt.edu.curso.modelo;

public class GenericClass <T>{

	private int code;
	private String mensaje;
	private T respuesta;
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public T getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(T respuesta) {
		this.respuesta = respuesta;
	}
	
	
	
	
	
}
