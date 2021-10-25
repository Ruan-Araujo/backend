package ProxyPattern.ProxyFilmes;

public class GradeFilmesProxy implements IGradeFilmes{

    private GradeFIlmes grade;
    private IP ip;

    public IP getIp() {
        return ip;
    }

    public void setIp(IP ip) {
        this.ip = ip;
    }

    public GradeFilmesProxy(GradeFIlmes grade) {
        this.setGrade(grade);

    }

    public void setGrade(GradeFIlmes grade) {
        this.grade = grade;
    }

    @Override
    public Filme getFilme(String nomeFilme) throws FilmeNaoHabilitadoException {
        Filme filme = grade.getFilme(nomeFilme);

        if (!(getIp().getPais().equalsIgnoreCase(filme.getPais()))) {
            throw new FilmeNaoHabilitadoException(nomeFilme + " não está disponível em " + ip.getPais());
        }
        return filme;
    }
}
