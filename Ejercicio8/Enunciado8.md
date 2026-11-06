## Enunciado para los alumnos:
Tomando como referencia el flujo de datos desde la memoria RAM hasta el archivo en disco, desarrolla un programa en Java que cree un fichero de texto llamado "materias.txt". El programa debe realizar las siguientes acciones:

1. Configurar un flujo de salida utilizando un objeto BufferedWriter enlazado con un FileWriter.
2. Escribir un listado de cinco asignaturas de tu elección en el archivo.
3. Emplear el método portable newLine() para asegurar que cada asignatura quede guardada estrictamente en una línea independiente.
4. Liberar los recursos de forma correcta invocando el método de cierre (close()) y controlar cualquier error potencial de escritura mediante una excepción de tipo IOException.
5. Verificación: Comprueba físicamente en la carpeta de tu proyecto que el archivo se generó correctamente y que mantiene una única asignatura por línea.
