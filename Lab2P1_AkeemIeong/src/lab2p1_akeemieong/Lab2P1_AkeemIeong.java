package lab2p1_akeemieong;

import java.util.Scanner;

public class Lab2P1_AkeemIeong {

    public static void main(String[] args) {
    
        Scanner leer=new Scanner(System.in);
    
    int opcion;
  
    
    do{
        System.out.println("1<-Maximo commun divisor");
        System.out.println("2<-Sumatoria");
        System.out.println("3<-Supermercado");
        opcion= leer.nextInt();
        if (opcion==1){
            int numone=0,numtwo=0;
            System.out.println("Ingrese un numero: ");
            numone=leer.nextInt();
            System.out.println("Ingrese otro numero: ");
            numtwo=leer.nextInt();
            int restaone=numone,restatwo=numtwo;
            do{
               if (restaone>restatwo){
               restaone=restaone-restatwo;
               }
               else 
                    if (restatwo>restaone){
                        restatwo=restatwo-restaone;
                    }    
            }while(restaone!=restatwo);
        System.out.println("El MCD es "+restaone);
        }   //fin de opcion1   
        else 
            if (opcion==2){
                double num=0,contador=1,resultado=0,multi=0,sum=0;
                System.out.println("Ingrese un numero: ");
                num = leer.nextInt();
                while (contador<=num){
                    multi=contador/(contador+1);
                    resultado=Math.pow(multi, contador);
                    sum=sum+resultado;
                    contador++;
                }
                    System.out.println("Output "+sum);
            }
            else
                if (opcion==3){
                    int op=0,cant=0;
                    double precio=0,total=0,descuento=0,end=0;
                    System.out.println("0<-Tipo de Cliente 0");
                    System.out.println("1<-Tipo de Cliente 1");
                    System.out.println("2<-Tipo de Cliente 2");
                    System.out.println("3<-Tipo de Cliente 3");
                    op=leer.nextInt();
                    if (op==0){
                        System.out.println("Ingrese la cantidad de productos: ");
                        cant=leer.nextInt();
                        System.out.println("Ingrese el valor del producto unitario: ");
                        precio=leer.nextDouble();
                        if (cant<=19&&cant>=10){
                            total=(cant-2)*precio;
                            System.out.println("El total a pagar es de: "+total);
                        } 
                        else
                            if (cant>=20){
                                 total=(cant-5)*precio;
                                 System.out.println("El total a pagar es de: "+total);
                            }
                            else
                                total=cant*precio;
                                descuento=total*0;
                                end=total-descuento;
                                System.out.println("El total a pagar es de: "+end);
                    }
                    else
                         if (op==1){
                        System.out.println("Ingrese la cantidad de productos: ");
                        cant=leer.nextInt();
                        System.out.println("Ingrese el valor del producto unitario: ");
                        precio=leer.nextDouble();
                        if (cant<=29&&cant>=20){
                        total=(cant-2)*precio;
                        System.out.println("El total a pagar es de: "+total);
                        }
                        else
                            if (cant>=30){
                                 total=(cant-5)*precio;
                                 System.out.println("El total a pagar es de: "+total);
                            }
                            else
                                total=cant*precio;
                                descuento=total*0.10;
                                end=total-descuento;
                                System.out.println("El total a pagar es de: "+end);
                        }
                         else 
                             if (op==2){
                                System.out.println("Ingrese la cantidad de productos: ");
                                cant=leer.nextInt();
                                System.out.println("Ingrese el valor del producto unitario: ");
                                precio=leer.nextDouble();
                                if (cant<=39&&cant>=30){
                                total=((cant-2)*precio)*0.10;
                                System.out.println("El total a pagar es de: "+total);
                                }
                                else
                                    if (cant>=40){
                                      total=(cant-5)*precio;
                                      System.out.println("El total a pagar es de: "+total);
                                    }
                                    else
                                        total=cant*precio;
                                        descuento=total*0.30;
                                        end=total-descuento;
                                        System.out.println("El total a pagar es de: "+end);
                            }         
                }
    }while(opcion!=4);
    }
}
