package com.magsad.consumingwebservice;

import com.magsad.consumingwebservice.wsdl.GetCountryResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsumingWebServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumingWebServiceApplication.class, args);
    }

/*    @Bean
    CommandLineRunner lookup(CountryClient quoteClient) {
        return args -> {
            String country = "Poland";

            if (args.length > 0) {
                country = args[0];
            }
            GetCountryResponse response = quoteClient.getCountry(country);
            System.err.println(response.getCountry().getName());
            System.err.println(response.getCountry().getCapital());
            System.err.println(response.getCountry().getCurrency());
            System.err.println(response.getCountry().getPopulation());
            System.err.println(response.getCountry().getContinent().getName());

        };
    }
        */

}
