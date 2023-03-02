# CVDS - LABORATORIO 4 - HANGMAN

**Integrantes:** Angie Natalia Mojica - Daniel Antonio Santanilla

## Desarrollo Dirigido por Pruebas + DIP + DI + Contenedores Livianos

---

### Parte I

1. Clonar el proyecto.

   Se clona el proyecto desde la consola `git clone <url_proyect>`.

2. A partir del código existente, implemente sólo los cascarones del modelo. <a id="cascarones"></a>

   ![model.png](./img/model.png)

3. Haga la especificación de los métodos calculateScore, a partir de las especificaciones:

   * OriginalScore:
      * Es el esquema actual, se inicia con 100 puntos.
      * No se bonifican las letras correctas.
      * Se penaliza con 10 puntos con cada letra incorrecta.
      * El puntaje minimo es 0.

   * BonusScore:
      * El juego inicia en 0 puntos.
      * Se bonifica con 10 puntos cada letra correcta.
      * Se penaliza con 5 puntos cada letra incorrecta.
      * El puntaje mínimo es 0

   * PowerBonusScore:
      * El juego inicia en 0 puntos.
      * La $i-ésima$ letra correcta se bonifica con $5^i$.
      * Se penaliza con 8 puntos cada letra incorrecta.
      * El puntaje mínimo es 0
      * Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.

4. Haga commit de lo realizado hasta ahora. Desde la terminal:

   Desde la consola

   ```bash
   git add .
   git commit -m "Especificación de métodos"
   ```

5. Actualice el archivo `pom.xml` e incluya las dependencias para la ultima versión de JUnit y la versión del compilador de Java a la versión 8 .

   Se añaden las dependencias JUnit y la version del compilador 8.

   ```xml
   
   ```

6. Teniendo en cuenta dichas especificaciones, en la clase donde se implementarán las pruebas (GameScoreTest), en los comentarios iniciales, especifique las clases de equivalencia para las tres variantes de GameScore, e identifique condiciones de frontera.

   Se comentan las clases de equivalencia para las variantes de GameScore

7. Para cada clase de equivalencia y condición de frontera, implemente una prueba utilizando JUnit.

    Se crean los primeros test con las clases de equivalencia en `model/GameScoreTest.java`.

8. Haga commit de lo realizado hasta ahora. Desde la terminal:

   ```bash
   git add .
   git commit -m "Implementación de pruebas"
   ```

9. Realice la implementación de los 'cascarones' realizados anteriormente. Asegúrese que todas las pruebas unitarias creadas en los puntos anteriores se ejecutan satisfactoriamente.

   Se crea la lógica de los cascarones presentados: [Ir ->](#cascarones)

10. Al finalizar haga un nuevo commit:

    ```bash
    git add .
    git commit -m "Implementación del modelo"
    ```

11. Para sincronizar el avance en el respositorio y NO PERDER el trabajo, use el comando de GIT para enviar los cambios:

    ```bash
    git push <URL_Repositorio>
    ```

### Parte II

Actualmente se utiliza el patrón FactoryMethod que desacopla la creación de los objetos para diseñar un juego de ahorcado (revisar createGUIUsingFactoryMethod en SwingProject, el constructor de la clase GUI y HangmanFactoryMethod).

En este taller se va a utilizar un contenedor liviano ([GoogleGuice](https://github.com/google/guice)) el cual soporta la inyección de las dependencias.

1. Utilizando el HangmanFactoryMethod (MétodoFabrica) incluya el OriginalScore a la configuración.

   Se añade OiginalScore a la configuracion de HangmanFactory

Incorpore el Contenedor Liviano Guice dentro del proyecto:

* Revise las dependencias necesarias en el `pom.xml`.

  Se asoscian nuevas dependencias en el `pom.xml`

  ```xml
  
  ```

* Modifique la inyección de dependencias utilizando guice en lugar del método fábrica.

  Modificando la inyección de dependencias para utilizar guice en HangmanFactory.

* Configure la aplicación de manera que desde el programa SwingProject NO SE CONSTRUYA el Score directamente, sino a través de Guice asi mismo como las otras dependencias que se están inyectando mediante la fabrica.

  Realizando inyección de dependencias en el proyecto.

* Mediante la configuración de la Inyección de
  Dependencias se pueda cambiar el comportamiento del mismo, por
  ejemplo:
  * Utilizar el esquema OriginalScore.
  * Utilizar el esquema BonusScore.
  * Utilizar el idioma francés.
  * Utilizar el diccionario francés.

### Referencias

Referencia de guía de laboratorio: [Laboratorio](https://github.com/An6ie02/CVDS_LAB04/blob/master/README.md)\
Referencia de guía guice [Guice Reference](https://github.com/PDSW-ECI/LightweighContainers_DepenendecyInjectionIntro-WordProcessor).
