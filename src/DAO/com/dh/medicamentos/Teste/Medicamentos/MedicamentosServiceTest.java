package DAO.com.dh.medicamentos.Teste.Medicamentos;

import DAO.com.dh.medicamentos.dao.ConfiguracaoJDBC;
import DAO.com.dh.medicamentos.dao.impl.MedicamentoDaoH2;
import DAO.com.dh.medicamentos.model.Medicamento;
import DAO.com.dh.medicamentos.service.MedicamentoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedicamentosServiceTest {

    private MedicamentoService medicamentoService =
            new MedicamentoService(
                    new MedicamentoDaoH2(
                            new ConfiguracaoJDBC()
                    )
            );

    @Test
    public void guardarMedicamento() {
        Medicamento medicamento = new Medicamento(
                "Ibuprofeno",
                "lab123",
                1000,
                200.00
        );

        medicamentoService.salvar(medicamento);
        Assertions.assertTrue(medicamento.getId() != null);
    }

}
