package ProxyPattern;

import java.util.Date;

public class RegistroVacinaProxy implements IRegisto{


    @Override
    public void registrar(Object[] dados) {
        if (verificarData((Date) (dados[1]))) {
            RegistraVacina registro = new RegistraVacina();
            registro.registrar(dados);
        } else {
            System.out.println("Não pode vacinar em data diferente da marcada ");
        }
    }

    public boolean verificarData(Date data) {
        return data.before(new Date());
    }
}
