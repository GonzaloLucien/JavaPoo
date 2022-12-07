
package entidades;


public class Mascota {
    
    private String nombre;
    private int edad;
    private String color;
    private boolean sexo;
    private int vitalidad = 100;

    public Mascota() {
        vitalidad = 100;
    }
    
    public Mascota(String nombre, int edad, boolean sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Mascota(String nombre, int edad, String color, boolean sexo, int vitalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.sexo = sexo;
        this.vitalidad = vitalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getColor() {
        return color;
    }

    public boolean isSexo() {
        return sexo;
    }
    
    public int vivir (int edad){
        for (int i = 0; i < edad; i++) {
            vitalidad-=10;
        }
        System.out.println("Le vitalidad de tu perro es: ");
        return vitalidad;
    } 
    
    
}
