import java.util.Scanner;
public class estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;

    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getCurso() {
        return curso;
    }
    public void nombre(String nombre) throws NombreInvalido {
        if(nombre==null || nombre.isEmpty()){
           throw new NombreInvalido("El nombre no puede estar vacío");
        }
        else if(nombre.length() < 3 || nombre.length() > 20){
            throw new NombreInvalido("El nombre debe tener entre 3 y 20 caracteres");
        }
        else if(!nombre.matches("[a-zA-Z]+")){
            throw new NombreInvalido("El nombre solo puede contener letras");
        }
        else{
            this.nombre = nombre;
        }

    }
    public void edad(int edad)throws EdadInvalida{
        if(edad<18 || edad>63){
            throw new EdadInvalida("La edad no puede ser menor a 0 o mayor a 100");
        }
        else{
            this.edad = edad;
        }
    }
    public void curso(String curso)throws CursoInvalido{
        if(curso==null || curso.isEmpty()){
            throw new CursoInvalido("El curso no puede estar vacío");
        }
        else if(curso.length() < 3 || curso.length() > 20){
            throw new CursoInvalido("El curso debe tener entre 3 y 20 caracteres");
        }
        else if(!curso.matches("[a-zA-Z]+")){
            throw new CursoInvalido("El curso solo puede contener letras");
        }
        else if(curso!="Java"||curso!="Phyton"||curso!="Base de datos"){
            throw new CursoInvalido("El curso no es válido");
        }
        else{
            this.curso = curso;
        }
    }

}
