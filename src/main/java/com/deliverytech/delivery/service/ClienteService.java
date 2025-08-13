package com.deliverytech.delivery.service;

import java.util.List;
import java.util.Optional;

import com.deliverytech.delivery.model.Cliente;

public interface ClienteService {
    Cliente cadastrar(Cliente cliente);
    Cliente atualizar(Long id, Cliente clienteAtualizado);
    void ativarDesativar(Long id);
    List<Cliente> listarAtivos();
    Optional<Cliente> buscarPorId(Long id);
}
