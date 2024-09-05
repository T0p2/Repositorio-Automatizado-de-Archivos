import TAD_Lista as l
'''
Ej 39. 
Definir la función cantidad, que dada una lista de enteros y un número n, retorne la cantidad de apariciones del número n en la lista dada.

funcion cantidad(xs: Lista(entero), n: entero): entero
	vars:
        c: entero
        x: entero

    Si esListaVacia(xs) entonces
        c <- 0
    sino
        head(xs, x)
        tail(xs)
        c <- cantidad(xs, n)
        si x = n entonces
            devolver c + 1
        sino
            devolver c
        fSi
    
'''

def cantidad(xs , n):
    if l.esListaVacia(xs):
        # c = 0
        return 0 # return c
    else:
        x = l.head(xs)
        xs = l.tail(xs)
        c = cantidad(xs , n)
        if (x == n):
            c = c + 1
            return c
        else:
            return c

xs = [1,2,3,3,4,3,3,2,1,1,0,3]
n = 3
print("el numero", n, " se repitio: ", cantidad(xs, n), "veces")
