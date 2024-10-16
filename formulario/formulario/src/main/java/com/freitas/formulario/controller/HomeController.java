package com.freitas.formulario.controller;

import com.freitas.formulario.dto.house.HouseDto;
import com.freitas.formulario.service.HouseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/houses", produces = {"application/json"})
@Tag(name = "Corretora de imóveis")


public class HomeController {

    @Autowired
    private HouseService houseService; //Declarando uma variável que é do tipo HouseService(Nossa classe para serviço), ela sera utilizada para realizar nossas operações por aqui

    @Operation(summary = "Busca e retorna todos os imóveis registrados", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar o busca por imóveis"),
    })
    @GetMapping
    public List<HouseDto> getAllHouses() { //Chamando o metodo getHouses que foi criado em HouseService
        return houseService.getAllHouses(); //chamando noss variável para retornar o metodo que ela tem herdado da classe HouseService e nos trazer todos os objetos da lista
    }

    @Operation(summary = "Busca e retorna um imóvel de acordo com o ID fornecido", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar o busca pelo imóvel"),
    })
    @GetMapping("/{id}")
    public ResponseEntity<HouseDto> getHouseById(@PathVariable int id) { //especificando que o id deve ser utilizado para a requisição
        HouseDto house = houseService.getHouseById(id); //Instanciando house como um objeto que receberá o resultado da busca
        return ResponseEntity.ok(house); //Retornando o que foi solicitado, "ok" é um metodo da classe ResponseEntity que indica os estado de "tudo certo" perante a operação
    }

    @Operation(summary = "Registra um novo imóvel", method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Imóvel cadastrado com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar o cadastrar imóvel"),
    })
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HouseDto> createHouse(@RequestBody HouseDto houseDto) {
        HouseDto newHouse = houseService.createHouse(houseDto);
        return ResponseEntity.ok(newHouse);
    }

    @Operation(summary = "Atualiza os dados de um imóvel de acordo com o ID correspondente fornecido", method = "PUT")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Imóvel atualizado com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar o atualizar imóvel"),
    })
    @PutMapping("/{id}")
    public ResponseEntity<HouseDto> updateHouse(@PathVariable int id, @RequestBody HouseDto houseDto) {
        HouseDto updatedHouse = houseService.updateHouse(id, houseDto);
        return ResponseEntity.ok(updatedHouse);
    }

    @Operation(summary = "Apaga o imóvel conrrespondente ao ID fornecido", method = "DELETE")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Imóvel apagado com sucesso com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao apagar o imóvel"),
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHouse(@PathVariable int id) {
        houseService.deleteHouse(id);
        return ResponseEntity.noContent().build();
    }
}

