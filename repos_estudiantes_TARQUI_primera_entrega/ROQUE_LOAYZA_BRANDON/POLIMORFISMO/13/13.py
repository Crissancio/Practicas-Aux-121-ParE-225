
class MP4:
    def __init__(self):
        self.canciones = []
        self.videos = []

    def borrarCancion(self, nombre=None, artista=None, peso=None):
        if nombre and artista and peso:
            self.canciones = [c for c in self.canciones if not (c["nombre"]==nombre and c["artista"]==artista and c["peso"]==peso)]
        elif nombre:
            self.canciones = [c for c in self.canciones if c["nombre"]!=nombre]
        elif artista:
            self.canciones = [c for c in self.canciones if c["artista"]!=artista]

    def __add__(self, cancion):
        existe = any(c["nombre"]==cancion["nombre"] for c in self.canciones)
        if not existe and len(self.canciones)<100:
            self.canciones.append(cancion)
        return self

    def __sub__(self, video):
        existe = any(v["nombre"]==video["nombre"] for v in self.videos)
        if not existe and len(self.videos)<100:
            self.videos.append(video)
        return self

    def capacidad(self):
        pesoCanc = sum(c["peso"] for c in self.canciones)
        pesoVid = sum(v["peso"] for v in self.videos)
        print("Capacidad usada:", pesoCanc + pesoVid)


m = MP4()
m + {"nombre":"Back To Black","artista":"Amy","peso":100}
m + {"nombre":"Lost On You","artista":"LP","peso":150}
m - {"nombre":"Heathens","artista":"21 Pilots","peso":50}
m.capacidad()
m.borrarCancion(nombre="Back To Black")
m.capacidad()
