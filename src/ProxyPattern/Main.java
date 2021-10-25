package ProxyPattern;
import java.util.Date;
import java.util.Calendar;
public class Main {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 7, 21);
        Date date = calendar.getTime();


        Pessoa pessoa = new Pessoa("Ruan", "Araújo", "345679", "Pfizer", date);
        IRegisto registo = new RegistroVacinaProxy();
        registo.registrar(pessoa.dados());

    }
}
