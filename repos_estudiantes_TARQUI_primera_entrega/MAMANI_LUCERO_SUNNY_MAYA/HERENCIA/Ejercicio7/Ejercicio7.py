#Ejercicio 7. Define las clases:
class Persona:
    def __init__(self,nombre,paterno,materno,edad):
        self._nombre=nombre
        self._paterno=paterno
        self._materno=materno
        self._edad=edad
    def getEdad(self):
        return self._edad
    def getNombre(self):
        return self._nombre
    def getPaterno(self):
        return self._paterno
    def getMaterno(self):
        return self._materno
    #b) Implementar el método mostrar() en las 3 clases.
    def mostrar(self):
        print("Nombre: {} {} {} | Edad: {} ".format(self.getNombre(),self.getPaterno(),self.getMaterno(),self. getEdad()))
class Docente(Persona):
    def __init__(self,nombre,paterno,materno,edad,sueldo,regProfesional):
        super().__init__(nombre,paterno,materno,edad)
        self.__sueldo=sueldo
        self.__regProfesional=regProfesional
    def mostra(self):
        super().mostrar()
        print("Sueldo: {} | Registro Profesional: {}".format(self.__sueldo,self.__regProfesional))
class Estudiante(Persona):
    def __init__(self,nombre,paterno,materno,edad,ru,matricula):
        super().__init__(nombre,paterno,materno,edad)
        self.__ru=ru
        self.__matricula=matricula
    def mostrar(self):
        super().mostrar()
        print("RU: {} | Matricula: {}".format(self.__ru,self.__matricula))
    #c) Agregar el método promedio() que devuelva el promedio de la edad de los esdiantes.
    def promedio(estudiantes):
        suma=0
        for i in range(len(estudiantes)):
            suma+=estudiantes[i].getEdad()
        return suma / len(estudiantes)
    #d) Implementar el método modificarEdad() para el estudiante.
    def modificarEdad(self,x):
        self._edad=x
    #e) Verificar si uno de los estudiantes tiene la misma edad que el docente.
    def verificar(estudiantes,x:Docente):
        for i in range(len(estudiantes)):
            if estudiantes[i].getEdad()==x.getEdad():
                print("El estudiante: {} {} {} tiene la misma edad que el docente {} {} {}".format(estudiantes[i].getNombre(),estudiantes[i].getPaterno(),estudiantes[i].getMaterno(),x.getNombre(),x.getPaterno(),x.getMaterno()))
                break
        else:
            print("ninguno coincide")
#a) Instanciar a dos estudiantes.y un docente.
e1 = Estudiante("Ana", "Lopez", "Diaz", 35, "RU123", "2025A")
e2 = Estudiante("Carlos", "Mamani", "Flores", 22, "RU124", "2025B")
Estudiantes=[e1,e2]
d2 = Docente("María","Fernández","García",35,6200,"DOC-67890")
e1.mostrar()
e2.mostrar()
d2.mostrar()
print(Estudiante.promedio(Estudiantes))
Estudiante.verificar(Estudiantes,d2)
e1.modificarEdad(20)
Estudiante.verificar(Estudiantes,d2)
