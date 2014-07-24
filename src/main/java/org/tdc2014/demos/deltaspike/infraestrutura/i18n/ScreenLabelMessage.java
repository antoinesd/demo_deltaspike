package org.tdc2014.demos.deltaspike.infraestrutura.i18n;

import javax.inject.Named;

import org.apache.deltaspike.core.api.message.MessageBundle;
import org.apache.deltaspike.core.api.message.MessageTemplate;

@Named
@MessageBundle
public interface ScreenLabelMessage {
    
    public String usuario();
    
    @MessageTemplate("{password}")
    public String senha();
    
    public String confirmaSenha();

    public String registrarUsuario();
    
    public String cancelar();
    
    public String registrar();
    
    public String configuracoes();
    
    public String filaJMS();
}
