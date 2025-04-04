package me.dio.project.domain.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "tb_process")
public class Process {
  @Id
  private String id;

  private String titulo;
  private String gerencia;
  private String status;
  private String prioridade;
  private LocalDateTime dataCriacao;
  private LocalDateTime dataVencimento;
  private String responsavel;

  @Column(length = 1000)
  private String descricao;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getGerencia() {
    return gerencia;
  }

  public void setGerencia(String gerencia) {
    this.gerencia = gerencia;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getPrioridade() {
    return prioridade;
  }

  public void setPrioridade(String prioridade) {
    this.prioridade = prioridade;
  }

  public LocalDateTime getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(LocalDateTime dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public LocalDateTime getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(LocalDateTime dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public String getResponsavel() {
    return responsavel;
  }

  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
