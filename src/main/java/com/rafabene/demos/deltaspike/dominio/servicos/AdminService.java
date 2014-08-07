package com.rafabene.demos.deltaspike.dominio.servicos;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.rafabene.demos.deltaspike.infraestrutura.i18n.Messages;

public class AdminService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Messages applicationMessages;

    @Inject
    private Logger logger;

    public void executarRotinasAdministrativas() {
        logger.info(applicationMessages.tarefaAdminstrativaExecutada());
    }

}
