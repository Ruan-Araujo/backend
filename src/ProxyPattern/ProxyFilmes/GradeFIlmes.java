package ProxyPattern.ProxyFilmes;

public class GradeFIlmes implements IGradeFilmes{

    @Override
    public Filme getFilme(String nomeFilme) throws FilmeNaoHabilitadoException {
        Filme filme = null;
        switch (nomeFilme) {
            case "Homem Aranha":
                filme = new Filme("Homem Aranha", "Brasíl", "www.homearanha.com.br");
                break;
            case "Comlobiana: Em busca de vingança":
                filme = new Filme("Comlobiana: Em busca de vingança",
                        "Comlobia", "www.vingranca.com.co");
                break;
            case "De volta para o futuro":
                filme = new Filme("De volta para o futuro", "Argentina", "www.devolta.com.ar");
                break;
            case "Matrix":
                filme = new Filme("Matrix", "Brasíl", "www.matrix.com.br");
                break;
            case "Chuck":
                filme = new Filme("Chuck", "Colombia", "www.chuck.com.co");
                break;
        }
        return filme;
    }
}
