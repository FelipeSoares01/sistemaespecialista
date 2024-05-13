class Perfume {
    private String nome;
    private String genero;
    private String clima;
    private String tipo;
    private String duracao;
    private String intensidade;
    private String ocasiao;
    private double valor;

    public Perfume(String nome, String genero, String clima, String tipo, String duracao, String intensidade, String ocasiao, double valor) {
        this.nome = nome;
        this.genero = genero;
        this.clima = clima;
        this.tipo = tipo;
        this.duracao = duracao;
        this.intensidade = intensidade;
        this.ocasiao = ocasiao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getClima() {
        return clima;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getIntensidade() {
        return intensidade;
    }

    public String getOcasiao() {
        return ocasiao;
    }
    
    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return nome + " - " + genero + " - " + clima + " - " + tipo + "\nDuração: " + duracao + "\nIntensidade: " + intensidade + "\nOcasião: " + ocasiao + "\nValor: R$" + valor;
    }
}

