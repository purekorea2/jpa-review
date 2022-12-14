package io.pragra.jpareview.repo;

import io.pragra.jpareview.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepo extends JpaRepository<Order, UUID> {

}
