package com.lopes.api.paciente;

import com.lopes.api.endereco.Endereco;

public record DadosCadastroPaciente(
        String nome,
        String email,
        String telefone,
        String cpf,
        Endereco endereco
) {
}
