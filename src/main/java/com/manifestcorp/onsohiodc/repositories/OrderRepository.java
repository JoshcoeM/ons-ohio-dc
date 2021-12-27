package com.manifestcorp.onsohiodc.repositories;

import com.manifestcorp.onsdomain.Order;
import com.microsoft.azure.spring.data.cosmosdb.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CosmosRepository<Order, Integer> {

}
