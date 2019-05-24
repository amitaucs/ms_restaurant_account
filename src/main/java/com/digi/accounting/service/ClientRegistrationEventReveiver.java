package com.digi.accounting.service;

import com.digi.accounting.model.EventApiClientRegistration;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class ClientRegistrationEventReveiver {

    public void receiveClientRegisteredEvent(byte[] message) {

        String massageFromRabbitMQ = new String(message);
        log.info("Client registration event received  :" + massageFromRabbitMQ);
        if (StringUtils.isNotEmpty(massageFromRabbitMQ)) {
            Gson gson = new Gson();
            Optional<EventApiClientRegistration> clientRegistered = Optional.of(gson.fromJson(massageFromRabbitMQ,
                    EventApiClientRegistration.class));

            if (clientRegistered.isPresent())

               log.info(" New client registered :" + clientRegistered.get().getRegisteredForApi());
        }

    }

}
