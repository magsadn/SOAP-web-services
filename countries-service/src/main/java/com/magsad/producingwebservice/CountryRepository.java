package com.magsad.producingwebservice;


import com.magsad.producing_web_service.Continent;
import com.magsad.producing_web_service.Country;
import com.magsad.producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Continent northAmerica = new Continent();
        northAmerica.setId(1);
        northAmerica.setName("North America");

        Continent southAmerica = new Continent();
        southAmerica.setId(2);
        southAmerica.setName("South America");

        Continent europe = new Continent();
        europe.setId(3);
        europe.setName("Europe");

        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);
        spain.setContinent(europe);

        countries.put(spain.getName(), spain);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);
        poland.setContinent(europe);

        countries.put(poland.getName(), poland);

        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(63705000);
        uk.setContinent(europe);

        countries.put(uk.getName(), uk);

        Country usa = new Country();
        usa.setName("United States America");
        usa.setCapital("Washington");
        usa.setCurrency(Currency.USD);
        usa.setPopulation(334014915);
        usa.setContinent(northAmerica);

        Country brazil = new Country();
        brazil.setName("Brazil");
        brazil.setCapital("Brasilia");
        brazil.setCurrency(Currency.BRL);
        brazil.setPopulation(214910361);
        brazil.setContinent(southAmerica);
    }

    public Country findCountry(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return countries.get(name);
    }
}
