import java.util.ArrayList;
import java.util.List;

class SistemaEspecialistaPerfumes {
    private List<Perfume> perfumes;

    public SistemaEspecialistaPerfumes() {
        this.perfumes = new ArrayList<>();
        // Adicionar perfumes à lista de perfumes
        adicionarPerfumes();
    }

    private void adicionarPerfumes() {
        perfumes.add(new Perfume("Natura Humor 1", "feminino", "frio", "floral", "longa", "moderada", "formal", 50.0));
perfumes.add(new Perfume("Avon Pur Blanca", "feminino", "frio", "floral", "longa", "moderada", "formal", 45.0));
perfumes.add(new Perfume("O Boticário Lily", "feminino", "frio", "floral", "longa", "moderada", "formal", 70.0));
perfumes.add(new Perfume("Chanel Coco Mademoiselle", "feminino", "frio", "floral", "longa", "moderada", "formal", 150.0));
perfumes.add(new Perfume("Dior J'adore", "feminino", "frio", "floral", "longa", "moderada", "formal", 180.0));
perfumes.add(new Perfume("Gucci Bloom", "feminino", "frio", "floral", "longa", "moderada", "formal", 90.0));
perfumes.add(new Perfume("Marc Jacobs Daisy", "feminino", "frio", "floral", "longa", "moderada", "formal", 80.0));
perfumes.add(new Perfume("Yves Saint Laurent Black Opium", "feminino", "frio", "floral", "longa", "moderada", "formal", 100.0));
perfumes.add(new Perfume("Calvin Klein Euphoria", "feminino", "frio", "floral", "longa", "moderada", "formal", 120.0));
perfumes.add(new Perfume("Hugo Boss Boss Femme", "feminino", "frio", "floral", "longa", "moderada", "formal", 70.0));

// Perfumes masculinos
perfumes.add(new Perfume("Calvin Klein Eternity for Men", "masculino", "frio", "amadeirado", "longa", "moderada", "formal", 80.0));
perfumes.add(new Perfume("Paco Rabanne 1 Million", "masculino", "frio", "amadeirado", "longa", "moderada", "formal", 90.0));
perfumes.add(new Perfume("Dior Sauvage", "masculino", "frio", "amadeirado", "longa", "forte", "formal", 120.0));
perfumes.add(new Perfume("Chanel Bleu de Chanel", "masculino", "frio", "amadeirado", "longa", "moderada", "formal", 150.0));
perfumes.add(new Perfume("Giorgio Armani Acqua Di Gio", "masculino", "frio", "amadeirado", "longa", "moderada", "formal", 100.0));
perfumes.add(new Perfume("Dolce & Gabbana Light Blue", "masculino", "frio", "cítrico", "longa", "moderada", "casual", 70.0));
perfumes.add(new Perfume("Versace Eros", "masculino", "frio", "cítrico", "longa", "forte", "casual", 80.0));
perfumes.add(new Perfume("Bvlgari Man in Black", "masculino", "frio", "amadeirado", "longa", "moderada", "formal", 110.0));
perfumes.add(new Perfume("Gucci Guilty", "masculino", "frio", "amadeirado", "média", "forte", "casual", 90.0));
perfumes.add(new Perfume("Tom Ford Tobacco Vanille", "masculino", "frio", "amadeirado", "longa", "forte", "formal", 250.0));

// Perfumes femininos adicionais
perfumes.add(new Perfume("Lancôme La Vie Est Belle", "feminino", "frio", "floral", "longa", "moderada", "formal", 200.0));
perfumes.add(new Perfume("Prada Candy", "feminino", "frio", "doce", "longa", "moderada", "casual", 110.0));
perfumes.add(new Perfume("Yves Saint Laurent Mon Paris", "feminino", "frio", "floral", "longa", "moderada", "formal", 170.0));
perfumes.add(new Perfume("Marc Jacobs Decadence", "feminino", "frio", "doce", "longa", "forte", "casual", 120.0));
perfumes.add(new Perfume("Carolina Herrera Good Girl", "feminino", "frio", "doce", "longa", "forte", "formal", 180.0));
perfumes.add(new Perfume("Dolce & Gabbana The One", "feminino", "frio", "oriental", "longa", "moderada", "formal", 150.0));
perfumes.add(new Perfume("Emporio Armani In Love With You", "feminino", "frio", "frutado", "longa", "moderada", "casual", 100.0));
perfumes.add(new Perfume("Givenchy Dahlia Divin", "feminino", "frio", "floral", "longa", "moderada", "formal", 160.0));
perfumes.add(new Perfume("Bvlgari Omnia Crystalline", "feminino", "frio", "floral", "longa", "moderada", "formal", 90.0));
perfumes.add(new Perfume("Valentino Donna", "feminino", "frio", "floral", "longa", "moderada", "formal", 140.0));

// Perfumes femininos adicionais para ocasião casual
perfumes.add(new Perfume("Burberry Brit Sheer", "feminino", "frio", "floral", "longa", "moderada", "casual", 95.0));
perfumes.add(new Perfume("Issey Miyake L'Eau d'Issey Florale", "feminino", "frio", "floral", "longa", "moderada", "casual", 120.0));
perfumes.add(new Perfume("Tommy Hilfiger Tommy Girl", "feminino", "frio", "cítrico", "média", "moderada", "casual", 80.0));
perfumes.add(new Perfume("Gucci Bloom", "feminino", "frio", "floral", "longa", "moderada", "casual", 160.0));
perfumes.add(new Perfume("Chanel Chance Eau Tendre", "feminino", "frio", "floral", "longa", "moderada", "casual", 130.0));
perfumes.add(new Perfume("Calvin Klein Eternity Moment", "feminino", "frio", "floral", "longa", "moderada", "casual", 110.0));
perfumes.add(new Perfume("Ralph Lauren Ralph", "feminino", "frio", "floral", "média", "moderada", "casual", 70.0));
perfumes.add(new Perfume("Dior Addict", "feminino", "frio", "oriental", "longa", "moderada", "casual", 150.0));
perfumes.add(new Perfume("Yves Saint Laurent Black Opium Floral Shock", "feminino", "frio", "floral", "longa", "forte", "casual", 140.0));
perfumes.add(new Perfume("Versace Bright Crystal Absolu", "feminino", "frio", "floral", "longa", "moderada", "casual", 100.0));

// Perfumes femininos adicionais para ocasião formal, intenso e valor acima de R$150
perfumes.add(new Perfume("Chanel Coco Noir", "feminino", "frio", "oriental", "longa", "forte", "formal", 200.0));
perfumes.add(new Perfume("Tom Ford Black Orchid", "feminino", "frio", "oriental", "longa", "forte", "formal", 250.0));

// Perfumes masculinos adicionais para ocasião formal, intenso e valor acima de R$150
perfumes.add(new Perfume("Creed Aventus", "masculino", "frio", "amadeirado", "longa", "forte", "formal", 400.0));
perfumes.add(new Perfume("Yves Saint Laurent La Nuit de l'Homme", "masculino", "frio", "amadeirado", "longa", "forte", "formal", 180.0));

// Perfumes femininos adicionais amadeirado (frio)
perfumes.add(new Perfume("Chanel No. 5 L'Eau", "feminino", "frio", "amadeirado", "longa", "moderada", "formal", 180.0));

// Perfumes femininos adicionais doce (frio)
perfumes.add(new Perfume("Viktor & Rolf Flowerbomb", "feminino", "frio", "doce", "longa", "forte", "formal", 200.0));

// Perfumes femininos adicionais floral (frio, formal, longa duração, intensidade forte, acima de R$150)
perfumes.add(new Perfume("Guerlain Mon Guerlain", "feminino", "frio", "floral", "longa", "forte", "formal", 180.0));
perfumes.add(new Perfume("Jo Malone London Peony & Blush Suede", "feminino", "frio", "floral", "longa", "forte", "formal", 190.0));

// Perfumes masculinos adicionais amadeirado (frio, formal, longa duração, intensidade forte, acima de R$150)
perfumes.add(new Perfume("Armani Code Profumo", "masculino", "frio", "amadeirado", "longa", "forte", "formal", 180.0));
perfumes.add(new Perfume("Bleu de Chanel Parfum", "masculino", "frio", "amadeirado", "longa", "forte", "formal", 200.0));

// Perfumes masculinos adicionais doce (frio)
perfumes.add(new Perfume("Thierry Mugler A*Men Pure Havane", "masculino", "frio", "doce", "longa", "moderada", "casual", 160.0));

// Perfumes masculinos adicionais floral (frio, formal, longa duração, intensidade moderada, acima de R$150)
perfumes.add(new Perfume("Dior Homme Intense", "masculino", "frio", "floral", "longa", "moderada", "formal", 170.0));
perfumes.add(new Perfume("Tom Ford Oud Wood", "masculino", "frio", "floral", "longa", "moderada", "formal", 190.0));


}
        
        
    

    public List<Perfume> recomendarPerfumes(String genero, String clima, String tipo, String duracao, String intensidade, String ocasiao, double valor) {
        List<Perfume> recomendacoes = new ArrayList<>();
        for (Perfume perfume : perfumes) {
            if (perfume.getGenero().equalsIgnoreCase(genero) && perfume.getClima().equalsIgnoreCase(clima) && perfume.getTipo().equalsIgnoreCase(tipo)
                && perfume.getDuracao().equalsIgnoreCase(duracao) && perfume.getIntensidade().equalsIgnoreCase(intensidade)
                && perfume.getOcasiao().equalsIgnoreCase(ocasiao) && perfume.getValor() <= valor) {
                recomendacoes.add(perfume);
            }
        }
        return recomendacoes;
    }
}
