class MP4:
    def __init__(self, marca: str, capacidadGb: float):
        self.marca = marca
        self.capacidadGb = capacidadGb
        self.canciones = []  
        self.videos = [] 
    
    def __add__(self, cancion: list):
        nombre, artista, peso = cancion
        for c in self.canciones:
            if c[0] == nombre and c[1] == artista:
                print(f"La canción '{nombre}' ya existe.")
                return self

        if self.capacidadDisponible() >= peso / 1024:  
            self.canciones.append([nombre, artista, peso])
            print(f" Canción '{nombre}' añadida.")
        else:
            print(" No hay suficiente espacio para la canción.")
        return self

    def __sub__(self, video: list):
        nombre, artista, peso = video
        for v in self.videos:
            if v[0] == nombre and v[1] == artista:
                print(f"El video '{nombre}' ya existe.")
                return self

        if self.capacidadDisponible() >= peso:
            self.videos.append([nombre, artista, peso])
            print(f" Video '{nombre}' añadido.")
        else:
            print(" No hay suficiente espacio para el video.")
        return self

    def capacidadDisponible(self):
        total_usado_mb = 0
        for c in self.canciones:
            total_usado_mb += c[2] / 1024 
        for v in self.videos:
            total_usado_mb += v[2]    
        return self.capacidadGb * 1024 - total_usado_mb  

    def mostrarContenido(self):
        print(f"\nMP4 Marca: {self.marca}")
        print(f"Capacidad total: {self.capacidadGb} GB")
        print(f"Capacidad disponible: {self.capacidadDisponible():.2f} MB")

        print("\n Canciones:")
        for c in self.canciones:
            print(f"  - {c[0]} | {c[1]} | {c[2]} KB")

        print("\n Videos:")
        for v in self.videos:
            print(f"  - {v[0]} | {v[1]} | {v[2]} MB")

    def borrarCancion(self, nombre=None, artista=None, peso=None):
        originales = len(self.canciones)
        nuevas = []

        for c in self.canciones:
            if nombre and artista and peso is not None:
                if c[0] == nombre and c[1] == artista and c[2] == peso:
                    continue
            elif nombre and artista:
                if c[0] == nombre and c[1] == artista:
                    continue
            elif nombre:
                if c[0] == nombre:
                    continue
            elif artista:
                if c[1] == artista:
                    continue
            nuevas.append(c)

        eliminadas = originales - len(nuevas)
        self.canciones = nuevas
        print(f" Canciones eliminadas: {eliminadas}")
