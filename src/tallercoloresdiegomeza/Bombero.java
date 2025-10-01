package tallercoloresdiegomeza;

public class Bombero {

    private Hacha hacha;
    public int resistencia;
    private Uniforme uniforme;
    private TrajeTermico trajeTermico;
    private int fuerza;
    protected String mascaraRespirar;

    public Bombero(Hacha hacha, Uniforme uniforme, TrajeTermico trajeTermico, String mascaraRespirar) {
        this.hacha = hacha;
        this.uniforme = uniforme;
        this.trajeTermico = trajeTermico;
        this.mascaraRespirar = mascaraRespirar;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getFuerza() {
        return fuerza;
    }

    @Override
    public String toString() {
        return "Bombero{"
                + "hacha=" + hacha.getDescripcion()
                + ", resistencia=" + resistencia
                + ", uniforme=" + uniforme.getDescripcionUniforme()
                + ", trajeTermico=" + trajeTermico.getDescripcionTrajeTermico()
                + ", fuerza=" + fuerza
                + ", mascaraRespirar=" + mascaraRespirar
                + '}';
    }

    public static void main(String[] args) {
        Hacha h = new Hacha("Acero", "Abedul", "Cuero");
        Uniforme u = new Uniforme("Kevlar", "XL", "Rojo");
        TrajeTermico t = new TrajeTermico("FibraTérmica", "XL", "Antillamas");
        Bombero b = new Bombero(h, u, t, "MSA G1");
        b.setFuerza(20);
        b.setResistencia(15);

        System.out.println(b);
        System.out.println("Resistencia: " + b.getResistencia());
        System.out.println("Fuerza: " + b.getFuerza());
    }
}

class Hacha {

    private String materialCabeza;
    private String materialMango;
    private String empuñadura;

    public Hacha(String materialCabeza, String materialMango, String empuñadura) {
        this.materialCabeza = materialCabeza;
        this.materialMango = materialMango;
        this.empuñadura = empuñadura;
    }

    public String getDescripcion() {
        return materialMango + ", " + materialCabeza + ", " + empuñadura;
    }
}

class Uniforme {

    private String tela;
    private String talla;
    private String diseño;

    public Uniforme(String tela, String talla, String diseño) {
        this.diseño = diseño;
        this.talla = talla;
        this.tela = tela;
    }

    public String getDescripcionUniforme() {
        return diseño + ", " + talla + ", " + tela;
    }
}

class TrajeTermico {

    private String telaTermica;
    private String talla2;
    private String diseñoTraje;

    public TrajeTermico(String telaTermica, String talla2, String diseñoTraje) {
        this.diseñoTraje = diseñoTraje;
        this.talla2 = talla2;
        this.telaTermica = telaTermica;
    }

    public String getDescripcionTrajeTermico() {
        return diseñoTraje + ", " + talla2 + ", " + telaTermica;
    }
}
