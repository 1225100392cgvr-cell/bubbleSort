Algoritmo Lista
	Definir arreglo, n, pasada, i, auxiliar Como Entero
	Definir huboIntercambio Como Logico
	
	n <- 5
	Dimension arreglo[5]
	arreglo[1] <- 10
	arreglo[2] <- 3
	arreglo[3] <- 7
	arreglo[4] <- 6
	arreglo[5] <- 17
	
	pasada <- 1
		Para i <- 1 Hasta n - pasada Hacer
			Si arreglo[i] > arreglo[i + 1] Entonces
				auxiliar <- arreglo[i]
				arreglo[i] <- arreglo[i + 1]
				arreglo[i + 1] <- auxiliar
				huboIntercambio <- Verdadero
			FinSi
		FinPara
		pasada <- pasada + 1
	
	Para i <- 1 Hasta n Hacer
		Escribir arreglo[i]
	FinPara
FinAlgoritmo