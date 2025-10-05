/**
 * Laboratorio 3
 * @author Helen Perez Condori
 * @version 1.0 17/09/2025
 */
import random
from multimethod import multimethod

class Juego:
    def __init__(self, numeroDeVidas):
        self.numeroDeVidas = numeroDeVidas
        self.record = 0

    def reiniciaPartida(self):
        self.numeroDeVidas = self.numeroDeVidas 

    def actualizaRecord(self):
        if self.numeroDeVidas > self.record:
            self.record = self.numeroDeVidas
            print(f"¡Tu puntaje actual es: {self.record}!")
    
    def quitaVida(self):
        self.numeroDeVidas = self.numeroDeVidas - 1
        print(f"Vidas restantes: {self.numeroDeVidas}")
        return self.numeroDeVidas > 0
        
class JuegoAdivinaNumero(Juego):
    def __init__(self, numeroDeVidas):
        super().__init__(numeroDeVidas)
        self.numeroAAdivinar = 0

    @multimethod
    def validaNumero(self, numero:int):
        return 0 <= numero <= 10
    
    @multimethod
    def validaNumero(self, numero: str):
        try:
            num = int(numero)
            return self.validaNumero(num)
        except ValueError:
            return False
    
    def juega(self):
        self.reiniciaPartida()
        self.numeroAAdivinar = random.randint(0, 10)
        print("====== Adivina un número entre 0 y 10 =======")        
        while True:
            entrada = input("Ingresa un número: ")
            
            if not self.validaNumero(entrada):
                print("Error: Debe ser un número entre 0 y 10")
                continue
                
            numero = int(entrada)
            
            if numero == self.numeroAAdivinar:
                print("¡Acertaste!")
                self.actualizaRecord()
                break
            else:
                if not self.quitaVida():
                    print("Te has quedado sin vidas. El número era:", self.numeroAAdivinar)
                    break
                else:
                    if numero < self.numeroAAdivinar:
                        print("El número a adivinar es mayor")
                    else:
                        print("El número a adivinar es menor")

class JuegoAdivinaPar(JuegoAdivinaNumero):
    @multimethod
    def validaNumero(self, numero: int):
        if not (0 <= numero <= 10):
            return False
        if numero % 2 == 0:
            return True
        else:
            print("Error: El número debe ser par")
            return False

    @multimethod
    def validaNumero(self, numero: str):
        try:
            num = int(numero)
            return self.validaNumero(num)
        except ValueError:
            return False

    def juega(self): 
        self.reiniciaPartida()
        self.numeroAAdivinar = random.choice([0, 2, 4, 6, 8, 10])
        print("====== Adivina un número PAR entre 0 y 10 ======")
        
        while True:
            entrada = input("Ingresa un número PAR: ")
            
            if not self.validaNumero(entrada):
                print("Error: Debe ser un número PAR entre 0 y 10")
                continue
                
            numero = int(entrada)
            
            if numero == self.numeroAAdivinar:
                print("¡Acertaste!")
                self.actualizaRecord()
                break
            else:
                if not self.quitaVida():
                    print("Te has quedado sin vidas. El número era:", self.numeroAAdivinar)
                    break
                else:
                    if numero < self.numeroAAdivinar:
                        print("El número a adivinar es mayor")
                    else:
                        print("El número a adivinar es menor")

class JuegoAdivinaImpar(JuegoAdivinaNumero):
    @multimethod
    def validaNumero(self, numero: int):
        if not (0 <= numero <= 10):
            return False
        if numero % 2 != 0:
            return True
        else:
            print("Error: El número debe ser impar")
            return False

    @multimethod
    def validaNumero(self, numero: str):
        try:
            num = int(numero)
            return self.validaNumero(num)
        except ValueError:
            return False

    def juega(self):
        self.reiniciaPartida()
        self.numeroAAdivinar = random.choice([1, 3, 5, 7, 9])
        print("===== Adivina un número IMPAR entre 0 y 10 =====")
        
        while True:
            entrada = input("Ingresa un número IMPAR: ")
            
            if not self.validaNumero(entrada):
                print("Error: Debe ser un número IMPAR entre 0 y 10")
                continue
                
            numero = int(entrada)
            
            if numero == self.numeroAAdivinar:
                print("¡Acertaste!")
                self.actualizaRecord()
                break
            else:
                if not self.quitaVida():
                    print("Te has quedado sin vidas. El número era:", self.numeroAAdivinar)
                    break
                else:
                    if numero < self.numeroAAdivinar:
                        print("El número a adivinar es mayor")
                    else:
                        print("El número a adivinar es menor")

class Aplicacion:
    def main(self):
        print("BIENVENIDO A LOS JUEGOS DE ADIVINANZA")
        
        juegos = [
            JuegoAdivinaNumero(3),
            JuegoAdivinaPar(3),
            JuegoAdivinaImpar(3)
        ]
        
        tipos_juego = ["Normal", "Par", "Impar"]
        
        for i, juego in enumerate(juegos):
            print(f"\n--- Juego {tipos_juego[i]} ---")
            juego.juega()
            print()

if __name__ == "__main__":
    app = Aplicacion()

    app.main()
