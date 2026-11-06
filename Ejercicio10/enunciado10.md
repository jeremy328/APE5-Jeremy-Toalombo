## Enunciado para los alumnos:
Diseña un script completo en Java que emule el recorrido guiado de gestión de ficheros visto en clase:

1. Construye un objeto File que represente la ruta "datos/temporal.txt".
2. Consulta el estado del archivo mediante exists() y, si no se encuentra disponible, créalo de forma segura controlando la excepción IOException.
3. Implementa una fase de validación en la que declares una variable de control booleana (por ejemplo, boolean confirmarBorrado = true;) para simular la solicitud de confirmación por parte del usuario antes de eliminar datos importantes.
4. Utiliza el método delete() exclusivamente si dicha confirmación es verdadera, imprimiendo por consola un mensaje que refleje el resultado booleano de la operación de eliminación.
