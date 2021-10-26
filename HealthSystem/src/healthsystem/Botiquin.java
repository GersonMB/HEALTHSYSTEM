package healthsystem;
class Botiquin {
  private int montoPuntoDeVida;
  private boolean estaUsado;

  public Botiquin (int montoVida, boolean Usado){
    this.montoPuntoDeVida = montoVida;
    this.estaUsado = Usado;
  }

  public int curarVida(int montoVida){
    montoPuntoDeVida = montoVida;
    return (montoVida);
  }
  public boolean getEstaUsado(){
    return(this.estaUsado);
  }
}