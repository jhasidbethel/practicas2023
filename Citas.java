import java.util.Scanner;
class Citas {   
      public static void main(String [] args) { 
          /* programa, que muestre que persona puede empezar una
             relacion romantica */
             Scanner entrada = new Scanner(System.in);
             System.out.println("digita el nombre : ");
             String nombre = entrada.nextLine();
             int juan = 18, anna = 18, sara = 17;
              
             if (nombre.equalsIgnoreCase("juan")) { 
                System.out.println("juan tiene 18 años y puede comenzar una relacion sana");
             } else if (nombre.equalsIgnoreCase("anna")) { 
                System.out.println("anna tiene 18 años y puede comenzar una relacion");
             } else if (nombre.equalsIgnoreCase("sara")) { 
                System.out.println("sara es menor de edad y no puede comenzar una relacion");
             } else { 
                System.out.println(nombre + " " + "no conozco tu edad, por tal motivo no puedo determinar si eres apto para una relacion");
             }
              
        } 
    }
               