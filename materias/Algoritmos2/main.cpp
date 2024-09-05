#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop 
EJERCICO 1
----------------------------------------------
int suma(int v[], int n, int num){
	if (n == 0){
		return (num);
	}else{
		num = num + v[n];
		suma (v, n - 1,num);
}}


int main(int argc, char** argv) {
	int v []= {1, 2, 3, 4, 5};
	int num = v[0];
	
	printf("%d", suma (v, 4, num));
	
}

-------------------------------------------------
*/
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
 
