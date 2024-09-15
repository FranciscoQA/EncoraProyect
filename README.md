Automation Web - Encora
Este documento proporciona instrucciones sobre cómo ejecutar el proyecto de automatización web.

Prerequisitos
Antes de ejecutar el proyecto, asegúrate de tener instalados los siguientes elementos:

Java JDK (versión 8 o superior)
Maven
IDE (IntelliJ IDEA, Eclipse, etc.)
Configuración del Entorno
Configurar Java y Maven: Asegúrate de que las variables de entorno JAVA_HOME y M2_HOME estén configuradas correctamente.

Descargar ChromeDriver: Descarga la versión adecuada de ChromeDriver para tu navegador desde aquí y colócalo en la siguiente ubicación.


Ejecución del Proyecto
1. Clonar el Repositorio
Si aún no lo has hecho, clona el repositorio del proyecto:

git clone https://github.com/FranciscoQA/EncoraProyect
cd tu-repositorio
Instalación de Dependencias
Si es la primera vez que ejecutas el proyecto, asegúrate de que todas las dependencias están instaladas. Ejecuta el siguiente comando en la raíz del proyecto:

mvn install
Ejecución
La clase RunnerTest está configurada correctamente para que ejecute el test con el tag @RegistrarUsuario. A continuación se muestra un ejemplo de cómo luce:

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"json:target/build/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"com.encora.web.stepdefinition"},
        tags = "@EnrolamientoParaBankCreateNewLogin"
)
public class RunnerTest extends BaseTest {

    @Page
    private BaseTest paraBankPage;

    @AfterScenario
    public void tearDown() {
        if (paraBankPage.getDriver() != null) {
            paraBankPage.getDriver().quit();
        }

    }

La clase RunnerTest se ubica en la siguiente ruta: src/test/java/com/encora/Runner/RunnerTest.java

El feature se ubica en la siguiente ruta: src/test/resources/features/Register.feature
