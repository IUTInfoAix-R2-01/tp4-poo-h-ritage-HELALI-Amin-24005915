package exercie_2_9;

Voici les méthode ou il serait pertinent de mettre @Override :


Classe Velo:

@Override
public String toString() {
    return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]"; 
}

@Override
public double getPuissance(double FrequenceCoupsDePedale) {
    return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
}



Classe VeloElec :

@Override
public double getPuissance(double FrequenceCoupsDePedale) {
    return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
}
