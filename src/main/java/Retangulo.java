public class Retangulo{

    private float comprimento = 1.0f;
    private float largura = 1.0f;

    //Construtor
    public Retangulo(float comprimento,float largura) {

        this.comprimento = comprimento;
        this.largura = largura;
    }


    //Métodos

    public String toString() {
        return "Retangulo[comprimento= "+ comprimento + " largura="+largura+ " Perimetro= "+getPerimetro()+"]";
    }

    public float getComprimento() {
        return comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getPerimetro(){
        float perimetro;
        perimetro = comprimento * largura;
        return perimetro;
    }
}
