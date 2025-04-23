import java.io.*;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.List;
import java.util.Random;

public class Registrar_estudiante {
    private List<estudiante> estudiantes;
    public Registrar_estudiante() {
    estudiantes=new ArrayList<>();

    }
    public void agregarEstudiantes(estudiante es){
        estudiantes.add(es);
    }
    public void CargarArchivos(String nombreArchivo)throws IOException {
        try(BufferedReader bf=new BufferedReader(new FileReader(nombreArchivo))){
            String Linea;
            while((Linea=bf.readLine())!=null){
                String[]datos=Linea.split(",");
                String nombre=datos[0];
                int edad=Integer.parseInt(datos[1]);
                String curso=datos[2];
                estudiante es=new estudiante(nombre,edad,curso);
            }
        }catch (IOException e){
            System.out.println("Error al cargar el archivo: "+e.getMessage());
    }


    }
    public void GuardarArchvios(String nombreArchivo)throws IOException{
      try(BufferedWriter bw=new BufferedWriter(new FileWriter(nombreArchivo))){
        for(estudiante es:estudiantes){
            String linea=es.getNombre()+","+es.getEdad()+","+es.getCurso();
            bw.write(linea);
            bw.newLine();
        }


      }catch (IOException e){
        System.out.println("Error al guardar el archivo: "+e.getMessage());
      }
    }
    }
