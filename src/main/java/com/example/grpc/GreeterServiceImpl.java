package com.example.grpc;
import com.example.grpc.Greet.HelloRequest;
import com.example.grpc.Greet.HelloResponse;
import com.example.grpc.GreeterServiceGrpc.GreeterServiceImplBase;

import io.grpc.stub.StreamObserver;


public class GreeterServiceImpl extends GreeterServiceImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        // Извлечение из запроса
        String name = request.getName();
        
        //Формируем сообщение
        String message = "Hello, " + name + "!";

        // Создание обьекта ответа
        HelloResponse response = HelloResponse.newBuilder().setMessage(message).build();

        //Отправляем ответ клиенту
        responseObserver.onNext(response);

        //Завершение отправки
        responseObserver.onCompleted();
    }
}
