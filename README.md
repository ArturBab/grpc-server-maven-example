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
4. Затем добавляем зависимости ``` dependencies ```:
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
