package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

import Celular.celular;

public class MisArrays {
	public static void main(String[] cecyto) {
		Scanner in = new Scanner(System.in);
		int op = -1;
		do {
			System.out.println("\n\n MENU ARRAYS\n");
			System.out.println("1 ArrayLineal");
			System.out.println("2 tamaño,rellenar e imprimir");
			System.out.println("3 ArrayCuadrado");
			System.out.println("4 ejemplo 3 sort");
			System.out.println("5 EJEMPLO 4: ARRAY BIDIMENCIONAL");
			System.out.println("6 array de objetos");
			System.out.println("0 Salir");
			System.out.println("Escoje");
			op = in.nextInt();
			switch (op) {
			case 1:

				System.out.println("ejemplo lineal");
				int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
				System.out.println("tamaño array " + num.length);
				for (int i = 0; i < num.length; i++)
					System.out.println("numeros[" + i + "]=" + num[i]);
				break;
			case 2:
				System.out.println("ejemplo 2 tamaño,rellenar e imprimir");
				System.out.println("tamaño");
				int tam = in.nextInt();
				System.out.println("rellenar");
				int array1[] = new int[tam];
				for (int i = 0; i < array1.length; i++) {
					array1[i] = in.nextInt();
				}
				for (int i = 0; i < array1.length; i++) {
					System.out.println(array1[i] + " ");
				}

				break;
			case 3:
				System.out.println("\n\nEJEMPLO 3: BUBBLE SORT\n");
				System.out.println("Ingresa el tamaño del Array:");
				int tam1 = in.nextInt();
				int array2[] = new int[tam1];
				for (int i = 0; i < array2.length; i++) {
					array2[i] = in.nextInt();
				}
				// ESTO K SIGUE ES EL BUBBLE SORT
				for (int i = 0; i < tam1 - 1; i++) {
					for (int j = 0; j < tam1 - i - 1; j++) {
						if (array2[j] > array2[j + 1]) {
							int temp = array2[j];
							array2[j] = array2[j + 1];
							array2[j + 1] = temp;
						}
					}
				}
				System.out.println(" ARRAY ORDENADO menor a mayor");
				for (int i = 0; i < array2.length; i++) {
					System.out.print(array2[i] + " ");
				}
				System.out.println("\n\n ARRAY ORDENADO mayor a menor");
				for (int i = tam1 - 1; i >= 0; i--) {
					System.out.print(array2[i] + " ");
				}

				break;
			case 4:
				System.out.println("ejemplo 3 sort");
				int bidi[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
				for (int i = 0; i < bidi.length; i++) {
					for (int j = 0; j < bidi.length; j++) {
						System.out.print(bidi[j][i] + " ");
					}
					System.out.println("");
				}
				System.out.println("\n\n");
				for (int i = 0; i < bidi.length; i++) {
					for (int j = bidi.length - 1; j >= 0; j--) {
						System.out.print(bidi[j][i] + " ");
					}
					System.out.println("");
				}
				System.out.println("\n\n");
				for (int i = 0; i < bidi.length; i++) {
					for (int j = bidi.length - 1; j >= 0; j--) {
						System.out.print(bidi[i][j] + " ");
					}
					System.out.println("");
				}
				System.out.println("\n\n");
				for (int i = bidi.length - 1; i >= 0; i--) {
					for (int j = 0; j < bidi.length; j++) {
						System.out.print(bidi[j][i] + " ");
					}
					System.out.println("");
				}
				System.out.println("\n\n");
				for (int i = bidi.length - 1; i >= 0; i--) {
					for (int j = 0; j < bidi.length; j++) {
						System.out.print(bidi[i][j] + " ");
					}
					System.out.println("");
				}
				System.out.println("\nGIRO 180 GRADOS");
				for (int i = bidi.length - 1; i >= 0; i--) {
					for (int j = bidi.length - 1; j >= 0; j--) {
						System.out.print(bidi[i][j] + " ");
					}
					System.out.println("");
				}
				break;
			case 5:
				System.out.println("\n\nEJEMPLO 5: ARRAY BIDIMENCIONAL 2\n");
				System.out.println("NUMERO DE FILAS: ");
				int filas = in.nextInt();
				System.out.println("NUMERO DE COLLINNAS: ");
				int columnas = in.nextInt();
				int bidi2[][] = new int[filas][columnas];
				int suma[] = new int[filas];
				int sumacol[] = new int[columnas];
				for (int i = 0; i < filas; i++) {
					for (int j = 0; j < columnas; j++) {
						bidi2[i][j] = in.nextInt();
					}
				}
				for (int i = 0; i < filas; i++) {
					for (int j = 0; j < columnas; j++) {
						suma[i] += bidi2[i][j];
						sumacol[j] += bidi2[i][j];
					}
				}
				for (int i = 0; i < suma.length; i++) {
					System.out.println("Fila" + (i + 1) + "=>" + suma[i]);
					// AQUI VA EL CODIGO DE LA SUMA DE COLUMNAS
				}
					for (int ia = 0; ia < sumacol.length; ia++) {
						System.out.println("Columna " + (ia + 1) + "->" + sumacol[ia]);
					}
				
				break;
			case 6:
				System.out.println("6 array de objetos");
				ArrayList<celular> lista = new ArrayList<celular>();
				int ox = -1;
				do {
					System.out.println("\n\n MENU ARRAYS list\n");
					System.out.println("1 cuantos elementos hay?");
					System.out.println("2 agregar celular");
					System.out.println("3 mostrar celulares");
					System.out.println("4 borrar array");
					System.out.println("0 Salir");
					System.out.println("Escoje");
					ox = in.nextInt();

					switch (ox) {
					case 1:
						System.out.println("tamaño=>" + lista.size());
						break;
					case 2:
						System.out.println("agregar celulares");
						System.out.println("marca?");
						String marca = in.next();
						System.out.println("modelo?");
						String modelo = in.next();
						System.out.println("procesador");
						String procesador = in.next();
						System.out.println("color?");
						String color = in.next();
						System.out.println("ram");
						int ram = in.nextInt();
						celular x = new celular(marca, modelo, color, procesador, ram);
						lista.add(x);
						break;
					case 3:
						System.out.println("celulares guardados");
						for (celular c : lista) {
							System.out.println("" + c.toString());

						}
						break;
					case 4:
						lista.clear();
						System.out.println("se borro :v");
						break;
					default:
						System.out.println("inbalido");
						break;
					}

				} while (ox != 0);
				break;
			case 7:
				System.out.println("\n\nEJEMPLO 7: ARRAY DE LO QUE SEA\n"); 
				ArrayList<Object> listaO= new ArrayList<Object>(); 
				int opc=-1;
				do {
				System.out.println("\n\n MENU ARRAYLIST\n");
				System.out.println("1. Guardar Array");
				System.out.println("2. Guardar String");
				System.out.println("3. Guardar Int");
				System.out.println("4. Guardar Bidi");
				System.out.println("0. Salir");
				ox=in.nextInt();
				switch (ox) {
				case 1:
				System.out.println("\n\nGUARDAR ARRAY\n");
				System.out.println("Ingresa el tamaño del Array:");
				int tam5= in.nextInt(); 
				int array5[] = new int[tam5];
				for (int i = 0; i < array5.length; i++) {
				  array5[i] = in.nextInt();
				}
				listaO.add(array5);
				break;
				case 2:
				System.out.println("\n\nGUARDAR STRING\n");
				System.out.println("Cadena de texto?:"); 
				String texto= in.nextLine();
				listaO.add(texto);
				break;
				case 3:
				System.out.println("\n\nGUARDAR INT\n");
				System.out.println("Entero?: ");
				int n10= in.nextInt();
				listaO.add(n10);
				break;
				case 4:
					System.out.println("\n\nEJEMPLO 5: ARRAY BIDIMENCIONAL 2\n");
					System.out.println("NUMERO DE FILAS: ");
					int filasa = in.nextInt();
					System.out.println("NUMERO DE COLLINNAS: ");
					int columnasa = in.nextInt();
					int bidi2a[][] = new int[filasa][columnasa];
					int sumaa[] = new int[filasa];
					int sumacola[] = new int[columnasa];
					for (int i = 0; i < filasa; i++) {
						for (int j = 0; j < columnasa; j++) {
							bidi2a[i][j] = in.nextInt();
						}
					}
					for (int i = 0; i < filasa; i++) {
						for (int j = 0; j < columnasa; j++) {
							sumaa[i] += bidi2a[i][j];
							sumacola[j] += bidi2a[i][j];
						}
					}
					listaO.add(bidi2a);
				}
				
				} while (ox != 0);
				
				break;
				default:
			
				System.out.println("Nel");
				break;
			}
				
		} while (op != 0);
		}}
				
			