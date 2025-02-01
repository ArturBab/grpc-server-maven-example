# Этот проект представляет собой простой сервер, использующий gRPC на Java с Maven.
---
### Инструкция, как настроить и создать простой maven-проект с gRPC.

1. В терминале указываем путь для будущего проекта, затем пишем команду:
> mvn archetype:generate -DgroupId=com.example.<em>exampleName</em> -DartifactId=<em>exampleName</em> -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
>
>> <em>exampleName</em> - это собственное название пакетов. Очев, что на английском пишем.

Запускаем и maven создаст.

2. Открываем VS Code (я использую его), экспортируем и **ДОВЕРЯЕМ (Это важнА)!!**
3. После этого, открываем файл **_pom.xml_** и в плейсхолдере ```<properties> ... </properties>``` добавляем значения для работы с gRPC:
```xml
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.release>17</maven.compiler.release>
      <!-- Добавляем это -->
    <grpc.version>1.57.0</grpc.version>
    <protobuf.version>3.24.0</protobuf.version>
  </properties>
```
4. Затем добавляем нужные нам зависимости ``` dependencies ```:
```xml
        <!-- gRPC dependencies -->
        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-netty</artifactId>
            <version>${grpc.version}</version>
        </dependency>
        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-protobuf</artifactId>
            <version>${grpc.version}</version>
        </dependency>
        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-stub</artifactId>
            <version>${grpc.version}</version>
        </dependency>
        <!-- Protobuf -->
        <dependency>
            <groupId>com.google.protobuf</groupId>
            <artifactId>protobuf-java</artifactId>
            <version>${protobuf.version}</version>
        </dependency>
        <dependency>
            <groupId>javax.annotation</groupId>
            <artifactId>javax.annotation-api</artifactId>
            <version>1.3.2</version>
        </dependency>  
    <dependency>
```
VS Code, в моем случае, будет бомбить на эту, якобы, ошибку ```${protobuf.version}```, но не парьтесь. 

5. Добавляем нужные нам плагины для компиляции proto-файлов. Там будет плейсхолдер с менеджером, но его надо убрать. А вообще проще скопировать у меня:
```xml
    <build>
        <plugins>
            <!-- Compiler plugin -->
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.10.1</version>
            </plugin>
            <!-- Protobuf plugin -->
            <plugin>
                <groupId>org.xolstice.maven.plugins</groupId>
                <artifactId>protobuf-maven-plugin</artifactId>
                <version>0.6.1</version>
                <configuration>
                    <protocArtifact>com.google.protobuf:protoc:${protobuf.version}:exe:windows-x86_64</protocArtifact>
                    <pluginId>grpc-java</pluginId>
                    <pluginArtifact>io.grpc:protoc-gen-grpc-java:${grpc.version}:exe:windows-x86_64</pluginArtifact>
                </configuration>
                <executions>
                    <execution>
                        <goals>
                            <goal>compile</goal>
                            <goal>compile-custom</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        <!-- Exec Maven Plugin -->
        <!-- Для запуска сервера с терминала -->
        <plugin>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>exec-maven-plugin</artifactId>
            <version>3.0.0</version>
            <executions>
                <execution>
                    <goals>
                        <goal>java</goal>
                    </goals>
                </execution>
            </executions>
            <configuration>
                <!-- Укажи свой главный класс с методом main -->
                <mainClass>com.example.grpc.App</mainClass>
            </configuration>
        </plugin>            
        </plugins>
    </build>
```
Кстати, учтите, что я здесь использую винду, поэтому здесь:
```xml
<configuration>
  <protocArtifact>com.google.protobuf:protoc:${protobuf.version}:exe:windows-x86_64</protocArtifact>
  <pluginId>grpc-java</pluginId>
  <pluginArtifact>io.grpc:protoc-gen-grpc-java:${grpc.version}:exe:windows-x86_64</pluginArtifact>
</configuration>
```
Это конфигурация для компиляции на винде. В маке и в линуксе она должна автоматически стоять.

6. Пишем в терминале команду ```mvn clean install```. Сборщик maven автоматически пересоздаст и установит уже нужные библиотеки и зависимости для работы.

P.S. 
Забыл сказать, что VS Code может тупеть, особенно когда нужно будет генерировать proto-файлы. Тогда лучше перед пересборкой еще в ```.vscode``` прописать такие настройки:
```json
{
  "java.configuration.updateBuildConfiguration": "interactive",
  "java.project.sourcePaths": [
    "src/main/java",
    "target/generated-sources/protobuf/java",
    "target/generated-sources/protobuf/grpc-java"
  ],
  "java.compile.nullAnalysis.mode": "automatic"
}
```

Если все скомпилировалось и установилось успешно, то я поздравляю тебя, все, что надо, установили. Django теперь может идти н***ен. И по факту.

---
