package com.order.rest.service;

import com.order.rest.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Set;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@FeignClient("orderservice")
public interface FeignClientInt {

    @GetMapping(value = "/api/order/getOrder", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Set<Order>> fetchItemsCount();

    @PostMapping(value = "/api/order", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> updateQty();
}