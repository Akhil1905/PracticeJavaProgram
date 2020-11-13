package GenericConcept;

public class Response<R> {
	
	R response;
	Integer status;
	
	
	public R getResponse() {
		return response;
	}
	public void setResponse(R response) {
		this.response = response;
	}
	
	
	@Override
	public String toString() {
		return "Response [response=" + response + ", status=" + status + "]";
	}
	
	

}
