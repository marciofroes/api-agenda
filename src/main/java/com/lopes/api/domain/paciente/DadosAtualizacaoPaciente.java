package com.lopes.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import com.lopes.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
