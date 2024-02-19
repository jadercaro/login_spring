package com.registro.usuarios.dto;

public class UsuarioRegistroDto {
	private Long Id;
	private String nombre;
	private String apellido;
	private String password;
	private String email;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UsuarioRegistroDto(Long id, String nombre, String apellido, String password, String email) {
		super();
		Id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.email = email;
	}

	public UsuarioRegistroDto() {
		super();
	}

	public UsuarioRegistroDto(String nombre, String apellido, String password, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.email = email;
	}

	public UsuarioRegistroDto(String email) {
		super();
		this.email = email;
	}

}
