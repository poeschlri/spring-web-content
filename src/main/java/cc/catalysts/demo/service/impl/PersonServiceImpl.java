package cc.catalysts.demo.service.impl;

import cc.catalysts.demo.model.Person;
import cc.catalysts.demo.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MacBookRP on 09.02.16.
 */

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public List<Person> findAll() {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Richard", "Pöschl"));
        personList.add(new Person("Herbert", "Blaschek"));

        return personList;
    }
}
