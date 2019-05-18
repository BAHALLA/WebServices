package com.ws.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class MyConfig {

    @Bean
    public SimpleJaxWsServiceExporter getWS() {
        SimpleJaxWsServiceExporter exporter =new SimpleJaxWsServiceExporter();
        exporter.setBaseAddress("http://localhost:9095/banque");
        return exporter;
    }
}
