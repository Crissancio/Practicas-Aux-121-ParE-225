#Ejercicio 13. El restaurante “Ratatouille” organiza a su personal mediante la siguiente estructura
class Empleado:
    def __init__(self,nombre,sueldomes):
        self.nombre=nombre
        self.sueldomes=sueldomes
    def __str__(self):
        return "Nombre: {} | Sueldo al mes: {}".format(self.nombre,self.sueldomes)
class Administrativo(Empleado):
    def __init__(self, nombre,sueldomes,cargo):
        super().__init__(nombre,sueldomes)
        self.cargo=cargo
    #c) Sobrecargar el método SueldoTotal para mostrar el sueldo total, sumándole las
#horas extra, considerando el sueldo por hora y la propina en caso de los meseros.
    def sueldoTotal(self):
        return self.sueldomes
			
class Chef(Empleado):
    def __init__(self, nombre,sueldomes,horaExtra,tipo,sueldoHora):
        super().__init__(nombre,sueldomes)
        self.horaExtra=horaExtra
        self.sueldoHora=sueldoHora
        self.tipo=tipo
    def sueldoTotal(self):
        return self.sueldomes+self.sueldoHora*self.horaExtra
	
class Mesero(Empleado):
    def __init__(self, nombre,sueldomes,propina,horaExtra,sueldoHora):
        super().__init__(nombre,sueldomes)
        self.horaExtra=horaExtra
        self.sueldoHora=sueldoHora
        self.propina=propina
    def sueldoTotal(self):
        return self.sueldomes+self.sueldoHora*self.horaExtra+self.propina
#a) Instanciar 1 Chef, 2 Meseros y 2 Administrativos.		
empleado1=Chef("Carlos Mamani", 4500, 10, "Gourmet", 60)
empleado2=Mesero("Juan Choque", 2800, 200, 5, 30)
empleado3=Mesero("Pedro Quispe", 3000, 350, 8, 35)
empleado4=Administrativo("María Laura Condori", 3500, "Gerente de cocina")
empleado5=Administrativo("Lucía Flores", 3000, "Contadora")

empleados = [empleado1, empleado2, empleado3, empleado4, empleado5]
#b) Mostrar a aquellos Empleados que tengan sueldomes igual a X.
x=float(input(": " ))
for e in empleados:
	if x==e.sueldomes:
		print (e)
for e in empleados:
	print(e.nombre," tiene un sueldo total de",e.sueldoTotal())
