package torpedojatek;
public class TorpedoJatek {

    public static void main(String[] args) {
        tesztLoves();
    }
    
    public String tesztLoves(int poz){
        Hajo hajo = new Hajo();
        String t = hajo.talalat(4);
        assert t.equals("Talált"):"Nem jó a találat ellenőrzés";
        return null;
        
    
    }
    
}
