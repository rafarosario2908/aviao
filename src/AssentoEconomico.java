public class AssentoEconomico implements Assento{


    private boolean reservado = false;
    @Override
    public boolean reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println("Assento econômico reservado! 1 " );
            return true;
        } else {
            System.out.println("Assento econômico já está ocupado. 2");
            return false;
        }
    }


    
}
