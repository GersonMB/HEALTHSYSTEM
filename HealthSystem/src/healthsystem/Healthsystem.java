package healthsystem;
class Healthsystem {
  public static void main(String[] args) { 
    Jugador Jprincipal = new Jugador("ElPEPE", 15);
    Zombie zombie = new Zombie("TILIN", 50, 20);
    Botiquin botiking = new Botiquin (15, false);

    System.out.println("Sistema de salud (Healthsystem)/n");

    Jprincipal.recibirDanio(zombie.ataque());

    System.out.println(">>  TILIN ataca a ElPEPE. ElPEPE tiene "+Jprincipal.getVida()+" de vida");
    
    zombie.recibirDanio(Jprincipal.ataque());

    Jprincipal.setVida(120);
    System.out.println("Vida es: "+ Jprincipal.getVida());

    System.out.println(">> TILIN es atacado por ElPEPE. TILIN tiene "+zombie.getVida()+" de vida");

  } 
}