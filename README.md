\# 🧠 Evaluación Sumativa 2 – Llanquihue Tour App V1



\## 👤 Autor del proyecto

\* Nombre completo: Braulio Meriño Valdivia

\* Carrera: Desarrollo de Aplicaciones

\* Sede: Campus Online



\---



📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación Sumativa 2 de la asignatura \*Desarrollo Orientado a Objetos I\*. Se trata de un sistema de gestión orientado a objetos en lenguaje JAVA, 

el objetivo es modelar, administrar y filtrar los registros de usuarios y colaboradores de la empresa \*\*Llanquihue Tour\*\*.



La aplicación tiene como enfoque poder aplicar de forma práctica los pilares de la programación orientada a objetos (POO)

\---



\## 🧱 Estructura general del proyecto

El código fuente se encuentra organizado de manera modular bajo el paquete raíz `com.LlanquihueTourApp1` cumpliendo con los estándares de arquitectura limpia:



📁 src/main/java/com/LlanquihueTourApp1/

├── app/         # Clase Principal (Main.java) el cual gestiona el ciclo de vida y el menú por consola.

├── data/        # Capa de persistencia. Contiene 'LectorArchivo.java' para el procesamiento del CSV.

├── model/       # Clases (Persona, Colaborador, Rut, Correo, Direccion).

├── service/     # Servicios del sistema (ColaboradorService.java) es la clase encargada de la lógica de filtros.

└── util/        # Utilidades del sistema. Aloja las excepciones personalizadas (rutInvalidoException, correoInvalidoException).



⚙️ Instrucciones para clonar y ejecutar el proyecto

&#x09;1.- Crea una carpeta vacía con un nombre para identificar el proyecto 

&#x09;    - Haz clic derecho dentro de la carpeta, pulsa el botón 'Abrir en terminal'.

&#x09;

&#x09;2.- En la terminal escribe: git clone https://github.com/BraulioVevo/LlanquihueTourApp.1.git y pulsa **Enter**

&#x09;    - Una vez que se haya clonado el proyecto. 

&#x09;

&#x09;3.- Haz clic derecho en la carpeta donde esta clonado el proyecto y escribe lo siguiente:

&#x09;    - **java -jar .\\target\\LlanquihueTourApp1-1.0-SNAPSHOT.jar**	

&#x09;    - pulsa **Enter** y se desplegaran las opciones a utilizar.

&#x09;

&#x09;4.- Ingresa un numero para navegar las diferentes opciones. 



&#x09;5.- Para 'Apagar' la app, pulsa 5 y luego Enter. O cierra la terminal.





