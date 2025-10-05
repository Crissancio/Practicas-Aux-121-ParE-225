from cliente import Cliente
from jefe import Jefe

c1 = Cliente("jhon", "llanque", "987654", "N001", "C44")
j1 = Jefe("nilda", "torres", "151661", "Sucursal la paz", "General")

print(c1.mostrar_datos())
print(j1.mostrar_datos())