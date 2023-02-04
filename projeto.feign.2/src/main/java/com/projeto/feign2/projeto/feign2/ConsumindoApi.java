package com.projeto.feign2.projeto.feign2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// Diz qual a url da nossa api
@FeignClient(name="agenda", url="http://localhost:8080/contato")
public interface ConsumindoApi {

    @RequestMapping(method = RequestMethod.GET, value="/")
    Contato retornaContato();

}