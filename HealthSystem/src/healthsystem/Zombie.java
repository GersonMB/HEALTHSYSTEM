package healthsystem;
class zombie {
  //atributos
  private String nombre;
  private int vida;
  private int danioRasgunio;
  //private int recibirdanio = 20;

  public zombie(String nom, int vidaZ, int danioZ){
    this.nombre = nom;
    this.vida = vidaZ;
    this.danioRasgunio = danioZ;
  }

  public void recibirdanio(int danio){
    if(danio > vida){
      this.vida = 0;
      System.out.println("La vida de zombie llego hasta 0, Game Over");
    }else{
      this.vida = this.vida - danio;
    }
  }

  public int ataque(){
    return(danioRasgunio);
  }

  public int getvida(){return(this.vida);}
}
  