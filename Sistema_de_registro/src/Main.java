import java.io.IOException;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static boolean salir=false;
    static Registrar_estudiante re=new Registrar_estudiante();
    static estudiante es;
    public static void main(String[]args) throws IOException {

        do{
            System.out.println("1.Registrar estudiante");
            System.out.println("2.Mostrar Lista de estudiantes");
            System.out.println("3.Guardar archivo");
            System.out.println("4.Cargar archivo");
            System.out.println("5.Salir");
            int opcion;
            opcion=sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Nombre:");
                    String nombre=sc.next();
                    System.out.println("Edad:");
                    int edad=sc.nextInt();
                    System.out.println("Curso:");
                    System.out.println("1.Java");
                    System.out.println("2.Phyton");
                    System.out.println("3.Base de datos");
                    String curso=sc.nextLine();
                    int opcionCurso=sc.nextInt();
                    switch(opcionCurso){
                        case 1:
                            System.out.println("Eligiendo curso de Java...");
                            curso="Java";
                            break;
                        case 2:
                            System.out.println("Eligiendo curso de Phyton...");
                            curso="Phyton";
                            break;
                        case 3:
                            System.out.println("Eligiendo curso de Base de datos...");
                            curso="Base de datos";
                            break;


                    }
                    es=new estudiante(nombre,edad,curso);
                    es.getNombre();
                    es.getEdad();
                    es.getCurso();
                    re.agregarEstudiantes(es);


                    break;
                case 2:
                    System.out.println("___Lista de estudiantes____:");
                    System.out.println("Nombre: "+es.getNombre());
                    System.out.println("Edad: "+es.getEdad());
                    System.out.println("Curso: "+es.getCurso());
                    break;
                case 3:
                    System.out.println("Guardando archvio...");
                    re.GuardarArchvios("estudiantes_del_curso.txt");
                    break;
                case 4:
                    System.out.println("Cargando archivos..");
                    re.CargarArchivos("estudiantes_del_curso.txt");
                    System.out.println("Archivo cargado correctamente");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    salir=true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }while(!salir);

    }

    }



