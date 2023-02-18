package com.lopes.api.endereco;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Endereco {
    @NotBlank
    private  String logradouro;
    @NotBlank
    private  String bairro;
    @NotBlank
    @Pattern(regexp = "\\d{8}")
    private  String cep;
    @NotBlank
    private  String cidade;
    @NotBlank
    private  String uf;
    private String complemento;
    private String numero;

    public Endereco(DadosEndereco enderecoVO) {
        this.logradouro = enderecoVO.logradouro();
        this.bairro = enderecoVO.bairro();
        this.cidade = enderecoVO.cidade();
        this.cep = enderecoVO.cidade();
        this.complemento = enderecoVO.complemento();
        this.uf = enderecoVO.uf();
        this.numero = enderecoVO.numero();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if (dados.logradouro() != null) {
            this.logradouro = dados.logradouro();
        }
        if (dados.bairro() != null) {
            this.bairro = dados.bairro();
        }
        if (dados.cep() != null) {
            this.cep = dados.cep();
        }
        if (dados.uf() != null) {
            this.uf = dados.uf();
        }
        if (dados.cidade() != null) {
            this.cidade = dados.cidade();
        }
        if (dados.numero() != null) {
            this.numero = dados.numero();
        }
        if (dados.complemento() != null) {
            this.complemento = dados.complemento();
        }
    }
}
