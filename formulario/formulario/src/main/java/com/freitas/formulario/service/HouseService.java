package com.freitas.formulario.service;

import com.freitas.formulario.dto.house.HouseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HouseService {

    private List<HouseDto> houses = new ArrayList<>(); //Lista que receberá os objetos criados durante a execução do nosso programa
    private int nextId = 1; //Variável que vai ser usada para não deixar que os IDs sejam repetidos

    public List<HouseDto> getAllHouses() { //Metodo para retornar os objetos que temos na lista
        return houses; //Retorna o que existe dentro da lista no momento em que
    }

    public HouseDto getHouseById(int id) { //Chamando o metodo getHouseById para pegar o objeto por Id
        return houses.stream()//Iniciando um stream para realizar nossa operações com base no id recebido
                .filter(house -> house.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public HouseDto createHouse(HouseDto houseDto) {
        houseDto.setId(nextId++);
        houses.add(houseDto);
        return houseDto;
    }

    public HouseDto updateHouse(int id, HouseDto houseDto) {
        HouseDto existingHouse = getHouseById(id);
        if (existingHouse != null) {
            houses.remove(existingHouse);
            houseDto.setId(id);  // Assumindo que você tem um campo de ID em HouseDto
            houses.add(houseDto);
        }
        return houseDto;
    }

    public void deleteHouse(int id) {
        houses.removeIf(house -> house.getId() == id);
    }
}
