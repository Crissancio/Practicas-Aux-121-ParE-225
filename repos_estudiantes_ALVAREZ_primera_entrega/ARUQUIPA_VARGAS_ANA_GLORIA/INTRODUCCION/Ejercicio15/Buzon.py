class Carta:
    def __init__(self, codigo: str, descripcion: str):
        self.codigo = codigo
        self.descripcion = descripcion

    def mostrar(self):
        print(f"Código: {self.codigo}")
        print("Descripción:")
        print(self.descripcion)
        print("-" * 40)


class Buzon:
    def __init__(self, nro: int):
        self.nro = nro
        self.nroC = 0
        self.c = [["" for _ in range(3)] for _ in range(50)] 

    def agregar_carta(self, codigo: str, remitente: str, destinatario: str):
        if self.nroC < 50:
            self.c[self.nroC][0] = codigo
            self.c[self.nroC][1] = remitente
            self.c[self.nroC][2] = destinatario
            self.nroC += 1
        else:
            print("Buzón lleno")

    def eliminar(self, codigo: str):
        for i in range(self.nroC):
            if self.c[i][0] == codigo:
                for j in range(i, self.nroC - 1):
                    self.c[j] = self.c[j + 1]
                self.c[self.nroC - 1] = ["", "", ""]
                self.nroC -= 1
                print(f"Carta con código {codigo} eliminada del buzón {self.nro}.")
                return True
        print(f"No se encontró carta con código {codigo} en buzón {self.nro}.")
        return False

    def contar(self, destinatario: str) -> int:
        return sum(1 for i in range(self.nroC) if self.c[i][2] == destinatario)

    def recibieron(self):
        remitentes = set()
        destinatarios = set()
        for i in range(self.nroC):
            remitentes.add(self.c[i][1])
            destinatarios.add(self.c[i][2])
        return remitentes.intersection(destinatarios)

    def mostrar_cartas(self, cartas_descripciones: dict):
        print(f"Buzón nro {self.nro} con {self.nroC} cartas:")
        for i in range(self.nroC):
            codigo, remitente, destinatario = self.c[i]
            descripcion = cartas_descripciones.get(codigo, "Sin descripción")
            print(f"Código: {codigo}, Remitente: {remitente}, Destinatario: {destinatario}")
            print(f"Descripción:\n{descripcion}")
            print("-" * 40)



