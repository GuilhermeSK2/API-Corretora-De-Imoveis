package com.freitas.formulario.controller;

import com.freitas.formulario.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    // Lista em memória para armazenar as pessoas
    private List<Person> persons = new ArrayList<>();
    private int nextId = 1;

    // Endpoint para listar todas as pessoas
    @GetMapping
    public List<Person> getAllPersons() {
        return persons;
    }

    // Endpoint para adicionar uma nova pessoa
    @PostMapping
    public Person addPerson(@RequestBody Person person) {
        person.setId(nextId++);
        persons.add(person);  // Adiciona a pessoa à lista
        return person;  // Retorna a pessoa adicionada
    }

    @PutMapping("/{id}") // Corrigindo o mapeamento para incluir o ID na URL
    public String updatePerson(@PathVariable int id, @RequestBody Person updatedPerson) {
        for (Person person : persons) {
            if (person.getId() == id) { // Comparando diretamente, já que ambos são int
                person.setFName(updatedPerson.getFName());
                person.setLName(updatedPerson.getLName());
                person.setAge(updatedPerson.getAge());
                person.setJob(updatedPerson.getJob());
                person.setAddress(updatedPerson.getAddress());
                return "Pessoa atualizada com sucesso!"; // Retornando uma String de sucesso
            }
        }
        return "Pessoa não encontrada!"; // Retorno caso a pessoa não seja encontrada
    }

    @DeleteMapping("/{id}") // Corrigindo o mapeamento para incluir o ID na URL
    public String deletePerson(@PathVariable int id) {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId() == id) { // Comparando diretamente, já que ambos são int
                iterator.remove();
                return "Pessoa removida com sucesso!";
            }
        }
        return "Pessoa não encontrada!"; // Retorno caso a pessoa não seja encontrada
    }
}
