import org.gradle.api.Plugin
import org.gradle.api.Project

class EventuateDependencyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.dependencies {
            if (project.hasProperty("eventuateLocal"))
                compile "io.eventuate.local.java:eventuate-local-java-jdbc:${project.eventuateLocalVersion}"
            else
                compile "io.eventuate.client.java:eventuate-client-java-http-stomp-spring:${project.eventuateClientVersion}"
        }
    }
}
