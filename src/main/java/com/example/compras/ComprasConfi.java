package com.example.compras;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
class ComprasConfi extends WsConfigurerAdapter {

    @Bean
    public XsdSchema comprasSchema() {
        return new SimpleXsdSchema(new ClassPathResource("compras.xsd"));
    }

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/ws/*");
    }

    @Bean(name = "compras")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema comprasSchema) {
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("comprasPort");
        wsdl.setLocationUri("/ws");
        wsdl.setTargetNamespace("https://t4is.uv.mx/compras");
        wsdl.setSchema(comprasSchema);
        return wsdl;
    }
}