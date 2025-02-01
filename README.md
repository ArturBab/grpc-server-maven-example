# Этот проект представляет собой простой сервер, использующий gRPC на Java с Maven.
---
### Инструкция, как настроить и создать простой maven-проект с gRPC.

1. В терминале указываем путь для будущего проекта, затем пишем команду:
> mvn archetype:generate -DgroupId=com.example.<em>####exampleName</em> -DartifactId=<em>exampleName</em> -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
>
>> <em>exampleName</em> - это собственное название пакетов. Очев, что на английском пишем.
