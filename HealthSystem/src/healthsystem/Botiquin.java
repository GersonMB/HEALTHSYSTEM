package healthsystem;
class Botiquin{ 
//atributos
private int montoPuntosDeVida;
private boolean estaUsado;

//metodos
  public Botiquin(int botVida, boolean botUsado){
    this.montoPuntosDeVida = botVida;
    this.estaUsado = botUsado;
  }

  public boolean getEstaUsado(){return(this.estaUsado);}

  public int curarVida(){
    return(montoPuntosDeVida);
  }
}