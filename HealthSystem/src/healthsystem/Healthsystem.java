package healthsystem;

class Healthsystem {
  public static void main(String[] args){
  Jugador J1 = new Jugador("pipa",15,100);
  Botiquin B1 = new Botiquin(900,false);
  zombie Z1 = new zombie("messi",40,500);

  System.out.println("Sistema de Salud (Healthsystem)/n");

  System.out.println("Jugador "+J1.getnom()+" tiene "+J1.getvida()+" de vida total");

  J1.recibirDanio(Z1.ataque());
  System.out.println("Zombie le pega un wate al Jugador (Jugador resulta con "+J1.getvida()+" de vida)");

  Z1.recibirdanio(J1.ataque());
  System.out.println("Jugador le pega un 200 al Zombie (Zombie resulta con "+Z1.getvida()+" de vida)");

  J1.recibirDanio(Z1.ataque()+10);
  System.out.println("Zombie ataca a jugador realizando un golpe crítica (jugador resulta con "+J1.getvida()+" de vida)");

  Z1.recibirdanio(J1.ataque());
  System.out.println("Jugador ataca Zombie (Zombie resulta con "+Z1.getvida()+" de vida)");

  J1.recibirVida(B1.curarVida());
  System.out.println("Jugador saca un botiquín de su backpack y lo utiliza (resulta con "+J1.getvida()+" de vida)");
  }
}