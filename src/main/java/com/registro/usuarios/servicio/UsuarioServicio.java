package com.registro.usuarios.servicio;

import com.registro.usuarios.dto.UsuarioRegistroDto;
import com.registro.usuarios.modelo.Usuario;

public interface UsuarioServicio {
	
	public Usuario save(UsuarioRegistroDto registroDto);
	
}
