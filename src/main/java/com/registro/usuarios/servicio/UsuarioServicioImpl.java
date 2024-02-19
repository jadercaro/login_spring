package com.registro.usuarios.servicio;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.registro.usuarios.dto.UsuarioRegistroDto;
import com.registro.usuarios.modelo.Rol;
import com.registro.usuarios.modelo.Usuario;
import com.registro.usuarios.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

	private UsuarioRepositorio usuarioRepositorio;

	public UsuarioServicioImpl(UsuarioRepositorio usuarioRepositorio) {
		super();
		this.usuarioRepositorio = usuarioRepositorio;
	}

	@Override
	public Usuario save(UsuarioRegistroDto registroDto) {
		Usuario usuario = new Usuario(registroDto.getNombre(), registroDto.getApellido(), registroDto.getEmail(),
				registroDto.getPassword(), Arrays.asList(new Rol("ROL_USER")));
		
		return usuarioRepositorio.save(usuario);
	}

}
