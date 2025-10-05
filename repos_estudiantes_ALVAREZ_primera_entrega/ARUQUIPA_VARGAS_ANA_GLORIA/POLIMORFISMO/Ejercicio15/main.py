
from Ordenador import Ordenador
from Laboratorio import Laboratorio

def trasladar_ordenadores(lab_origen, lab_destino, cantidad):
    print("\n Estado ANTES del traslado:")
    lab_origen.informacion()
    lab_destino.informacion()

    trasladados = 0
    nuevos_ordenadores = []
    for ordenador in lab_origen.ordenadores:
        if trasladados < cantidad and len(lab_destino.ordenadores) < lab_destino.capacidad:
            lab_destino.agregar_ordenador(ordenador)
            trasladados += 1
        else:
            nuevos_ordenadores.append(ordenador)

    lab_origen.ordenadores = nuevos_ordenadores

    print("\n Traslado completado.")
    print("\n Estado DESPUÉS del traslado:")
    lab_origen.informacion()
    lab_destino.informacion()


lasin1 = Laboratorio("Lasin 1", 5)
lasin2 = Laboratorio("Lasin 2", 5)

o1 = Ordenador("SN001", 1, 8, "Intel i5", "activo")
o2 = Ordenador("SN002", 2, 16, "Intel i7", "activo")
o3 = Ordenador("SN003", 3, 4, "Intel i3", "inactivo")
o4 = Ordenador("SN004", 4, 12, "AMD Ryzen 5", "activo")
o5 = Ordenador("SN005", 5, 6, "Intel i5", "inactivo")
o6 = Ordenador("SN006", 6, 32, "AMD Ryzen 7", "activo")

lasin1.agregar_ordenador(o1)
lasin1.agregar_ordenador(o2)
lasin1.agregar_ordenador(o3)
lasin1.agregar_ordenador(o4)

lasin2.agregar_ordenador(o5)
lasin2.agregar_ordenador(o6)

print("\n Mostrar ordenadores ACTIVOS en Lasin 1:")
lasin1.informacion("activo")

print("\n Mostrar ordenadores con RAM > 8 GB en Lasin 2:")
lasin2.informacion("ram>8")

trasladar_ordenadores(lasin1, lasin2, 2)
