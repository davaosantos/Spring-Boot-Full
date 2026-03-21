//package io.github.davaosantos.arquitetura;
//
//import org.springframework.boot.Banner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.context.ConfigurableApplicationContext;
//
//@SpringBootApplication
//public class Application {
//
//    public static void main(String[] args) { // args posso usar como parametros por exemplo via docker
////		SpringApplication.run(Application.class, args);
//        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
//        builder.profiles("producao", "homologacao");
//
//        builder.run(args);
//        builder.bannerMode(Banner.Mode.OFF);
//
//        //Contexto da app já iniciada
//        ConfigurableApplicationContext appContext = builder.context();
//        String nomeDaApp = appContext.getEnvironment().getProperty("spring.application.name");
//        System.out.printf("Nome da app %s", nomeDaApp);
//        var produtoRepository = appContext.getBean("produtoRepository");
//
//        builder.properties("spring.datasource.url=jdbc://");
//
//    }
//
//}
