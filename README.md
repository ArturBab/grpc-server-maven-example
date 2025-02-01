# Этот проект представляет собой простой сервер, использующий gRPC на Java с Maven.
---
### Инструкция, как настроить и создать простой maven-проект с gRPC.

1. В терминале указываем путь для будущего проекта, затем пишем команду:
> mvn archetype:generate -DgroupId=com.example.<em>exampleName</em> -DartifactId=<em>exampleName</em> -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
>
>> <em>exampleName</em> - это собственное название пакетов. Очев, что на английском пишем.

Запускаем и maven создаст.

2. Открываем VS Code (я использую его), экспортируем и **ДОВЕРЯЕМ (Это важнА)!!**
3. После этого, открываем файл **_pom.xml_** и в плейсхолдере **__<properties> ... </properties>__** добавляем эти значения:
 > <grpc.version>1.57.0</grpc.version>
 <protobuf.version>3.24.0</protobuf.version>   
