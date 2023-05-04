package com.discaptraining.apimedicalhistory.mensajeria.client;

import com.discaptraining.apimedicalhistory.domain.entity.DiscapUser;
import com.discaptraining.apimedicalhistory.service.UserService;
import com.discaptraining.apimedicalhistory.util.gson.MapperJsonObjeto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ReceiverMessagesBroker {

    @Autowired
    private UserService userService;

    private final MapperJsonObjeto mapperJsonObjeto;

    public ReceiverMessagesBroker(MapperJsonObjeto mapperJsonObjeto) {
        this.mapperJsonObjeto = mapperJsonObjeto;
    }


    @RabbitListener(queues = "${apidiscapuser.queue-recibir.client}")
    public void receiveMessageProcessClient(String message) {
        try {
            userService.saveDiscapUser(obtenerObjetoDeMensaje(message).get());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private Optional<DiscapUser> obtenerObjetoDeMensaje(String mensaje) {
        return mapperJsonObjeto.ejecutar(mensaje, DiscapUser.class);
    }

}
