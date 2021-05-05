public class Musica {

    /**
     * 
     */

    //DECLARAÇÃO DE ATRIBUTOS
    private String nomeMusica;
    private String nomeInterprete;
    private String  nomeCompositor;
    private String anoComposicaoMusica;

     
    public Musica(){
        // INICIANDO MÉTODO CONSTRUTOR
        nomeMusica = "";
        nomeInterprete = "";
        nomeCompositor = "";
        anoComposicaoMusica = "";
    }

    // MÉTODO CONSTRUTOR COM PARÂMETROS
    public Musica(String smusica, String sinterprete, String scompositor, String anocomposicao){
        nomeMusica = smusica;
        nomeInterprete = sinterprete;
        nomeCompositor = sinterprete;
        anoComposicaoMusica = anocomposicao;


    }

    // COMPORTAMENTOS/MÉTODOS

    public void setMusica(String snomemusica){
        nomeMusica = snomemusica;

    }

    public void setInterprete(String sninterprete){
        nomeInterprete = sninterprete;

    }

    public void setCompositor(String snomecompositor){
        nomeCompositor = snomecompositor;

    }

    public void setAnoComposicao(String anoComp){
        anoComposicaoMusica = anoComp;
    }

    public String getMusica(){
        return nomeMusica; 
    }

    public String getInterprete(){
        return nomeInterprete; 
    }



    public String getAnoComposicao(){
        return anoComposicaoMusica; 
    }
    
}
