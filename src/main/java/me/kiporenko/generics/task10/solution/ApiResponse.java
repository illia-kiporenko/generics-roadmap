package me.kiporenko.generics.task10.solution;

public class ApiResponse<T> {
	private T data;
	private String status;

	public ApiResponse(T data, String status) {
		this.data = data;
		this.status = status;
	}

	public T getData() {
		return data;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "ApiResponse{" +
				"data=" + data +
				", status='" + status + '\'' +
				'}';
	}
}
