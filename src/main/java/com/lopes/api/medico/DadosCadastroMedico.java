package com.lopes.api.medico;

import com.lopes.api.endereco.Endereco;

public record DadosCadastroMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        Endereco endereco) {
}
