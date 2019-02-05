// SumaEnterosEnC.cpp: define el punto de entrada de la aplicación de consola.
//

#include "stdafx.h"
#include "stdio.h"


int main()
{
	int entero1; //First input number by user
	int entero2; //Second input number by user
	int suma; //variable to store sum of entero1 and entero2

	printf("Please input the first value\n"); //Reques user to input value for entero1
	scanf_s("%d", &entero1);

	printf("Please input the second value\n"); //Reques user to input value for entero2
	scanf_s("%d", &entero2);

	suma = entero1 + entero2;

	printf("Sum of entero1 and entero 2 is: %d", suma);

	getchar();
	getchar();
    return 0;
}

