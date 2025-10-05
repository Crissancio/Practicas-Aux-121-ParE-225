from Ejercicio2 import Bus
def main():
    mi_bus = Bus(t_asientos=29)

    print("\n Subieron 5 pasajeros")
    mi_bus.subir_pasajeros(5)
    print("\n se les cobro el pasaje")
    mi_bus.cobrar_pasaje()
    print("\n Asientos que quedan disponibles")
    mi_bus.asientos_disponibles()
    print(f"\n Ingresos")
    print(f"Total Cobrado: Bs. {mi_bus.ingresos:.2f}")
if __name__ == "__main__": 
    main()
