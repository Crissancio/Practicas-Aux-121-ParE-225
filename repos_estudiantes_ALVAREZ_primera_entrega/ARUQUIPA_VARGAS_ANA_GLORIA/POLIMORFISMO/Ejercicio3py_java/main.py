from Matriz import Matriz
if __name__ == "__main__":
    m1 = Matriz()
    print("Matriz identidad:")
    m1.mostrar()

    datos = [[float(i + j) for j in range(10)] for i in range(10)]
    m2 = Matriz(datos)
    print("\nMatriz personalizada:")
    m2.mostrar()

    suma = m1.sumar(m2)
    print("\nSuma:")
    suma.mostrar()

    resta = m2.restar(m1)
    print("\nResta:")
    resta.mostrar()

    print("\n¿m1 igual a m2?:", m1.igual(m2))
    print("¿m1 igual a m1?:", m1.igual(Matriz())) 
