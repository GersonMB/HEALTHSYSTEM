package healthsystem;

class Jugador {
  //atributos
  private String nombre;
  private int vida;
  private int danioGolpe;

  //metodos
  public Jugador(String nom, int daGolpe, int vidaJ){
    this.nombre = nom;
    this.danioGolpe = daGolpe;
    this.vida = vidaJ;
  }

  public int ataque(){
    return(danioGolpe);
  }

  public void recibirDanio(int danio){
    if(danio > vida){
      this.vida = 0;
      System.out.println("La vida del jugador llego hasta 0, Game Over");
    }else{
      this.vida = this.vida - danio;
    }
  }

  public void recibirVida(int vidaExtra){
    vida = vida + vidaExtra;
    int suma = this.vida + vidaExtra;
    if(suma <= 100){
      this.vida = suma;
    }else{
      this.vida = 100;
    }
  }

  public int getvida(){return(this.vida);}
  public String getnom(){return(this.nombre);}
  
  public void setVida(int vida){
    this.vida = vida;
  }
}