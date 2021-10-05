package healthsystem;

class Jugador{
  
private String nombre;
private int vida 100;
private int danioogolpe;



public Jugador(String nombre,int danioogolpe){
  this.nombre=nombre;
  this.danioogolpe=danioogolpe;
}
 public int ataque(){
  return(danioogolpe);
 }
 public void recibirDanio(int danio){
   this.vida=this.vida-danio;
 }
 public void recibirVida(int vida){
   this.vida=this.vida+vida;
 }

}