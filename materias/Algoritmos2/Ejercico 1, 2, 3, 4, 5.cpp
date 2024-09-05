#include <stdio.h>
#include <stdlib.h>

/* EJERCICIO 1 
----------------------------------------------------------------
SumNat (int v[],int acum,int x  ){
	if (x == 0){
		acum = acum + v[x - 1];
		return acum;
	}else {
		acum = acum + v[x - 1];
		SumNat(v, acum, x - 1);
	}
}



int main(int argc, char *argv[]) {
	int v[] = {1, 2, 3, 4};
	int acum = 0; 
	
	
	printf("%d", SumNat(v, acum , 5));
}


EJERCICIO 2
---------------------------------------------------- 

cantDig (int cont, int numero){
	if ((numero >= 0 ) && (numero < 10)){
		return cont + 1;
	}
	else{
		cont = cont + 1;
		cantDig (cont, (numero / 10));
	}
}


int main (int argc ,char *argv[]){
	int cont = 0;
		
	printf("%d", cantDig(cont, 10));
}


EJERCICIO 3
--------------------------------------------------- 

prodSumSuc (int acum, int num1, int num2){
	if (num2 == 0 ){
		return acum; 
	} else {
		acum = acum + num1;
		prodSumSuc (acum, num1, num2 - 1);
	}
}



int main (int argc ,char *argv[]){
	int acum = 0; 
	prodSumSuc(acum, 5, 3);
	printf("%d", prodSumSuc(acum, 0, 3));
}


EJERCICIO 4
--------------------------------------------------- 

int main (int argc ,char *argv[]){
	
		int divisor = 78, dividendo = 23456789;
		//scanf("ingrese el divisor: %d", divisor);
		//scanf("ingrese el dividendo: %d", dividendo);
		div_t result = div(dividendo, divisor);
		
		printf("Esta es una funcion que viene con el paquete, que te da el cociente de la division entre dos numeros %d", result.quot);
}


EJERCICIO 5
---------------------------------------------------- 

restaSucResto (int divisor, int dividendo, int acum){
	
	if (divisor < dividendo){
		if ((divisor * acum) < dividendo){
			restaSucResto(divisor, dividendo, acum + 1);
		}else if ((divisor * acum) == dividendo) {
				return 0;
			}else{
				restaSucResto(divisor, dividendo - ((acum - 1) * divisor), 1);
			}	
	}else if (divisor == dividendo){
			return 0;
		} else {
			return dividendo;
		}
	}





int main (int argc ,char *argv[]){
	int acum = 1;
	printf("%d", restaSucResto(50, 58962 , acum));
	
}



EJERCICIO 6
------------------------------------------------------------ 
 
 */
menorVec (int v[], int n, int *num){
 	if (n == 0){
 		return (*num);
 	}else{
	 
		if (v[n] < *num){
	 		*num = v[n];
	 	menorVec(v, n - 1, num);

 }
}
}

 
 
 
 int main (int argc ,char *argv[]){
	int v[] = {8, 2, 4, 5, 3};
	int x;
	int num = menorVec(v, 4,  &num);
	
	printf("%d",num );
		
}
 /*
 ---------------------------------------------------------- 
 
bool ejer7 (int primero, int ultimo, bool capicua, int numero[]){
	int num1, num2;
	num1 = numero[primero];
	num2 = numero [ultimo];
	
	if ((primero < ultimo) && (capicua)){
		if (num1 != num2){
			return capicua = false;
		}else {
			ejer7(primero + 1, ultimo - 1, capicua, numero);
			}
	}else{
		return capicua;
	}
}	

 
 
 
 int main (int argc ,char *argv[]){
 	int primero = 0, ultimo = 3;
 	bool capicua = true;
 	int numero[] = {1, 2, 2, 0};
 	
 	capicua = ejer7(primero, ultimo, capicua, numero);
 	if (capicua == true){
	 	printf("el numero es capicua");
	 }else{
	 	printf("el numero no es capicua");
	 }
 	
 }
 
 
 
 EJERCICIO 8
 ---------------------------------------------------------------------- 

   0 	si y = 0
 	x 	si y = 1 
 	mult(2 * x, y / 2) 	si y >= 2 e y es par
 	mult(2 * x, y / 2)+ x 	si >= 2 e y es impar




int mult (int x, int y){
	if (y == 0){
		return 0;
	} else if (y == 1) {
		return (x);
	}else {
		if ((y >= 2) && ((y % 2) == 0)){
			mult(2 * x, y / 2);
		}else{
			(mult(2 * x, y / 2 )+ x);
		}
	}
}

int main (int argc ,char *argv[]){
	int result;
	result = mult (2, 4);
	printf("%d", result);
		
}


*/


