package br.com.gerenciadorclientesjava.apis.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContaAPI{

    private Long numeroConta;
    private String tipoConta;
    private ClienteAPI clienteAPI;
    private String erro;
}