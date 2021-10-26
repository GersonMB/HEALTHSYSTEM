package healthsystem;

class Zombie {
  //atributos
  private String nombre;
  private int vida = 50;
  private int danioRasgunio;

  //bob Constructor
  public Zombie(String nom, int Lavidapa, int danioRasgunio){
    this.nombre = nombre;
    this.vida = Lavidapa;
    this.danioRasgunio = danioRasgunio;
  }

  //Metodos
  public int ataque(){
    return(this.danioRasgunio);
  }
  public void recibirDanio(int danio){
    this.vida=0;
    if(danio > vida){
      System.out.println("La vida del zombie a llegado a 0");  
    }else{
      vida = vida - danio;
    }
  }
  public int getVida(){
    return vida;
  }
  public void setVida(int vida){
    this.vida = vida;
  }
}
  