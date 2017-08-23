import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped; 
import java.util.Random;
/**
 *
 * @author eduardo
 */
@ManagedBean
@ViewScoped
public class adivinharNumeroMB {

    private Integer numeroSecreto;
    private Integer numeroPalpite = 0;
    private Integer rodadas = 10;
    private String numeroSecretoExibir = "xxxxxxx";
    private String mensagem = "Sem nenhuma dica por enquanto";
    
    public void mostrarNumeroSecreto(){
        numeroSecretoExibir = numeroSecreto.toString();
    }
    
    public void gerarNumeroSecreto(){
        numeroSecreto = new Random().nextInt(100);
    }
    
    public void reiniciarJogo(){
        rodadas = 10;
        mensagem = "Sem nenhuma dica por enquanto";
        numeroSecretoExibir = "xxxxxxx";
        numeroPalpite = 0;
        gerarNumeroSecreto();
    }
    
    public void gerarMensagem(){
        
        if(numeroPalpite > numeroSecreto){
            mensagem = "O número digitado é maior que o número oculto.";
        }
        else if(numeroPalpite < numeroSecreto){
            mensagem = "O número digitado é menor que o número oculto.";
        }
        else if(numeroPalpite == numeroSecreto){
            mensagem = "Parabéns você acertou!!";
        }
        
    }
    
    public void verificaPalpite(){
        if(rodadas > 0 && numeroPalpite == numeroSecreto){
             /*mostrar numero*/
             gerarMensagem();
             mostrarNumeroSecreto();
        }
        else if(rodadas > 0 && numeroPalpite != numeroSecreto){
            rodadas --;
            /*gerar mensagem de dica*/
            gerarMensagem();
        }
        else{
            mensagem = "Você perdeu suas chances acabaram!";
            mostrarNumeroSecreto();
        }
    }
    
    public Integer getNumeroSecreto() {
        return numeroSecreto;
    }

    public void setNumeroSecreto(Integer numeroSecreto) {
        this.numeroSecreto = numeroSecreto;
    }

    public Integer getNumeroPalpite() {
        return numeroPalpite;
    }

    public void setNumeroPalpite(Integer numeroPalpite) {
        this.numeroPalpite = numeroPalpite;
    }

    public Integer getRodadas() {
        return rodadas;
    }

    public void setRodadas(Integer rodadas) {
        this.rodadas = rodadas;
    }
    
    public adivinharNumeroMB() {
        //Chamar funcao para gerar numero secreto
        gerarNumeroSecreto();
    }

    public String getNumeroSecretoExibir() {
        return numeroSecretoExibir;
    }

    public void setNumeroSecretoExibir(String numeroSecretoExibir) {
        this.numeroSecretoExibir = numeroSecretoExibir;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
}
