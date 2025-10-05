#Nicol Yanina Ticona Aduviri
#R.U: 1855987
class Mp4:
    def __init__(self, marca, capacidad_gb, max_canciones, max_videos):
        self.marca = marca
        self.capacidad_gb = capacidad_gb
        self.canciones = [[None] * 3 for _ in range(max_canciones)]
        self.videos = [[None] * 3 for _ in range(max_videos)]
        self.nro_canciones = 0
        self.nro_videos = 0

    # --- a) Borrar canción ---
    def borrar_cancion(self, nombre, artista):
        for i in range(self.nro_canciones):
            if (self.canciones[i][0].lower() == nombre.lower() and
                    self.canciones[i][1].lower() == artista.lower()):
                # Shift (corrimiento a la izquierda)
                for j in range(i, self.nro_canciones - 1):
                    self.canciones[j] = self.canciones[j + 1]
                self.nro_canciones -= 1
                print(f"Canción eliminada: {nombre} - {artista}")
                return
        print("La canción no fue encontrada.")

    # --- b) Agregar canción (simula sobrecarga con método) ---
    def agregar_cancion(self, nombre, artista, peso_kb):
        if self.nro_canciones < len(self.canciones) and self.espacio_disponible_mb() >= peso_kb / 1024.0:
            # Verificar que no exista
            for i in range(self.nro_canciones):
                if (self.canciones[i][0].lower() == nombre.lower() and
                        self.canciones[i][1].lower() == artista.lower()):
                    print("La canción ya existe.")
                    return
            self.canciones[self.nro_canciones] = [nombre, artista, str(peso_kb)]
            self.nro_canciones += 1
            print(f"Canción agregada: {nombre}")
        else:
            print("No hay espacio para agregar la canción.")

    # --- c) Agregar video (simula sobrecarga con otro método) ---
    def agregar_video(self, nombre, artista, peso_mb):
        if self.nro_videos < len(self.videos) and self.espacio_disponible_mb() >= peso_mb:
            # Verificar que no exista
            for i in range(self.nro_videos):
                if (self.videos[i][0].lower() == nombre.lower() and
                        self.videos[i][1].lower() == artista.lower()):
                    print("El video ya existe.")
                    return
            self.videos[self.nro_videos] = [nombre, artista, str(peso_mb)]
            self.nro_videos += 1
            print(f"Video agregado: {nombre}")
        else:
            print("No hay espacio para agregar el video.")

    # --- d) Calcular espacio disponible ---
    def espacio_disponible_mb(self):
        total_mb = self.capacidad_gb * 1024
        ocupado = 0.0

        for i in range(self.nro_canciones):
            ocupado += float(self.canciones[i][2]) / 1024.0 
        for i in range(self.nro_videos):
            ocupado += float(self.videos[i][2])
        return total_mb - ocupado

    # Mostrar contenido
    def mostrar(self):
        print(f"\nMP4 Marca: {self.marca} | Capacidad: {self.capacidad_gb} GB")
        print("Canciones:")
        for i in range(self.nro_canciones):
            print(f"- {self.canciones[i][0]} | {self.canciones[i][1]} | {self.canciones[i][2]} Kb")
        print("Videos:")
        for i in range(self.nro_videos):
            print(f"- {self.videos[i][0]} | {self.videos[i][1]} | {self.videos[i][2]} Mb")
        print(f"Espacio disponible: {self.espacio_disponible_mb():.2f} Mb")

if __name__ == "__main__":
    mp4 = Mp4("Sony", 2, 5, 3)  

    mp4.agregar_cancion("Song1", "Artista1", 2048)  
    mp4.agregar_cancion("Song2", "Artista2", 4096)  
    mp4.agregar_video("Video1", "Director1", 500)   

    mp4.mostrar()

    mp4.borrar_cancion("Song1", "Artista1")
    mp4.mostrar()
