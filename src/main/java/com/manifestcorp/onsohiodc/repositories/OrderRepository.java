package com.manifestcorp.onsohiodc.repositories;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.manifestcorp.onsdomain.Order;
//import com.microsoft.azure.spring.data.cosmosdb.repository.CosmosRepository;
import com.manifestcorp.onsohiodc.domain.CosmosOrder;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Repository;

@Repository
//public interface OrderRepository extends CosmosRepository<CosmosOrder, Integer> {
public interface OrderRepository extends ReactiveCosmosRepository<CosmosOrder, Integer> {

}

