class MP4:
    def __init__(self, marca="Desconocida", capacidadGb=10.0):
        self.marca = marca
        self.capacidadGb = capacidadGb
        self.canciones = []  
        self.videos = []     

    def capacidad_disponible(self):
        total_usado_mb = 0
        for c in self.canciones:
            total_usado_mb += float(c[2])
        for v in self.videos:
            total_usado_mb += float(v[2])
        capacidad_total_mb = self.capacidadGb * 1024
        disponible_mb = capacidad_total_mb - total_usado_mb
        return max(disponible_mb, 0)

    def borrar_cancion(self, nombre=None, artista=None, peso=None):
 
        if nombre and not artista and not peso:
            self.canciones = [c for c in self.canciones if c[0].lower() != nombre.lower()]
        elif artista and not nombre and not peso:
            self.canciones = [c for c in self.canciones if c[1].lower() != artista.lower()]
        elif nombre and peso:
            self.canciones = [c for c in self.canciones if not (c[0].lower() == nombre.lower() and float(c[2]) == float(peso))]
        else:
            print("Parámetros inválidos para eliminar canción.")

    def __add__(self, cancion):
        nombre, artista, peso = cancion
 
        for c in self.canciones:
            if c[0].lower() == nombre.lower() and c[1].lower() == artista.lower():
                print(f" La canción '{nombre}' de '{artista}' ya existe.")
                return self
        if self.capacidad_disponible() >= float(peso):
            self.canciones.append([nombre, artista, peso])
            print(f"Canción '{nombre}' agregada correctamente.")
        else:
            print("No hay suficiente espacio para agregar.")
        return self

    def __sub__(self, video):
     
        nombre, duracion, peso = video
        for v in self.videos:
            if v[0].lower() == nombre.lower():
                print(f"El video '{nombre}' ya existe.")
                return self
        if self.capacidad_disponible() >= float(peso):
            self.videos.append([nombre, duracion, peso])
            print(f"Video '{nombre}' agregado correctamente.")
        else:
            print(" No hay suficiente espacio para agregar el video.")
        return self

    def mostrar(self):
        print(f"\n MP4 Marca: {self.marca}")
        print(f"Capacidad total: {self.capacidadGb} GB")
        print(f"Capacidad disponible: {self.capacidad_disponible() / 1024:.2f} GB")
        print(f"Nro canciones: {len(self.canciones)} | Nro videos: {len(self.videos)}")
        print("Canciones:")
        for c in self.canciones:
            print(f"   - {c[0]} ({c[1]}) - {c[2]} MB")
        print("Videos:")
        for v in self.videos:
            print(f"   - {v[0]} ({v[1]}) - {v[2]} MB")
if __name__ == "__main__":
    mp4 = MP4("Sony", 2)  

    mp4 + ("Running up that hill", "Kate Bush", 10)
    mp4 + ("Ma Chérie", "Malice Mizer", 15)
    mp4 + ("CloudBusting", "Kate Bush", 10)  

    mp4 - ("Video1", "Bucktick", 500)
    mp4 - ("Video2", "Sid", 600)
    mp4 - ("Video1", "Wayv", 500)  

    mp4.borrar_cancion(nombre="Darling")
    mp4.borrar_cancion(artista="Shinee")
    mp4.borrar_cancion(peso=200)

    mp4.mostrar()
