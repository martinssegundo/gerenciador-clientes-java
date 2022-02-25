package br.com.gerenciadorclientesjava.apis.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteAPI {


    private Long idCliente;
    private Integer tipoCliente;
    private String cliente;
    private String documento;
    private String rg;
    private Integer serasa;
    private String nomeDoPai;
    private String nomeDaMae;
    private LoginAPI login;
    private String data;



}
