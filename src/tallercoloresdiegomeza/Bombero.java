package tallercoloresdiegomeza;

public class Bombero {

    private Hacha hacha;
    public int resistencia;
    private Uniforme uniforme;
    private TrajeTermico trajeTermico;
    private int fuerza;
    protected String mascaraDeRespirar;

    public Bombero(Hacha hacha, int resistencia, Uniforme uniforme, TrajeTermico trajeTermico, int fuerza, String mascaraDeRespirar) {
        this.hacha = hacha;
        this.resistencia = resistencia;
        this.uniforme = uniforme;
        this.trajeTermico = trajeTermico;
        this.fuerza = fuerza;
        this.mascaraDeRespirar = mascaraDeRespirar;
    }

    public Hacha getHacha() { return hacha; }
    public void setHacha(Hacha hacha) { this.hacha = hacha; }

    public int getResistencia() { return resistencia; }
    public void setResistencia(int resistencia) { this.resistencia = resistencia; }

    public Uniforme getUniforme() { return uniforme; }
    public void setUniforme(Uniforme uniforme) { this.uniforme = uniforme; }

    public TrajeTermico getTrajeTermico() { return trajeTermico; }
    public void setTrajeTermico(TrajeTermico trajeTermico) { this.trajeTermico = trajeTermico; }

    public int getFuerza() { return fuerza; }
    public void setFuerza(int fuerza) { this.fuerza = fuerza; }

    public String getMascaraDeRespirar() { return mascaraDeRespirar; }
    public void setMascaraDeRespirar(String mascaraDeRespirar) { this.mascaraDeRespirar = mascaraDeRespirar; }

    public void rociarAgua() { System.out.println("El bombero rocia agua"); }
    public void rescatarPersonas() { System.out.println("El bombero rescata personas"); }
    public void usarExtintor() { System.out.println("El bombero usa extintor"); }
    public void primerosAuxilios() { System.out.println("El bombero aplica primeros auxilios"); }
    public void derribarPuertas() { System.out.println("El bombero derriba una puerta"); }
    public void embestida() { System.out.println("El bombero realiza una embestida"); }

    public static void main(String[] args) {
        Hacha h = new Hacha("Acero", "Madera", "Negra", 5, 3);
        Uniforme u = new Uniforme("Kevlar", "Rojo", "XL", "Casco", 4);
        TrajeTermico t = new TrajeTermico("Fibra", "Antillamas", "L", 120, true);
        Bombero b = new Bombero(h, 15, u, t, 20, "MSA G1");

        System.out.println("Resistencia del bombero: " + b.getResistencia());
        System.out.println("Material del hacha: " + h.getMaterialCabeza());
        System.out.println("Color del uniforme: " + u.getColor());
        System.out.println("Tipo de traje: " + t.getTipo());
    }
}

class Hacha {
    private String materialCabeza;
    private String materialMango;
    private String color;
    private int filo;
    private int peso;

    public Hacha(String materialCabeza, String materialMango, String color, int filo, int peso) {
        this.materialCabeza = materialCabeza;
        this.materialMango = materialMango;
        this.color = color;
        this.filo = filo;
        this.peso = peso;
    }

    public String getMaterialCabeza() { return materialCabeza; }
    public void setMaterialCabeza(String materialCabeza) { this.materialCabeza = materialCabeza; }

    public String getMaterialMango() { return materialMango; }
    public void setMaterialMango(String materialMango) { this.materialMango = materialMango; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getFilo() { return filo; }
    public void setFilo(int filo) { this.filo = filo; }

    public int getPeso() { return peso; }
    public void setPeso(int peso) { this.peso = peso; }

    public void afilar() { System.out.println("El hacha se afila"); }
    public void cortar() { System.out.println("El hacha corta"); }
    public void golpear() { System.out.println("El hacha golpea"); }
    public void lanzar() { System.out.println("El hacha se lanza"); }
    public void reparar() { System.out.println("El hacha se repara"); }
}

class Uniforme {
    private String tela;
    private String color;
    private String talla;
    private String casco;
    private int proteccion;

    public Uniforme(String tela, String color, String talla, String casco, int proteccion) {
        this.tela = tela;
        this.color = color;
        this.talla = talla;
        this.casco = casco;
        this.proteccion = proteccion;
    }

    public String getTela() { return tela; }
    public void setTela(String tela) { this.tela = tela; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getTalla() { return talla; }
    public void setTalla(String talla) { this.talla = talla; }

    public String getCasco() { return casco; }
    public void setCasco(String casco) { this.casco = casco; }

    public int getProteccion() { return proteccion; }
    public void setProteccion(int proteccion) { this.proteccion = proteccion; }

    public void limpiar() { System.out.println("El uniforme se limpia"); }
    public void proteger() { System.out.println("El uniforme protege"); }
    public void reparar() { System.out.println("El uniforme se repara"); }
    public void cambiarCasco(String nuevo) { this.casco = nuevo; }
    public void mejorarProteccion() { proteccion++; }
}

class TrajeTermico {
    private String material;
    private String tipo;
    private String talla;
    private int resistenciaCalor;
    private boolean antillamas;

    public TrajeTermico(String material, String tipo, String talla, int resistenciaCalor, boolean antillamas) {
        this.material = material;
        this.tipo = tipo;
        this.talla = talla;
        this.resistenciaCalor = resistenciaCalor;
        this.antillamas = antillamas;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getTalla() { return talla; }
    public void setTalla(String talla) { this.talla = talla; }

    public int getResistenciaCalor() { return resistenciaCalor; }
    public void setResistenciaCalor(int resistenciaCalor) { this.resistenciaCalor = resistenciaCalor; }

    public boolean isAntillamas() { return antillamas; }
    public void setAntillamas(boolean antillamas) { this.antillamas = antillamas; }

    public void resistirCalor() { System.out.println("El traje resiste calor"); }
    public void proteger() { System.out.println("El traje protege"); }
    public void enfriar() { System.out.println("El traje se enfria"); }
    public void reparar() { System.out.println("El traje se repara"); }
    public void ajustar() { System.out.println("El traje se ajusta"); }
}