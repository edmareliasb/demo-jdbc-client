package com.example.jdbcclient.demo.repository;

import com.example.jdbcclient.demo.entity.Client;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientRepository {

    private final JdbcClient jdbcClient;

    public ClientRepository(final JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public void save(Client client) {
        jdbcClient.sql("""
                    INSERT INTO CLIENT (NAME, ADDRESS, PHONE_NUMBER)
                    VALUES (:name, :address, :phoneNumber)
                """)
                .param("name", client.name())
                .param("address", client.address())
                .param("phoneNumber", client.phoneNumber())
                .update();
    }

    public void update(Client client) {
        jdbcClient.sql("""
                    UPDATE CLIENT SET NAME = :name, ADDRESS = :address, PHONE_NUMBER = :phoneNumber
                    WHERE ID = :id
                """)
                .param("id", client.id())
                .param("name", client.name())
                .param("address", client.address())
                .param("phoneNumber", client.phoneNumber())
                .update();
    }

    public void deleteById(Long id) {
        jdbcClient.sql("""
                    DELETE FROM CLIENT WHERE ID = :id
                """)
                .param("id", id)
                .update();
    }

    public Client findById(Long id) {
        return jdbcClient.sql("""
                    SELECT * FROM CLIENT WHERE ID = :id
                """)
                .param("id", id)
                .query(Client.class)
                .single();
    }

    public List<Client> findAll() {
        return jdbcClient.sql("""
                    SELECT * FROM CLIENT
                """)
                .query(Client.class)
                .list();
    }

}
