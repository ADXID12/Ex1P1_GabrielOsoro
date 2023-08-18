package ex.p1_gabrielosorto;

import java.util.Scanner;

public class ExP1_GabrielOsorto {

    static Scanner sc = new Scanner(System.in);
    static Scanner lt = new Scanner(System.in);
    static String cadena1, cadena2, cadena3, cadena4, cadena5, cadena6, cadena9, ver1, ver2;

    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir == true) {
            System.out.println("Menu");
            System.out.println("1. Anagrama");
            System.out.println("2. Compresor de cadenas");
            System.out.println("3. Reemplazo de cadenas");
            System.out.println("4. Bonus");
            System.out.println("5. Salir");
            System.out.print("Que desea hacer?:");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    boolean conti = true;
                    while (conti) {
                        System.out.println("****Anagrama****");
                        System.out.print("Ingrese la primera cadena:");
                        cadena1 = lt.nextLine();
                        System.out.println("");
                        System.out.print("Ingrese la segunda cadena:");
                        cadena2 = lt.nextLine();
                        Anagrama();//llamada del metodo
                        System.out.println("desea continuar(1.SI/2.NO)");
                        int continuar = sc.nextInt();
                        System.out.println("");
                        if (continuar == 2) {
                            conti = false;
                            System.out.println("Volviendo al menu....");
                            System.out.println("");
                        }//fin if repeticion
                        System.out.println("");
                    }//fin while ejercicio 1
                    break;
                case 2:
                    boolean conti2 = true;
                    while (conti2) {
                        System.out.println("***Compresor de Cadenas****");
                        System.out.print("Ingrese Cadena:");
                        cadena3 = lt.nextLine();
                        System.out.println("");
                        Compresor_Cadenas();//llamada del metodo
                        System.out.println("");
                        System.out.println("Desea continuar? (1.SI/2.NO)");
                        int continuar = sc.nextInt();
                        if (continuar == 2) {
                            System.out.println("Volviendo al menu.....");
                            System.out.println("");
                            conti2 = false;
                        }
                    }//fin while segundo ejercicio
                    break;
                case 3:
                    boolean conti3 = true;
                    while (conti3) {
                        System.out.println("Reemplazo de Cadena");
                        System.out.print("Ingrese la cadena:");
                        cadena4 = lt.nextLine();
                        System.out.println("");
                        System.out.print("ingrese la palabra a buscar:");
                        cadena5 = lt.nextLine();
                        System.out.println("");
                        System.out.print("Ingrese la palabra a reemplazar:");
                        cadena6 = lt.nextLine();
                        System.out.println("");
                        System.out.println("No mi pai este esta en construccion rey.");
                        System.out.println("desea continuar?(1.SI/2.NO)");
                        int continuar = sc.nextInt();
                        if (continuar == 2) {
                            System.out.println("volviendo al menu.....");
                            conti3 = false;
                            System.out.println("");
                        }
                    }
                    break;
                case 4:
                    boolean conti4 = true;
                    while (conti4) {
                        System.out.println("****Bonus****");
                        System.out.println("Asegurese que sean versiones menores a 10");
                        System.out.print("Ingrese la primer version:");
                        ver1 = lt.nextLine();
                        System.out.println("");
                        System.out.print("Ingrese la segunda version:");
                        ver2 = lt.nextLine();
                        System.out.println("");
                        Bonus();//llamada del metodo
                        System.out.println("");
                        System.out.println("Desea continuar? (1.SI/2.NO)");
                        int continuar = sc.nextInt();
                        if (continuar == 2) {
                            System.out.println("Volviendo al menu.....");
                            conti4 = false;
                            System.out.println("");
                        }
                    }//fin while ejercicio bonus
                    break;
                case 5:
                    System.out.println("GRACIAS POR USAR :)");
                    seguir = false;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    System.out.println("");
                    break;
            }//Fin switch principal
        }//Fin while principal
    }//fin main

    public static void Anagrama() {
        int conta = 0;
        if (cadena1.length() == cadena2.length()) {
            for (int i = 0; i < cadena1.length(); i++) {
                for (int j = 0; j < cadena1.length(); j++) {
                    if (cadena1.charAt(j) == cadena2.charAt(i)) {
                        conta++;
                    }//if interno del for
                }//fin for interno interno del metodo anagrama
            }//fin for interno del metodo anagrama
            if (conta == cadena1.length()) {
                System.out.println("Las palabras si son anagramas.");
            } else {
                System.out.println("Las palabras no son anagramas.");
            }
        }//fin if externo del metodo anagrama
        else {
            System.out.println("las palabras no son anagramas.");
        }//fin else del metodo anagrama
    }//fin primer metodo

    public static void Compresor_Cadenas() {
        cadena5 = cadena3;
        int cont3 = 0;
        System.out.print("La cadena comprimida es:");
        for (int i = 0; i < cadena5.length(); i++) {
            for (int j = 0; j < cadena5.length(); j++) {
                char c = cadena5.charAt(i);
                if (cadena5.charAt(j) == cadena5.charAt(i)) {
                    cont3++;
                }//fin if interno ejercicio 2
                else {
                    cont3 = 0;
                }
                System.out.print("La cadena comprimida es:"+cadena5.charAt(i)+cont3);
            }//fin for interno interno ejercicio
        }//fin for interno ejercicio 2
    }//fin segundo metodo

    public static String Reemplazo_Palabras(String cad4, String cad5, String cad6) {
        cadena9 = cadena4;
        String reemplazo = cadena9;
        return reemplazo;
    }//fin tercer Metodo

    public static void Bonus() {
        String version1 = ver1;
        String version2 = ver2;
        int cont_puntos = 0;
        int cont_numeros = 0;
        for (int i = 0; i < ver1.length(); i++) {
            if (version1.charAt(i) == '.') {
                cont_puntos++;
            }//fin if validacion puntos
            else {
                cont_numeros++;
            }//fin else validacion puntos
        }//fin for validacion puntos
        while (cont_puntos > cont_numeros) {
            System.out.println("Opciones no validas, ingrese versiones validas (verifique la cantidad de puntos decimales)");
            System.out.print("Ingrese la primer version:");
            version1 = lt.nextLine();
            System.out.println("");
            System.out.print("Ingrese la segunda version:");
            version2 = lt.nextLine();
            for (int i = 0; i < ver1.length(); i++) {
                if (version1.charAt(i) == '.') {
                    cont_puntos++;
                }//fin if validacion puntos
                else {
                    cont_numeros++;
                }//fin else validacion puntos
            }//fin for validacion puntos   
        }//fin while
        for (int i = 0; i < ver1.length(); i++) {
            if (version1.charAt(i) == '.') {//inicio if externo bonus
                continue;
            }//fin if validar punto
            else {//inicio else
                if (version1.charAt(i) > version2.charAt(i)) {//inicio if interno 
                    System.out.println("La version " + ver1 + " es la version mas reciente.");
                    break;
                }//fin if si version 1 es mayor
                else if (version1.charAt(i) < version2.charAt(i)) {//inicio else if
                    System.out.println("La version " + ver2 + " es la version mas reciente.");
                    break;
                }//fin else if si la version 2 es mayor
            }//fin else principal ejercicio bonus
        }//fin for principal ejercicio bonus
    }//fin static void ejercicio bonus
}//fin clase
