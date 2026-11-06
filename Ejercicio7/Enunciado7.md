## Enunciado para los alumnos:
Basándote en los conceptos de rutas y abstracción de la sesión, escribe un programa en Java que utilice la clase File (perteneciente al paquete java.io) para interactuar con la ruta "datos/prueba.txt". Tu solución debe cumplir estrictamente con lo siguiente:

1. Comprobación previa: Utiliza el método adecuado (exists()) para verificar si la ruta apunta a un recurso disponible en el disco.
2. Creación controlada: Si el recurso no existe, intenta crearlo mediante el método correspondiente (createNewFile()). Como esta operación puede producir un error de E/S, debes gestionarlo obligatoriamente manejando la excepción IOException (mediante un bloque try-catch).
3. Extracción de información: Tanto si el archivo ya existía como si se acaba de crear, utiliza los métodos de consulta para mostrar por consola el último nombre de la ruta (getName()) y la ruta completa o relativa con la que se construyó el objeto (getPath()).
