from persona import Cliente, Jefe

def main():
    cliente = Cliente("Juan", "Pérez", "12345678", "C001", "CL001")
    jefe = Jefe("Laura", "González", "87654321", "Sucursal Centro", "General")

    cliente.mostrar_info()
    cliente.method("Consulta")
    print() 

    jefe.mostrar_info()
    jefe.method("Administración")

if __name__ == "__main__":
    main()
