package org.tdc2014.demos.deltaspike.infraestrutura.exceptions;

public class UsuarioJaCadastradoException extends Exception {
    
    private static final long serialVersionUID = 1L;

    public UsuarioJaCadastradoException(String msg) {
        super(msg);
    }

}
