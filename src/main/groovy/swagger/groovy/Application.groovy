package swagger.groovy

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
    info = @Info(
            title = "swagger-groovy",
            version = "0.0"
    )
)
@CompileStatic
class Application {
    static void main(String[] args) {
        Micronaut.run(Application)
    }
}