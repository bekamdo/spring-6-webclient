package com.bekamdo.client;

import com.bekamdo.model.BeerDTO;
import com.fasterxml.jackson.databind.JsonNode;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.concurrent.Flow;

public interface BeerClient {
    Flux<String> listBeer();

    Flux<Map> listBeerMap();

    Flux<JsonNode>listBeersJsonNode();

    Flux<BeerDTO> listBeerDtos();

    Mono<BeerDTO> getBeerById(String id);

    Flux<BeerDTO> getBeerByBeerStyle(String beerStyle);

    Mono<BeerDTO> createBeer(BeerDTO newDto);

    Mono<BeerDTO> updateBeer(BeerDTO beerDTO);
}
