
class Ordenador:
    def __init__(self, codigo_serial, numero, ram, procesador, estado):
        self.codigo_serial = codigo_serial
        self.numero = numero
        self.ram = ram  
        self.procesador = procesador
        self.estado = estado 

    def mostrar(self):
        print(f"Código: {self.codigo_serial}, Nº: {self.numero}, RAM: {self.ram}GB, CPU: {self.procesador}, Estado: {self.estado}")
