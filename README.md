# Integrador 2019-12-13

## Entrega

La solución y entrega de este examen se va a realizar en el repositorio asignado por los profesores.

Se deben subir los cambios en un branch llamado `solucion` y se debe crear el pull request correspondiente en Github.

El código debe compilar y debe tener test unitarios que verifiquen la funcionalidad desarrollada.

### Creación del branch

El siguiente comando nos crea el nuevo branch y luego nos deja ya parados en el mismo

```console
  git checkout -b solucion
```

### Subida de los cambios

Primero hay que hacer commit en el repositorio local
```console
  git commit -m"mensaje del commit"
```

La primera vez que subimos los cambios, se crea el branch en el repositorio remoto, para eso hay que ejecutar el siguiente comando:

```console
  git push -u origin solucion
```

Luego si es necesario subir nuevos commits, ejecutamos:

```console
  git push
```

### Crear Pull Request

Siempre que comiteamos sobre un branch, github nos ofrece crear un pull request.
También podemos crearlo usando el botón `New pull request`.


### Condiciones de aprobación
* Ejercicio 1 - 4  puntos
* Ejercicio 2 - 2  puntos
* Ejercicio 3 - 2  puntos
* Ejercicio 4 - 2  puntos


### ENUNCIADOS


## Ejercicio 1 - Desarrollo
Necesitamos desarrollar el sistema para una _máquina de snacks_ que por el momento ofrece 2 tipos de snacks diferentes pero ya nos anticiparon que pronto van a agregar más variedad. 
Tener en cuenta que cada snack tiene un valor diferente y el stock de cada uno se maneja por separado

## Ejercicio 2 - 
Están por lanzar al mercado una aplicación __matencio__ que enseña cómo preparar mate. La versión que nos facilitaron es una versión beta del producto. Tenemos que mejorarla para publicarla cuanto antes. 
     
## Ejercicio 3 - 


## Ejercicio 4 - 
Una conocida fábrica de autos quiere actualizar su sistema para poder agregarle accesorios a las unidades que vende de forma más dinámica de como lo hace hoy en día. 
¿Qué cambios harías?

