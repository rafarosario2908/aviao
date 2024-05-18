public class AssentoPrimeiraClasse implements Assento{


    private boolean reservado = false;
    @Override
    public boolean reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println("Assento primeira classe reservado! 3" );
            return true;
        } else {
            System.out.println("Assentoprimeira classe  já está ocupado. 4");
            return false;
        }
    }

  

  

    
}