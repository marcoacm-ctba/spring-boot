package med.voll.api.domain.consulta;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(
        Long idConsulta,
        Long idMedico,
        Long idPaciente,
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
        LocalDateTime data) {

        public DadosDetalhamentoConsulta(Consulta consulta) {
                this(consulta.getId(), consulta.getMedico().getId(), consulta.getPaciente().getId(), consulta.getData());
        }
}