package com.example.jdbcclient.demo.entity;

public record Client(Long id, String name, String address, Long phoneNumber) {

    public Client withNewAddress(String newAddress) {
        return new Client(id, name, newAddress, phoneNumber);
    }
}