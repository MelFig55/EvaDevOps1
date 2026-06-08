# EvaDevOps1

# 29/03/2026
Desarrollo de los PPT entregados

# 30/03/2026

Feature fecha para trabajo en GitFlow

# Naming de ramas:
main → Es el centro del código para dar inicio a el desarrollo dentro del propio repositorio. 
develop → Se integra el código y las funcionalidades que tiene este para de forma seguida poder ejecutarlas, su desarrollo es clave. 
feature/* → Agrega nuevas funciones dentro del código para seguidamente ser ejecutadas por un PR
hotfix/* → Corrige errores y soluciona antes del merge 

Ejemplo: feature/login hotfix/fix-error

# Convenciones de commits: 
- Definir como escribir mensajes de commit:

La estructura estándar de un commit deberia de seguir este formato: 

<Tipo> [Alcance opcional]: <Desc. corta>

[Cuerpo opcional]

[Pie de pagina opcional]

Ejemplo: feature(fecha): Agregar fecha 2

# fix:
fix:error al greeting de nuevo usuario


# Flujo de merge/Gitflow:
- Nunca se uso main para crear cambios, todo llego por PR
- Nunca se debe usar main para cambios, solo llegar a main con PR, el flujo de trabajo fue mediante PRs

Estrategias de revisión
- Al no haber trabajado con codigo mas alla de PR, unas config pequeñas al README, no hemos tenido la oportunidad de revisar detalladamente, pero ambos tenemos la experiencia anterior de haber revisado codigo antes de aceptar una PR y hacerle merge.



# 02/06/26

Creacion e integracion de Docker en conjunto con actions

- Se comprendio la creacion de un repositorio y el como este se conecta e interactua junto con Docker, junto con esto las configuraciones dentro de este para que pueda funcionar de manera correcta teniendo en cuenta los CI/CD solicitados dentro de la rubrica, se comprendio el uso y la creacion e importancia de los mismos y el como se integran dentro de los microservicios dentro de nuestros proyectos.

