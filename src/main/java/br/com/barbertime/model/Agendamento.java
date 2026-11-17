package br.com.barbertime.model;

import java.time.LocalDateTime;

public class Agendamento {

    private Long id;
    private LocalDateTime dataHora;
    private StatusAgendamento status;

    private Cliente cliente;
    private Barbeiro barbeiro;
    private Servico servico;

    public Agendamento() {
    }

    public Agendamento(Long id, LocalDateTime dataHora,
                       StatusAgendamento status, Cliente cliente,
                       Barbeiro barbeiro, Servico servico) {
        this.id = id;
        this.dataHora = dataHora;
        this.status = status;
        this.cliente = cliente;
        this.barbeiro = barbeiro;
        this.servico = servico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public StatusAgendamento getStatus() {
        return status;
    }

    public void setStatus(StatusAgendamento status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Barbeiro getBarbeiro() {
        return barbeiro;
    }

    public void setBarbeiro(Barbeiro barbeiro) {
        this.barbeiro = barbeiro;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
}