CLASE 01 MIÉRCOLES 14 DE AGOSTO DEL 2024 - Portafolio 1
USO DE GITHUB Parte 1

GitHub es una plataforma que nos permite guardar repositorios de Git que podemos usar como servidores remotos y ejecutar algunos comandos de forma visual e interactiva (sin necesidad de la consola de comandos).

Luego de crear nuestra cuenta, podemos crear o importar repositorios, crear organizaciones y proyectos de trabajo, descubrir repositorios de otras personas, contribuir a esos proyectos, dar estrellas y muchas otras cosas.

- - - - - COMANDOS - - - - -

Import repository, New repository, New organization: #significa que es como tu empresa, New project: significa es como un grupo de repositorios que puedes tener dentro de una empresa, New gist: es un pedasito de código que puedes compartir

New repository #Ponemos el nombre: class-git, descripción: Haremos un blog increible, hay muchas licencias para publicar el código: NO lo hacemos ahora.

Create repository #Lo ponemos en privado o en Publico.
El README.md es el archivo que veremos por defecto al entrar a un repositorio. Es una muy buena práctica configurarlo para describir el proyecto, los requerimientos y las instrucciones que debemos seguir para contribuir correctamente.

Para clonar un repositorio desde GitHub (o cualquier otro servidor remoto) debemos copiar la URL (por ahora, usando HTTPS) y ejecutar el comando git clone + la URL que acabamos de copiar. Esto descargará la versión de nuestro proyecto que se encuentra en GitHub.

ATENCIÓN: ¿Por qué? Porque a través de https nos pedirá usuario(nombre perfil) y contraseña. Sin embargo, esto solo funciona para las personas que quieren empezar a contribuir en el proyecto.

Cómo conectar un repositorio de GitHub a nuestro documento local Si queremos conectar el repositorio de GitHub con nuestro repositorio local, que creamos aconsejo que al trabajar desde GitHub no utilizemos localmente el comando git init, si debemos ejecutar las siguientes instrucciones:

## Guardar la URL del repositorio de GitHub con el nombre de origin

$ git remote add origin URL

## Verificar que la URL se haya guardado correctamente:

$ git remote

$ git remote -v

## Traer la versión del repositorio remoto y hacer merge para crear un commit con los archivos de ambas partes. 

#Podemos usar git fetch y git merge o solo git pull con el flag 

$ git pull --allow-unrelated-histories:

$ git pull origin master --allow-unrelated-histories

# Por último, ahora sí podemos hacer git push para guardar los cambios de nuestro repositorio local en GitHub:

$ git push origin master
Cómo autenticarte en GitHub 2022

Antes de empezar debemos renombrar la rama ‘máster’ a ‘main’, este es el nuevo estándar en GitHub, para esto:

Primero nos posicionamos en la rama a la que queremos cambiarle el nombre.

Ejecutamos el siguiente comando:

$ git branch -M main
Pasos para crear un token de acceso personal.

Inicia sesión en GitHub:

Ve a GitHub e inicia sesión con tu cuenta. Accede a la configuración de tu cuenta: Haz clic en tu avatar en la esquina superior derecha de la página y selecciona "Settings" (Configuración).

Ve a la sección de desarrolladores:

En el menú de la izquierda, desplázate hacia abajo y selecciona "Developer settings" (Configuración de desarrollador).

Crea un nuevo token:

En la sección de "Personal access tokens", selecciona "Tokens classic" y luego haz clic en "Generate new token" (Generar nuevo token).

Configura el token:

Asigna un nombre descriptivo al token para recordar su propósito. Selecciona la duración del token (por ejemplo, 30 días, 60 días, etc.) o déjalo sin fecha de expiración. Selecciona los permisos necesarios para el token, dependiendo de lo que necesites hacer (repositorios, notificaciones, paquetes, etc.).

Genera y guarda el token:

Haz clic en "Generate token" (Generar token). Importante: Copia y guarda el token en un lugar seguro, ya que no podrás verlo nuevamente una vez que cierres esta ventana.

Usa el token:

Puedes utilizar este token en lugar de tu contraseña al autenticarte en GitHub desde la línea de comandos o herramientas que requieran acceso a tu cuenta de GitHub.

Desde el 2022 GitHub ya no deja hacer el push con la contraseña del propio GitHub, para esto tenemos que crear un token, y este token es la contraseña que vamos a colocar cuando nos pida clave.



CLASE 02 MIÉRCOLES 21 DE AGOSTO DEL 2024 - Portafolio 2
Vamos a cargar la llave SSH publica en GitHub

Para copiar la llave publica debes ir al archivo .ssh y allí encontrarás el archivo .pub lo podes abrir con el txt, luego copiar el contenido que esta dentro.

1- copiar la llave publica. Ir a GitHub, vamos a setting, vamos a SSH and GPG keys
2- crear una nueva #New SSH key poner nombre y pegar la ssh publica, con esto esta listo.
Aconsejo que la ssh tenga el nombre del ordenador en el que estas trabajando. Esto se debe hacer con cada pc nueva o dispositivo nuevo que tengamos para acceder a nuestra cuenta de GitHub.

git branch #Vemos en que rama estamos

git checkout master #Ponernos en la rama master

git branch -M main #Cambiamos el nombre a la rama master

git remote add origin git@github.com:nombreUsuario/class-git.git #Agregamos el repositorio remoto, este es un ejemplo

git remote -v #Vemos si ya esta conectado

git merge segunda #Mergeamos lo que tenemos en la rama segunda en main

git commit -am "Uso de GitHub parte 20" #Hacemos el commit de hoy

git push origin main #Pasamos todo lo hecho a GitHub, revisar en el repositorio en GitHub.
Frente al cambio de nombre de rama master a main, suele suceder que en el repo de GitHub se hayan creado dos ramas, la rama master y la rama main, se debe ir al repo, settings y ahí se puede cambiar la rama principal, en vez de que siga siendo master, que sea la rama main, luego de eso ya podemos borrar la rama master.


CLASE 03 MIÉRCOLES 28 DE AGOSTO DEL 2024 - Portafolio 3
Cambios en GitHub: de master a main
El escritor Argentino Julio Cortázar afirma que las palabras tienen color y peso. Por otro lado, los sinónimos existen por definición, pero no expresan lo mismo. Feo no es lo mismo que desagradable, ni aromático es lo mismo que oloroso. Por lo anterior, podemos afirmar que los sinónimos no expresan lo mismo, no tienen el mismo “color” ni el mismo “peso”.

Sí, esta lectura es parte de la enseñanza profesional de Git & GitHub.

Desde el 1 de octubre de 2020 GitHub cambió el nombre de la rama principal: ya no es “master” -como aprenderás aquí- sino main.

Este derivado de una profunda reflexión ocasionada por el movimiento #BlackLivesMatter.

La industria de la tecnología lleva muchos años usando términos como master, slave, blacklist o whitelist y esperamos pronto puedan ir desapareciendo.

Y sí, las palabras importan.

Por lo que de aquí en adelante cada vez que me escuches mencionar “master” debes saber que hago referencia a “main”.

¿Cuando es que sigue siendo "master" y cuando sigue siendo "main"?

Cuando se crea un repositorio desde git bash en nuestro ordenador a través de git init, sigue siendo el estandar como master. ¿Qué hacer con esto? Debes cambiar el nombre de la rama master a main con el comando "git branch -M main". Ahora cuando creamos un repositorio desde la nube, osea desde GitHub, ya verás que la rama principal tiene por default el nombre de "main" y al clonar a nuestro ordenador seguira teniendo este nombre y no será necesario ningun cambio.
