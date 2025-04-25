# Sistema de Gestión de Torneos de eSports
## Autor
### Xavier Valverde Fernández  
[Mi perfil de Github](https://github.com/XavierValverde)
## Descripción del Proyecto
[Link al repositorio del proyecto](https://github.com/XavierValverde/torneo-esports-uml)  
Este proyecto implementa un sistema de gestión de torneos de eSports
utilizando UML para el modelado y Java para la implementación.
## Diagramas UML
### Diagrama de Casos de Uso
![Diagrama de casos de uso](diagrams/casos-uso.png)
### Diagrama de Clases
![Diagrama de clases](diagrams/clases.png)
## Estructura del Proyecto
torneo-esports-uml/   
├── src/    
│ ├── es/empresa/torneo/  
│ │ ├── modelo/  
│ │ │ ├── Equipo.java  
│ │ │ ├── Jugador.java  
│ │ │ ├── Partido.java  
│ │ │ ├── Bracket.java  
│ │ │ ├── Clasificacion.java  
│ │ │ └── Premio.java  
│ │ │  
│ │ ├── control/  
│ │ │ └── Torneo.java  
│ │ │  
│ │ ├── vista/  
│ │ │ └── Administrador.java  
│ │ ├── Main.java  
├── diagrams/  
│ ├── casos-uso.png  
│ ├── clases.png  
├── README.md  
├── .gitignore  
├── LICENSE (opcional)  

## Instalación y Ejecución
1. Clonar el repositorio:
   `git clone https://github.com/usuario/torneo-esports-uml.git`
2. Compilar y ejecutar el proyecto:
   `cd src javac es/empresa/torneo/Main.java java es.empresa.torneo.Main`
## Justificación del diseño
Se podían haber creado hasta 3 actores para este ejercicio:   
el ***Administrador***, el ***Entrenador*** del Equipo y los ***Jugadores***, pero como realmente no iban a aportar mucho al sistema(visualización del equipo y confirmación de jugadores), he decidido finalmente optar por este modelo que solo usa el administrador como usuario final, dejando una app más sencilla y limpia.


### El Administrador como usuario puede hacer las siguientes acciones:  
**Añadir Equipos**: Dentro de esta sección podemos Añadir los jugadores que componen el equipo, también podemos consultar el Equipo y los jugadores registrados.  

**Crear Torneos**: Desde aquí Inscribiremos los equipos al torneo, una vez todos los equipos estén inscritos podemos generar el Bracket(los emparejamientos) y así saber los rivales de cada Partido.  

**Registrar los Resultados**:Una vez dispustado el partido podemos registrar los resultados, con ello actualizaremos las clasificaciones del torneo y una vez finalizado se asignarán los premios a los ganadores.

## Conclusiones
Aunque no me ha dado tiempo a hacer el ciclo completo de programación (me faltan los test) debido a la falta de tiempo he podido experimentar la creación de una app de principio a *casi* fin.  
Para poder representar el diseño de la app con diagramas UML primero he tenido que identificar quien eran los actores, las acciones que realizaban y como se relacionaban con el sistema. Este paso me ha ayudado a identificar que partes de la aplicación debía dar prioridad, cuales abandonar y como estructurarla, aunque he tenido que repetir el proceso varias veces para pooder verlo con claridad, creo que el resultado ha sido óptimo para la resolución de este ejercicio.  
También he aprendido a dibujar diagramas UML, definiendo las relaciones, las clases, los atributos y métodos.    

La organización del código en paquetes me ha ayudado a estructurar bien el proyecto, pero he tenido problemas con la estructura a la hora de crearla en IntelliJ ya que aún no estoy acostumbrado a usar este IDE, entendía los paquetes como directorios pero al final lo pude arreglar.  

Como conclusión final hubiese preferido tener más tiempo para poder desarrollar mejor esta actividad, siento que me ha faltado tiempo y aún no comprendo del todo los diagramas UML, pero en general estoy bastante satisfecho con el resultado.