package io.pragra.jpareview.service;

import io.pragra.jpareview.entity.Order;
import io.pragra.jpareview.exceptions.OrderNotFoundException;
import io.pragra.jpareview.repo.OrderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepo repo;

    public Order createOrder(Order o) {
        return this.repo.save(o);
    }

    public List<Order> createMany(List<Order> orders) {
        return this.repo.saveAll(orders);
    }

    public Order findById(String uuidString) {
        UUID uuid = UUID.fromString(uuidString);
        Optional<Order> byId = repo.findById(uuid);
        return byId.orElseThrow(()->new OrderNotFoundException("Order for UUID doesn't exitst"));
    }

    public List<Order> findAll(){
        return repo.findAll();
    }
}


