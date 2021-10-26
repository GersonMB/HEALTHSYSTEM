package healthsystem;
class Jugador {
  //atributos
  private String nombre;
  private int vida = 100;
  private int danioGolpe;

  //metodos
  public Jugador(String nombre, int daGolpe){
    this.nombre = nombre;
    this.danioGolpe = daGolpe;
  }
  public int ataque(){
    return(this.danioGolpe);
  }
  public void recibirDanio(int danio){
    this.vida=0;
    if(danio > vida){
      System.out.println("La vida del jugador a llegado a 0, GAME OVER");
    }else{
    vida = vida - danio;
    }
  }
  public void recibirVida(int vidaExtra){
    vida = vida + vidaExtra;
  }
  public int getVida(){
  return (vida);
  }
  public String getNombre(){
    return (nombre);
  }
  public void setVida(int vida){
    this.vida = vida;
  }
}