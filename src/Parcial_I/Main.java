package Parcial_I;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String OP;

        System.out.println("\nBienvenido a Gestión de Tareas y Proyectos");
        System.out.println("\n ¿Que deseas realizar hoy?: ");
        System.out.println("\n a) Crear un Usuario \n b) Ingresar con usuario \n c) Salir de la gestion \n Escoge una opción: ");
        OP = sc.nextLine();

        //Usuarios
        Usuario usu = new Usuario();
        Usuario usu2 = new Usuario("Jaqueline","Virves","jaqueline@gmail.com",1333,"JVIRVES");
        Usuario usu3 = new Usuario("Abigail","Virves","abigail@gmail.com",1105,"AVIRVES");
        Usuario usu4 = new Usuario("Donato","Virves","donato@gmail.com",2205,"DVIRVES");



        /*if (OP.equals("a")) {

            System.out.println("\n Ingrese un No. de ID: ");

            System.out.println("\n Ingrese un nombre de  Usuario: ");
            usu.setNombreUsuario(sc.nextLine());
            System.out.println("\n Ingrese su nombre : ");
            usu.setNombre(sc.nextLine());
            System.out.println("\n Ingrese su apellido : ");
            usu.setApellido(sc.nextLine());
            System.out.println("\n Ingrese su correo : ");
            usu.setCorreo(sc.nextLine());

        }else if (OP.equals("b")) {

            System.out.println("\n Seleccione una opcion: ");

            System.out.println("\n 1) Usuario 1 \n 2) Usuario 2 \n 3) Usuario 3 \n 4) Salir de la gestion");


            if (OPU.equals("1")) {


                System.out.println("\n Bienvenido: "+usu2.getNombreUsuario());


            }else if (OPU.equals("2")) {


                System.out.println("\n Bienvenido: "+usu3.getNombreUsuario());

            }else if (OPU.equals("3")) {

                System.out.println("\n Bienvenido: "+usu4.getNombreUsuario());

            }


        }else if (OP.equals("c")) {

            System.out.println("\n Salida exitosa de la gestión de tarea y proyectos");

        }*/


        //Proyectos
        Proyecto proy = new Proyecto();
        Proyecto proy2 = new Proyecto("Tarea 01\t","Realizar lo indicado para este proyecto","12 de agosto","19 de agosto");
        Proyecto proy3 = new Proyecto();

        proy.setNombreProyecto("\nProyecto Pyton\t");
        proy.setDescripcionProyecto("Debes realizar un proyecto en Pyton integrando todo lo aprendido en las clases iniciales");

        proy3.setNombreProyecto("\tParcial 01");
        proy3.setDescripcionProyecto("\nRealizar lo que se indica como prueba practica del parcial\t");
        proy3.setFechaInicio("\nEl proyecto inicia el 4 de agosto");
        proy3.setFechaFin("\nEl proyecto finaliza el 11 de agosto");

        System.out.println("\n---------------------------");
        System.out.println("\nHola: "+ usu3.getNombreUsuario());

        //Listas
        List<String> list = new ArrayList<String>();
        list.add(proy2.getNombreProyecto()+ proy2.getDescripcionProyecto());
        list.add(proy.getNombreProyecto()+ proy.getDescripcionProyecto());
        list.add(proy3.getNombreProyecto()+ proy3.getDescripcionProyecto() + proy3.getFechaInicio()+ proy3.getFechaFin());


        for (String listas : list){

            System.out.println(listas);
        }

        //Tareas
        Tarea tarea = new Tarea();
        Tarea tarea2 = new Tarea("Tarea C++","Realizar un programa en C++","18 de agosto 2024","Alta", "\tpendiente");
        Tarea tarea3 = new Tarea();

        tarea3.setTituloTarea("Tarea Pyton");
        tarea3.setDescripcion("Realizar un ejercicio en Pynton");
        tarea3.setPrioridad("Media");
        tarea3.setEstado("en progreso");
        tarea3.setFechaLimite("24 de septiembre");

        //Map
        Map<Integer,String> asigTareas = new HashMap<>();
        asigTareas.put(usu3.getID(), tarea3.setTituloTarea("Tarea C++"));

        System.out.println("\n--------------------------");
        System.out.println("\n Nueva tarea asignada \t"+ asigTareas);

        Map<Integer,String> asigTareas2 = new HashMap<>();
        asigTareas2.put(usu2.getID(),tarea2.setTituloTarea("\tTarea Pyton"));

        System.out.println("\n--------------------------");
        System.out.println("\n Nueva tarea asignada: \t"+"Usuario: "+ usu2.getNombreUsuario()+"\tID Usuario: "+ asigTareas2 + "\tEstado:" + tarea2.getEstado());

        Map<Integer,String> proyect = new HashMap<>();

        proyect.put(usu4.getID(), proy3.getNombreProyecto());
        System.out.println("\n--------------------------");
        System.out.println("\n Nuevo proyecto asignado: "+ "Usuario: " +usu4.getNombreUsuario() + "\tID Usuario: " + proyect);


    }
}
